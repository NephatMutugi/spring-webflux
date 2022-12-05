package com.example.springwebfluxtutorial.service.impl;

import com.example.springwebfluxtutorial.model.MathResponse;
import com.example.springwebfluxtutorial.service.MathMvcService;
import com.example.springwebfluxtutorial.utils.SleepUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @ Author NMuchiri
 **/
@Service
@Slf4j
public class MathMvcServiceImpl implements MathMvcService {

    @Override
    public MathResponse findSquare(int input) {
        return new MathResponse(input * input);
    }



    // Demo time-consuming nature when we don't use reactive spring
    @Override
    public List<MathResponse> multiplicationTable(int input) {
        return IntStream.rangeClosed(1, 10)
                .peek(i -> SleepUtil.sleepSeconds(1))
                .peek(i -> log.info("Math service processing element : {}", i))
                .mapToObj(i -> new MathResponse(i * input))
                .collect(Collectors.toList());
    }

}
