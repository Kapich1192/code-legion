package com.codelegion.Code.Legion.controllers.accountController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    @GetMapping("/account")
    public String account(Model model) {
        return "pages/profile";
    }

//    @PostMapping("/account")
//    public void answerAccount(Model model) {
//
//    }
//    @DeleteMapping("/account")
//    public void deleteAccount(Model model) {
//
//    }
//    @PutMapping("/account")
//    public void correctAccount(Model model) {
//
//    }
//    @PatchMapping("/account")
//    public void patchAccount(Model model) {
//
//    }


//    public void getStatusTest() {
//        // todo получить лвл
//        // todo получить значение активности
//        // todo раса
//        // todo если есть баф
//    }



}
