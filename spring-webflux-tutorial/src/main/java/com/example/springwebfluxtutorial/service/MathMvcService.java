package com.example.springwebfluxtutorial.service;

import com.example.springwebfluxtutorial.model.MathResponse;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public interface MathMvcService {

    MathResponse findSquare(int input);

    List<MathResponse> multiplicationTable(int input);
}
