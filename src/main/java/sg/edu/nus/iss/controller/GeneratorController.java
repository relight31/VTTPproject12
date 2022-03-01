package sg.edu.nus.iss.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //allows springboot to locate class
@RequestMapping(path={"/currtime"}) //defines path
public class GeneratorController {
    @GetMapping(produces = {"text/html"})
    public String indexPage(Model model){
        model.addAttribute("currTime", (new Date()).toString());
        return "currtime";
    }
}
