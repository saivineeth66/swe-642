package com.example.student.service;


import com.example.student.model.StudentSurvey;

import java.util.List;

public interface SurveyService {
    public StudentSurvey saveSurvey(StudentSurvey student);
    public List<StudentSurvey> getAllStudentSurvey();
}
