package org.iLearn.iLearnApp.controller;

import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProfileController {
    @Autowired
    private UserRegistredRepository userRegistredRepository;

    @RequestMapping("/profile/{username}")
    public String profilePage(@PathVariable("username") String username, Model model) {
        Optional<UserRegistred> userRegistred = userRegistredRepository.findByUsername(username);
        userRegistred.ifPresent(user -> model.addAttribute("userRegistred", user));
        return "profile";
    }

    // Page redirect
    @GetMapping("/editProfile/{username}")
    public String profileEdit(@PathVariable String username, Model model) {
        Optional<UserRegistred> optionalUserRegistred = userRegistredRepository.findByUsername(username);

        if (optionalUserRegistred.isPresent()) {
            UserRegistred user = optionalUserRegistred.get();
            model.addAttribute("userRegistred", user);
            model.addAttribute("email", user.getEmail());
            return "editProfile";
        } else {
            return "profile_not_found";
        }
    }

    // Form submission
    @PostMapping("/editProfile/{username}")
    public String handleProfileEdit(@PathVariable("username") String username,
                                    @RequestParam("email") String email,
                                    @RequestParam("telephoneNumber") String telephoneNumber,
                                    @RequestParam("address") String address,
                                    @RequestParam("city") String city,
                                    Model model) {
        Optional<UserRegistred> optionalUser = userRegistredRepository.findByUsername(username);

        if (optionalUser.isPresent()) {
            UserRegistred user = optionalUser.get();
            user.setEmail(email);
            user.setAddress(address);
            user.setCity(city);
            user.setTelephoneNumber(telephoneNumber);
            userRegistredRepository.save(user);
            model.addAttribute("userRegistred",user);
            return "redirect:/profile/" + username;
        } else {
            // User not found, you can redirect to an error page or handle it as needed
            return "profile_not_found";
        }
    }
}

