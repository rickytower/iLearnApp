package org.iLearn.iLearnApp.controller;

import org.apache.catalina.User;
import org.iLearn.iLearnApp.model.entity.*;
import org.iLearn.iLearnApp.model.repository.ExamRepository;
import org.iLearn.iLearnApp.model.repository.StudentRegistrationRepository;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ExamController {
    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;
    @Autowired
    private UserRegistredRepository userRegistredRepository;


    @GetMapping("/exam/{username}")
    public String getExamList(@PathVariable("username") String username, Model model) {
        Optional<UserRegistred> userRegistred = userRegistredRepository.findByUsername(username);
        Student student = null;
        if(userRegistred.isPresent()){
            student = ((Student) userRegistred.get());
            model.addAttribute("userRegistred",userRegistred.get());
        }
        List<Exam> acceptedExams = getExams(student, ExamStatus.ACCEPTED);
        model.addAttribute("acceptedExams", acceptedExams);
        List<Exam> pendingExams = getExams(student, ExamStatus.PENDING);
        model.addAttribute("pendingExams", pendingExams);
        List<Exam> availableExams = getExams(student, ExamStatus.AVAILABLE);
        model.addAttribute("enrolledExams", availableExams);
        List<Exam> enrolledExams = getExams(student, ExamStatus.ENROLLED);
        return "exam";
    }


    private List<Exam> getExams(Student student, ExamStatus examStatus){
        List<Exam> acceptedExams = new ArrayList<>();
        studentRegistrationRepository.findByStudentAndExamStatus(student,examStatus).forEach(studentRegistration -> acceptedExams.add(studentRegistration.getExam()));
        return acceptedExams;
    }

}
