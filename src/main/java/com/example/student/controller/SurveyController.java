package com.example.student.controller;

import com.example.student.model.StudentSurvey;
import com.example.student.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping("/addsurvey")
    public String add(@RequestBody StudentSurvey studentSurvey){
        surveyService.saveSurvey(studentSurvey);
        return "Survey Added Successfully";
    }

    @GetMapping("/getAll")
    public List<StudentSurvey> getAllSurvey(){
        return surveyService.getAllStudentSurvey();
    }



}
