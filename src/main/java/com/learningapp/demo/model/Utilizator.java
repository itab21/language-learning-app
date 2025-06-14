package com.learningapp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilizator {
    private String nume;
    private int varsta;
    private String limbaStudiata;
    private double progres;
    private Curs curs;


}
