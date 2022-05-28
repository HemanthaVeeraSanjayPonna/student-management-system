package com.prathyusha.studentmanagementsystem.entites;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Value
public class Subject {

    @Id
    private Long subjectId;
    @OneToMany()
    @JoinColumn(
            name = "subject_id",
            referencedColumnName = "subjectId"
    )
    private List<Marks> marks;
    private String name;
}
