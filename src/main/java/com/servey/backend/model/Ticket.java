package com.servey.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
public class Ticket {

    @Id //makes the id value
    @Column //creates new category for ticket
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically adds a new ID number unique to each ticket to identify them
    private Long id;

    @Column
    private String fullName;

    @Column
    private String emailAddress;

    @Column
    private Integer weekNumber;

    @Column
    private String lessonName;

    @Column
    private String studentComment;

    @Column
    private Integer studentRating;

    @Column
    private Boolean studentRecommendation;

    //getters and setters for protecting your data on each variable

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getStudentComment() {
        return studentComment;
    }

    public void setStudentComment(String studentComment) {
        this.studentComment = studentComment;
    }

    public Integer getStudentRating() {
        return studentRating;
    }

    public void setStudentRating(Integer studentRating) {
        this.studentRating = studentRating;
    }

    public Boolean getStudentRecommendation() {
        return studentRecommendation;
    }

    public void setStudentRecommendation(Boolean studentRecommendation) {
        this.studentRecommendation = studentRecommendation;
    }
}
