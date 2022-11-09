package com.example.audia5.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TuningController {

    int power = 190;

    String color = "Gruen";


    @GetMapping("/morepowerbaby")
    public String morePowerBaby(int adds) {
        power += adds;
        return "Your vehicle now has " + power + " PS";
    }

    @GetMapping("/color")
    public String changeColor(String color) {
        this.color = color;
        return "The vehicle is now " + this.color;
    }

}
