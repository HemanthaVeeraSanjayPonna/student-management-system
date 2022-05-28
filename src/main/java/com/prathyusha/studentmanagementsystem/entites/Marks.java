package com.prathyusha.studentmanagementsystem.entites;

import lombok.Value;

import javax.persistence.*;

@Entity
@Value
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long marksId;
    private int marks;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "user_id",referencedColumnName = "userId"
    )
    private User user;
}
