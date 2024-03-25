package com.fit.se.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "mentors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mentor {

    @Id

    private int MentorId;

    private String Name;

    private String Address;




}
