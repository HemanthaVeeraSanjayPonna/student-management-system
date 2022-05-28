package com.prathyusha.studentmanagementsystem.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class StudentMarksAddRequest {
    private List<StudentMarks> studentMarks;
}
