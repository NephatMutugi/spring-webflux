package com.example.springwebfluxtutorial.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ Author NMuchiri
 **/
@Component
@Slf4j
public class SleepUtil {


    public static void sleepSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000L);

        } catch (InterruptedException e) {
            log.error(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
