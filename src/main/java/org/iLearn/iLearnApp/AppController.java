package org.iLearn.iLearnApp;

import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
    @Autowired

 private UserRegistredRepository userRegistredRepository;
    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("login")
    public String loginPage(@RequestParam("username")String username, @RequestParam("password") String password){

        /**
         * 1. sarch a user with the given username and assing it to userRegistred
         * 2. compare userRegistred password with the given one
         * 3. if they correspond, it proceeds to show the profile, else it returns the login page.
         */
        if(userRegistredRepository.findByUsernameAndPassword(username, password).isPresent()){
            UserRegistred userRegistred = userRegistredRepository.findByUsernameAndPassword(username, password).get();
            if(username.equals(userRegistred.getUsername()) && password.equals(userRegistred.getPassword())){
                return "profile";
            }
        }else{
            System.out.println("Username / Password wrong. Please check the credentials.");
        }
        return "login";
    }

}

/* CHAT GPT PROPOSE
package org.iLearn.iLearnApp;

import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class AppController {

    @Autowired
    private UserRegistredRepository userRegistredRepository;

    @Autowired
    private HttpSession session;

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("login")
    public String loginPage(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {

        Optional<UserRegistred> userOptional = userRegistredRepository.findByUsernameAndPassword(username, password);

        if (userOptional.isPresent()) {
            UserRegistred userRegistred = userOptional.get();
            session.setAttribute("loggedInUser", userRegistred);
            model.addAttribute("student", userRegistred); // Add the user to the model for Thymeleaf
            return "profile";
        } else {
            System.out.println("Username / Password wrong. Please check the credentials.");
            return "login";
        }
    }
}

 */