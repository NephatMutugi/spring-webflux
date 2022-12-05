package com.example.springwebfluxtutorial.service.impl;

import com.example.springwebfluxtutorial.model.MathResponse;
import com.example.springwebfluxtutorial.service.ReactiveMathService;
import com.example.springwebfluxtutorial.utils.SleepUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ Author NMuchiri
 **/
@Service
@Slf4j
public class ReactiveMathServiceImpl implements ReactiveMathService {

    @Override
    public Mono<MathResponse> findSquare(int input) {
        return Mono.fromSupplier(() -> input * input)
                .map(MathResponse::new);
    }

    @Override
    public Flux<MathResponse> multiplicationTable(int input) {
        return Flux.range(1, 10)
                .doOnNext(i -> SleepUtil.sleepSeconds(1))
                .doOnNext(i -> log.info("Reactive math service processing : {}", i))
                .map(i -> new MathResponse(i * input));
    }
}
