package com.fit.se.controller;

import com.fit.se.entity.Mentor;
import com.fit.se.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MentorController {

    @Autowired
    private MentorService mentorService;

    @PostMapping("/mentors")
    public ResponseEntity<?> saveMentor(@RequestBody Mentor mentor) {
        return ResponseEntity.ok(mentorService.saveMentor(mentor));
    }

    @GetMapping("/mentors/{MentorId}")
    public ResponseEntity<?> getMentorById(@PathVariable("MentorId") int mentorId) {
        return ResponseEntity.ok(mentorService.getMentorById(mentorId));
    }

    @GetMapping("/mentors")
    public ResponseEntity<?> getListMentors() {
        return ResponseEntity.ok(mentorService.getListMentors());
    }

}
