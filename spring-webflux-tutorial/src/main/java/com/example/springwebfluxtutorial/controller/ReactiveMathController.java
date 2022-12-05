package com.example.springwebfluxtutorial.controller;

import com.example.springwebfluxtutorial.model.MathResponse;
import com.example.springwebfluxtutorial.service.ReactiveMathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ Author NMuchiri
 **/
@RestController
@RequestMapping("api/v1/reactive")
public class ReactiveMathController {

    private final ReactiveMathService mathService;

    public ReactiveMathController(ReactiveMathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/square/{input}")
    public Mono<MathResponse> findSquare(@PathVariable int input) {
        return mathService.findSquare(input);
    }

    @GetMapping("/multiplication/{input}")
    public Flux<MathResponse> findMultiplicationTable(@PathVariable int input) {
        return mathService.multiplicationTable(input);
    }
}
