package com.example.springwebfluxtutorial.model;

import lombok.Data;

import java.util.Date;

/**
 * @ Author NMuchiri
 **/
@Data
public class MathResponse {
    private Date date;
    private int output;

    public MathResponse(int output) {
        this.output = output;
    }
}
