package com.example.student.repository;

import com.example.student.model.StudentSurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface studentRepository extends JpaRepository<StudentSurvey, Integer> {


}
