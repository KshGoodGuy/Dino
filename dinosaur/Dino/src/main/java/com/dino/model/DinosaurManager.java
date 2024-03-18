package com.dino.model;

import java.util.ArrayList;

public class DinosaurManager {
    private ArrayList<Dinosaur> dinosaurs;

    public DinosaurManager() {
        dinosaurs = new ArrayList<>();
        initializeDinosaurs();
    }

    private void initializeDinosaurs() {
        ArrayList<Dinosaur> tyrannosaurs = new ArrayList<>();
        tyrannosaurs.add(new Dinosaur("렉스", "티라노사우르스", 12.3, 8000));
        tyrannosaurs.add(new Dinosaur("티나", "티라노사우르스", 11.5, 7000));
        tyrannosaurs.add(new Dinosaur("톰", "티라노사우르스", 12.0, 7500));
        tyrannosaurs.add(new Dinosaur("테리", "티라노사우르스", 13.0, 8100));

        ArrayList<Dinosaur> velociraptors = new ArrayList<>();
        velociraptors.add(new Dinosaur("비키", "벨로키랍토르", 2.0, 15));
        velociraptors.add(new Dinosaur("바이올렛", "벨로키랍토르", 2.1, 17));
        velociraptors.add(new Dinosaur("빅토리아", "벨로키랍토르", 2.2, 16));
        velociraptors.add(new Dinosaur("빅터", "벨로키랍토르", 2.3, 18));
        
        ArrayList<Dinosaur> spinosaurus = new ArrayList<>();// 스피노사우르스
        spinosaurus.add(new Dinosaur("스파이크", "스피노사우르스", 6.7, 99));
        spinosaurus.add(new Dinosaur("렉시", "스피노사우르스", 6.5, 87 ));
        spinosaurus.add(new Dinosaur("로라", "스피노사우르스", 3.4, 43));
        spinosaurus.add(new Dinosaur("촘피", "스피노사우르스", 2.3, 22));
        
        ArrayList<Dinosaur> pteranodon = new ArrayList<>(); //프테라노돈
        pteranodon.add(new Dinosaur("뽀삐", "프테라노돈", 9.1, 66));
        pteranodon.add(new Dinosaur("삐삐", "프테라노돈", 29.1, 236));
        pteranodon.add(new Dinosaur("쵸비", "프테라노돈", 19.1, 141));
        pteranodon.add(new Dinosaur("케리아", "프테라노돈", 8.1, 59));
        
        ArrayList<Dinosaur> triceratops = new ArrayList<>(); //트리케라톱스
        triceratops.add(new Dinosaur("제우스", "트리케라톱스", 42, 119));
        triceratops.add(new Dinosaur("오너", "트리케라톱스", 37, 122));
        triceratops.add(new Dinosaur("페이커", "트리케라톱스", 41, 112));
        triceratops.add(new Dinosaur("구마유시", "트리케라톱스", 59, 99));

        dinosaurs.addAll(tyrannosaurs);
        dinosaurs.addAll(velociraptors);
        dinosaurs.addAll(triceratops);
        dinosaurs.addAll(spinosaurus);
        dinosaurs.addAll(pteranodon);
    }
    public ArrayList<Dinosaur> getAllDinosaurs() {
        return dinosaurs;
    }
}