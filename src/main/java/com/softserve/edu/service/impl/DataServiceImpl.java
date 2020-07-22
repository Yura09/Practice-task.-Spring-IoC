package com.softserve.edu.service.impl;

import java.util.List;

import com.softserve.edu.entity.Communication;
import com.softserve.edu.entity.Entity;
import com.softserve.edu.entity.Solution;
import com.softserve.edu.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    private List<Entity> students;
    private List<Entity> mentors;
    private List<Entity> sprints;
    private List<Communication> communication;
    private List<Solution> solution;

    public void addStudent(String studentName) {
    students.add(new Entity(studentName));
    }

    public void addMentor(String mentorName) {
       mentors.add(new Entity(mentorName));
    }

    public void addSprint(String sprintName) {
       sprints.add(new Entity(sprintName));
    }

    public void addCommunication(String studentName, String mentorName) {
      communication.add(new Communication(new Entity(studentName).getId(),new Entity(mentorName).getId()));
    }

    public void addSolution(String studentName, String sprintName, int score) {
      solution.add(new Solution(new Entity(studentName).getId(),new Entity(sprintName).getId(),score));
    }

    public List<Entity> getStudents() {
        return students;
    }

    public List<Entity> getMentors() {
        return mentors;
    }

    public List<Entity> getSprints() {
        return sprints;
    }

    public List<Communication> getCommunication() {
        return communication;
    }

    public List<Solution> getSolution() {
        return solution;
    }
    // TODO
}
