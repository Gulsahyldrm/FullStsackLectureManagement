package com.example.FullStackLectureManagement.entity;

import com.example.FullStackLectureManagement.entity.enums.Gender;
import com.example.FullStackLectureManagement.entity.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column(name = "identity_no",length = 11,unique = true)
    private String identityNo;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "urole")
    @Enumerated(EnumType.STRING)
    private Role role;
}
