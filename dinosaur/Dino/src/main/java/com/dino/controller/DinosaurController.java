package com.dino.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dino.model.Dinosaur;
import com.dino.model.DinosaurManager;

@Controller
public class DinosaurController {

    private DinosaurManager dinosaurManager = new DinosaurManager();

    @GetMapping("/dinosaurs")
    public String showDinosaurs(Model model) {
        ArrayList<Dinosaur> dinosaurs = dinosaurManager.getAllDinosaurs();
        model.addAttribute("dinosaurs", dinosaurs);
        return "dinosaurs"; 
    }
}
