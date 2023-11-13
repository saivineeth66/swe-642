package com.example.student.service;

import com.example.student.model.StudentSurvey;
import com.example.student.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImp implements SurveyService {

    @Autowired
    private studentRepository studentRep;

    @Override
    public StudentSurvey saveSurvey(StudentSurvey student) {
        return studentRep.save(student);
    }

    @Override
    public List<StudentSurvey> getAllStudentSurvey(){
        return studentRep.findAll();

    }

}
