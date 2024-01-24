package org.iLearn.iLearnApp.controller;

import org.apache.catalina.User;
import org.iLearn.iLearnApp.model.entity.*;
import org.iLearn.iLearnApp.model.repository.ExamRepository;
import org.iLearn.iLearnApp.model.repository.StudentRegistrationRepository;
import org.iLearn.iLearnApp.model.repository.StudentRepository;
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
    private StudentRepository studentRepository;


    @GetMapping("/exam/{username}")
    public String getExamList(@PathVariable("username") String username, Model model) {
        Optional<Student> optionalStudent = studentRepository.findByUsername(username);
        if (optionalStudent.isPresent()) {

            model.addAttribute("userRegistred",optionalStudent.get());

            List<Exam> acceptedExams = getExams(optionalStudent.get(), ExamStatus.ACCEPTED);
            model.addAttribute("acceptedExams", acceptedExams);

            List<Exam> pendingExams = getExams(optionalStudent.get(), ExamStatus.PENDING);
            model.addAttribute("pendingExams", pendingExams);

            List<Exam> availableExams = getExams(optionalStudent.get(), ExamStatus.AVAILABLE);
            model.addAttribute("availableExams", availableExams);

            List<Exam> enrolledExams = getExams(optionalStudent.get(), ExamStatus.ENROLLED);
            model.addAttribute("enrolledExams",enrolledExams);
        }
        return "exam";
    }


    private List<Exam> getExams(Student student, ExamStatus examStatus) {
        List<Exam> acceptedExams = new ArrayList<>();
        studentRegistrationRepository.findByStudentAndExamStatus(student, examStatus).forEach(studentRegistration -> acceptedExams.add(studentRegistration.getExam()));
        return acceptedExams;
    }

}
