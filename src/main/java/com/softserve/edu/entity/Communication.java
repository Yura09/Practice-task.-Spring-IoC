package com.softserve.edu.entity;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Communication {
    private int idStudent;
    private int idMentor;

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdMentor() {
        return idMentor;
    }

    public void setIdMentor(int idMentor) {
        this.idMentor = idMentor;
    }

    public Communication(int idStudent, int idMentor) {
        this.idStudent = idStudent;
        this.idMentor = idMentor;
    }
    public Communication(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Communication)) return false;
        Communication that = (Communication) o;
        return idStudent == that.idStudent &&
                idMentor == that.idMentor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, idMentor);
    }

    @Override
    public String toString() {
        return "Communication{" +
                "idStudent=" + idStudent +
                ", idMentor=" + idMentor +
                '}';
    }
}
