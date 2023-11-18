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

    @Override
    public void deleteSurvey(int id) {
        studentRep.deleteById(id);
    }

    @Override
    public StudentSurvey updateSurvey(int id, StudentSurvey studentSurvey) {
        StudentSurvey existingSurvey = studentRep.findById(id).orElseThrow(
                () -> new RuntimeException("Survey not found"));

        // Update each field
        existingSurvey.setUserName(studentSurvey.getUserName());
        existingSurvey.setStreetAddress(studentSurvey.getStreetAddress());
        existingSurvey.setCity(studentSurvey.getCity());
        existingSurvey.setState(studentSurvey.getState());
        existingSurvey.setZipCode(studentSurvey.getZipCode());
        existingSurvey.setPhoneNumber(studentSurvey.getPhoneNumber());
        existingSurvey.setEmail(studentSurvey.getEmail());
        existingSurvey.setDateOfSurvey(studentSurvey.getDateOfSurvey());
        existingSurvey.setCampus(studentSurvey.isCampus());
        existingSurvey.setAtmosphere(studentSurvey.isAtmosphere());
        existingSurvey.setDormRooms(studentSurvey.isDormRooms());
        existingSurvey.setStudents(studentSurvey.isStudents());
        existingSurvey.setLocation(studentSurvey.isLocation());
        existingSurvey.setSports(studentSurvey.isSports());
        existingSurvey.setInterest(studentSurvey.getInterest());
        existingSurvey.setLikelihoodToRecommend(studentSurvey.getLikelihoodToRecommend());
        existingSurvey.setComments(studentSurvey.getComments());

        return studentRep.save(existingSurvey);
    }


}
