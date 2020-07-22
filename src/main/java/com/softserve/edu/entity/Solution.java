package com.softserve.edu.entity;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Solution {
    private int idStudent;
    private int idSprint;
    private int score;

    public Solution(int idStudent, int idSprint, int score) {
        this.idStudent = idStudent;
        this.idSprint = idSprint;
        this.score = score;
    }
    public Solution(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return idStudent == solution.idStudent &&
                idSprint == solution.idSprint &&
                score == solution.score;
    }


    @Override
    public int hashCode() {
        return Objects.hash(idStudent, idSprint, score);
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdSprint() {
        return idSprint;
    }

    public void setIdSprint(int idSprint) {
        this.idSprint = idSprint;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "idStudent=" + idStudent +
                ", idSprint=" + idSprint +
                ", score=" + score +
                '}';
    }
}
