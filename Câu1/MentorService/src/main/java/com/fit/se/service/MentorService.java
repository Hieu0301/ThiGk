package com.fit.se.service;

import com.fit.se.entity.Mentor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MentorService {

    public Mentor saveMentor(Mentor mentor);

    public List<Mentor> getListMentors();

    public Mentor getMentorById(int mentorId);

}
