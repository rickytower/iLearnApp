package org.iLearn.iLearnApp.controller;

import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ProfileController {
    @Autowired
    private UserRegistredRepository userRegistredRepository;

    @RequestMapping("/profile/{id}")
    public String profilePage(@PathVariable("id") Long id, Model model) {
        Optional<UserRegistred> userRegistred = userRegistredRepository.findById(id);
        userRegistred.ifPresent(user -> model.addAttribute("userRegistred", user));
        return "profile";
    }

    @RequestMapping("/profile/{id}/edit")
    public String profileEditPage(@PathVariable("id") Long id, @RequestParam("email") String email,
                                  @RequestParam("telephoneNumber") String telephoneNumber, @RequestParam("address") String address,
                                  @RequestParam("city") String city,
                                  Model model) {
        Optional<UserRegistred> userRegistred = userRegistredRepository.findById(id);
        if(userRegistred.isPresent()){
            UserRegistred u = userRegistred.get();
            u.setEmail(email);
            u.setAddress(address);
            u.setCity(city);
            u.setTelephoneNumber(telephoneNumber);
            userRegistredRepository.save(u);
            return "profile";
        }
        return null;
    }
}
