package com.servey.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
public class Ticket {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fullName;

    @Column
    private Long emailAddress;

    @Column
    private Integer weekNumber;

    @Column
    private Long lessonName;

    @Column
    private String studentComment;

    @Column
    private Integer studentRating;

    @Column
    private Boolean studentRecommendation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Long emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public Long getLessonName() {
        return lessonName;
    }

    public void setLessonName(Long lessonName) {
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
