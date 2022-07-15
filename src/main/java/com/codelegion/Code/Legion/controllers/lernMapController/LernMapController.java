package com.codelegion.Code.Legion.controllers.lernMapController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class LernMapController {
    @GetMapping("/learn")
    public String learn(Model model) {

        return "pages/learn";
    }
//    @PostMapping("/lern")
//    public void answer(Model model) {
//
//    }
//    @DeleteMapping("/lern")
//    public void deleteAnswer(Model model) {
//
//    }
//    @PutMapping("/lern")
//    public void correctAnswer(Model model) {
//
//    }
    //todo получение массива на материалы
    //todo получение массива инструкций
    //todo получение массива на лекции
}
