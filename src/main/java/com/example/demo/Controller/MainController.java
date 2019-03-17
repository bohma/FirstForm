package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class MainController {
    @GetMapping("/test")
    public String getTestPage() {
        return "test";
    }

    @GetMapping("/first")
    public String getFirstSite() {
        return "first";
    }

    @GetMapping("/second")
    public String getSecondSite() {
        return "second";
    }

    @PostMapping("/zoho")
    public String postZoho(@RequestParam String email,
                           @RequestParam String lname,
                           @RequestParam String company,
                           @RequestParam String city,
                           @RequestParam String type,
                           Model model){

        model.addAttribute("email",email);
        model.addAttribute("lname",lname);
        model.addAttribute("company",company);
        model.addAttribute("city",city);
        model.addAttribute("type",type);

        return "zoho";
    }
}
