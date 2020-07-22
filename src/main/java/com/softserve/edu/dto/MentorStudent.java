package com.softserve.edu.dto;

import java.util.List;
import java.util.Objects;

public class MentorStudent {
    private String mentorName;
    private List<String> studentNames;

    public MentorStudent(String mentorName, List<String> studentNames) {
        this.mentorName = mentorName;
        this.studentNames = studentNames;
    }
    public MentorStudent(){}

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MentorStudent)) return false;
        MentorStudent that = (MentorStudent) o;
        return Objects.equals(mentorName, that.mentorName) &&
                Objects.equals(studentNames, that.studentNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mentorName, studentNames);
    }

    @Override
    public String toString() {
        return "MentorStudent{" +
                "mentorName='" + mentorName + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
