package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

@Controller
public class TranslateController {

    public static Dictionary<String, String> dictionary = new Hashtable();
    static {
        dictionary.put("hello", "Xin Chao");
        dictionary.put("english", "Tieng Anh");
        dictionary.put("city", "Thanh Pho");
    }

    @GetMapping("/translate")
    public String index() {
        return "index";
    }

    @PostMapping("/translate")
    public ModelAndView translate(@RequestParam String english, Model model) {
        String vietnamese = dictionary.get(english.toLowerCase());

        if (vietnamese == null) {
            vietnamese = "Not found";
        }

        model.addAttribute("english", english);
        model.addAttribute("vietnamese", vietnamese);

        return new ModelAndView("index", "modelTranslator", model);
    }
}
