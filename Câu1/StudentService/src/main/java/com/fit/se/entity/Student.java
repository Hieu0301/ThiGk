package com.fit.se.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;

    private String Name;

    private int  Age;

    private int MentorId;

}
