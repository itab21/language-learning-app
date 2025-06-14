package com.learningapp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lectie {
    private String titlu;
    private String continut;
    private int durataMinute;
    private boolean finalizata;
    private Curs curs;
}
