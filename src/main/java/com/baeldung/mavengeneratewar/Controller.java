package com.baeldung.mavengeneratewar;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    @GetMapping("/")
    public String viewIndexPage() {
   //     model.addAttribute("header", "Maven Generate War");
        return "index";
    }
}
