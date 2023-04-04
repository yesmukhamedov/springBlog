package test.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    @GetMapping("/")
    public String findAll(Model model) {
        model.addAttribute("list", "list qoi");
        return "home";
    }
}
