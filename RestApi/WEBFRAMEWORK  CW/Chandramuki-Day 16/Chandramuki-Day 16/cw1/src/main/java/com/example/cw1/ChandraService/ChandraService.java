package com.example.cw1.ChandraService;

import org.springframework.stereotype.Service;

@Service
public class ChandraService {

    public void doSomething() {
        System.out.println("Around advice: Executing after doSomething()");
    }
}
