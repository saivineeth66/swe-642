package com.example.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class StudentSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    // Assuming userName is a concatenation of firstName and lastName
    // You might need to split 'userName' into 'firstName' and 'lastName' in your application logic
    @Getter @Setter
    private String userName;

    @Getter @Setter
    private String streetAddress;

    @Getter @Setter
    private String city;

    @Getter @Setter
    private String state;

    @Getter @Setter
    private String zipCode;

    @Getter @Setter
    private String phoneNumber;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String dateOfSurvey;

    // The 'aspects' can be handled differently depending on how you want to store them
    // If they are stored as individual boolean columns:
    @Getter @Setter
    private boolean campus;

    @Getter @Setter
    private boolean atmosphere;

    @Getter @Setter
    private boolean dormRooms;

    @Getter @Setter
    private boolean students;

    @Getter @Setter
    private boolean location;

    @Getter @Setter
    private boolean sports;

    // For 'interest', make sure the values match the radio button options
    @Getter @Setter
    private String interest;

    // Assuming 'likelihoodToRecommend' corresponds to the dropdown list
    @Getter @Setter
    private String likelihoodToRecommend;

    // Assuming 'comments' corresponds to the additional comments
    @Getter @Setter
    private String comments;

    // Constructors, getters, and setters
}
