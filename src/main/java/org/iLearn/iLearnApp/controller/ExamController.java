package org.iLearn.iLearnApp.controller;

import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.ExamRepository;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ExamController {
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private UserRegistredRepository userRegistredRepository;


    @GetMapping("/exam/{id}")
    public String getExamList(@PathVariable("id") Long id, Model model) {
        Optional<UserRegistred> userRegistred = userRegistredRepository.findById(id);
        userRegistred.ifPresent(user -> model.addAttribute("userRegistred", user));

        return "exam";
    }

}
