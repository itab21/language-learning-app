package com.learningapp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    private String intrebare;
    private String[] optiuni;
    private String raspunsCorect;
    private Curs curs;
}
