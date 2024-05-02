package com.example.cw2.ChandraService;

import org.springframework.stereotype.Service;

@Service
public class ChandraService {

    public String process(String input) {
        System.out.println("Processing: " + input);
        return "Processed: " + input;
    }
}
