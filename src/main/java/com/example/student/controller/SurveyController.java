package com.example.student.controller;

import com.example.student.model.StudentSurvey;
import com.example.student.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/v1/survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping("/addsurvey")
    public ResponseEntity<?> add(@RequestBody StudentSurvey studentSurvey){
        try {
            surveyService.saveSurvey(studentSurvey);
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Survey Added Successfully"));
        } catch (Exception e) {
            // Handle exception, e.g., return an error message with a different status code
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", "Error adding survey"));
        }
    }

    @GetMapping("/getallsurveys")
    public ResponseEntity<List<StudentSurvey>> getAllSurvey() {
        try {
            List<StudentSurvey> surveys = surveyService.getAllStudentSurvey();
            return ResponseEntity.ok(surveys); // 200 OK with survey list in the body
        } catch (Exception e) {
            // Handle exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500 Internal Server Error
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSurvey(@PathVariable int id) {
        try {
            surveyService.deleteSurvey(id);
            return ResponseEntity.ok("Survey Deleted Successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting survey");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateSurvey(@PathVariable int id, @RequestBody StudentSurvey studentSurvey) {
        try {
            StudentSurvey updatedSurvey = surveyService.updateSurvey(id, studentSurvey);
            return ResponseEntity.ok(updatedSurvey);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating survey");
        }
    }



}
