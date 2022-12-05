package com.example.springwebfluxtutorial.controller;

import com.example.springwebfluxtutorial.model.MathResponse;
import com.example.springwebfluxtutorial.service.MathMvcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
@RestController
@RequestMapping("api/v1")
public class MathController {

    private final MathMvcService mathMvcService;

    public MathController(MathMvcService mathMvcService) {
        this.mathMvcService = mathMvcService;
    }

    @GetMapping("/square/{input}")
    public MathResponse findSquare(@PathVariable int input){
        return mathMvcService.findSquare(input);
    }

    @GetMapping("/multiplication/{input}")
    public List<MathResponse> findMultiplicationTable(@PathVariable int input){
        return mathMvcService.multiplicationTable(input);
    }
}
