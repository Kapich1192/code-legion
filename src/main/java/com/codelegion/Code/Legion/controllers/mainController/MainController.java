package com.codelegion.Code.Legion.controllers.mainController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "test");
        return "pages/home";
    }

//    @PostMapping("/general")
//    public void answerGeneral(Model model) {
//
//    }
//    @DeleteMapping("/general")
//    public void deleteGeneral(Model model) {
//
//    }
//    @PutMapping("/general")
//    public void correctAnswer(Model model) {
//
//    }
//    @PatchMapping("/general")
//    public void patchGeneral(Model model) {
//
//    }
}
