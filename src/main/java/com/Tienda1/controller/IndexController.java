package com.Tienda1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model) {
        
        // Propiedad, valor
        model.addAttribute("nombre", "Jose Pablo");
        //model.addAttribute("Apellido", "20");
        //model.addAttribute("edad", "20");
        return "index";
    }
    
}
