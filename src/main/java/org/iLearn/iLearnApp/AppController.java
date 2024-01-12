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
        if(userRegistredRepository.findByUsernameAndPassword(username, password).isPresent()){
            UserRegistred userRegistred = userRegistredRepository.findByUsernameAndPassword(username, password).get();
            if(username.equals(userRegistred.getUsername()) && password.equals(userRegistred.getPassword())){
                return "profile";
            }
        }else{
            System.out.println("l'utente non è registrato o ha inserito le credenziali sbagliate");
        }
        return "login";
    }

}