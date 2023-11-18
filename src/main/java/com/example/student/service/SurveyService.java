package com.example.student.service;


import com.example.student.model.StudentSurvey;

import java.util.List;

public interface SurveyService {
    StudentSurvey saveSurvey(StudentSurvey student);
    List<StudentSurvey> getAllStudentSurvey();

    void deleteSurvey(int id);
    StudentSurvey updateSurvey(int id, StudentSurvey studentSurvey);
}
