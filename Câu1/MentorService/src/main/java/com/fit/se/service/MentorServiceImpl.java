package com.fit.se.service;

import com.fit.se.entity.Mentor;
import com.fit.se.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MentorServiceImpl implements MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    @Override
    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    @Override
    public List<Mentor> getListMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public Mentor getMentorById(int mentorId) {
        return mentorRepository.findById(mentorId).get();
    }
}
