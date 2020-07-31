package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversionController {

    @GetMapping("/calculate")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(@RequestParam double rate, @RequestParam double usd, Model model) {

        double vnd = usd * rate;
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);

        ModelAndView modelAndView = new ModelAndView("index", "modelConversion", model);

        return modelAndView;
    }
}
