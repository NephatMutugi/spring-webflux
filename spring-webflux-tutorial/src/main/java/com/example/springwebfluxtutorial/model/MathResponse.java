package com.example.springwebfluxtutorial.model;

import lombok.Data;

import java.util.Date;

/**
 * @ Author NMuchiri
 **/
@Data
public class MathResponse {
    private Date date = new Date();
    private int output;

    public MathResponse(int output) {
        this.output = output;
    }
}
