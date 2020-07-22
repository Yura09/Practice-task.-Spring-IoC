package com.softserve.edu.service.impl;

import com.softserve.edu.dto.AverageScore;
import com.softserve.edu.dto.MentorStudent;
import com.softserve.edu.dto.SprintScore;
import com.softserve.edu.dto.StudentScore;
import com.softserve.edu.entity.Entity;
import com.softserve.edu.entity.Solution;
import com.softserve.edu.service.DataService;
import com.softserve.edu.service.MarathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarathonServiceImpl implements MarathonService {

    private DataService dataService;

    @Autowired
    public MarathonServiceImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public List<String> getStudents() {

        return dataService.getStudents().stream().map(Entity::getName).collect(Collectors.toList());
    }

    public List<String> getMentors() {
        return dataService.getMentors().stream().map(Entity::getName).collect(Collectors.toList());
    }

    public StudentScore studentResult(String studentName) {
        return null;
       /* StudentScore studentScore = new StudentScore();
        List<Solution> solution = dataService.getSolution();
        List<Entity> sprints = dataService.getSprints();
        List<SprintScore> sprintScores = new ArrayList<>();
        sprintScores.add(new SprintScore(new Entity(sprints.get(0).getName()).getName(),solution.get(0).getScore()));
       */
    }

    public List<StudentScore> allStudentsResult() {
        // TODO
        return null;
    }

    public AverageScore studentAverage(String studentName) {
        // TODO
        return null;
    }

    public List<AverageScore> allStudentsAverage() {
        // TODO
        return null;
    }

    public MentorStudent mentorStudents(String mentorName) {
        /*MentorStudent mentorStudent = new MentorStudent();
        mentorStudent.setMentorName(mentorName);*/

        return null;
    }
}
