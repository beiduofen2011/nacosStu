package com.fen.dou.service;

import com.fen.dou.aop.LockM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Bservice {

    @Autowired
    private Aservice aservice;

//    @Async
//    @LockM
    @Transactional
    public  void say(){
        System.out.println("--------A--------");
    }
}
