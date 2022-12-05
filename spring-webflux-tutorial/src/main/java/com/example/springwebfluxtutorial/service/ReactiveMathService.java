package com.example.springwebfluxtutorial.service;

import com.example.springwebfluxtutorial.model.MathResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ Author NMuchiri
 **/
public interface ReactiveMathService {
    Mono<MathResponse> findSquare(int input);

    Flux<MathResponse> multiplicationTable(int input);
}
