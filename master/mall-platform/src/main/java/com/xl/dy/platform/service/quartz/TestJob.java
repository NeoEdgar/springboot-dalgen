package com.xl.dy.platform.service.quartz;

import org.springframework.stereotype.Service;

/**
 * Created by JT on 2018/05/21.
 */
@Service
public class TestJob {

    public void execute(){
        System.out.println("start");
    }
}
