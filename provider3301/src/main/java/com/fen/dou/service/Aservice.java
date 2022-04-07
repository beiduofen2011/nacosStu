package com.fen.dou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Aservice {
    @Autowired
    private Bservice bservice;

    @Autowired
    private Cservice cservice;
    @Transactional
    public  void say(){
        System.out.println("--------A--------");
    }
}
