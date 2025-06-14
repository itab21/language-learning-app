package com.learningapp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curs {
    private String nume;
    private String nivel;
    private List<Lectie> lectii;
    private List<Test> teste;
}
