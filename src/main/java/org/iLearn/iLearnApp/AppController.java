package org.iLearn.iLearnApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("/profile")
    public String profile(){
        return "profile";
    }

    @RequestMapping("/exam")
    public String exam(){
        return "exam";
    }

    @RequestMapping("/exam-list")
    public String examList(){
        return "exam-list";
    }

    @RequestMapping("/exam-book")
    public String examBOok(){
        return "exam-book";
    }

}
