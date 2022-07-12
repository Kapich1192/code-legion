package com.codelegion.Code.Legion.controllers.systemController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SystemController {
    @GetMapping("/404")
    public String page404(Model model) {
        return "system/404page";
    }

    @GetMapping("/pageDevelop")
    public String pageDevelop(Model model) {
        return "system/pageDevelop";
    }
}
