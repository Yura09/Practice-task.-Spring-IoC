package com.softserve.edu.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentScore {
    private String studentName;
    private List<SprintScore> sprintScore;

    public StudentScore(String studentName, List<SprintScore> sprintScore) {
        this.studentName = studentName;
        this.sprintScore = sprintScore;
    }
public StudentScore(){
        sprintScore=new ArrayList<>();
}
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<SprintScore> getSprintScore() {
        return sprintScore;
    }

    public void setSprintScore(List<SprintScore> sprintScore) {
        this.sprintScore = sprintScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentScore)) return false;
        StudentScore that = (StudentScore) o;
        return Objects.equals(studentName, that.studentName) &&
                Objects.equals(sprintScore, that.sprintScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, sprintScore);
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "studentName='" + studentName + '\'' +
                ", sprintScore=" + sprintScore +
                '}';
    }
}
