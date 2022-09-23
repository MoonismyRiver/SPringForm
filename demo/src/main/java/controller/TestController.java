package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class TestController {
    @GetMapping("")
    public String demo() {
        return "demo";
    }

    @PostMapping("/submit")
    public ModelAndView Submit(@RequestParam("tigia") int tigia, @RequestParam("USD") int USD) {
        int ketqua= tigia*USD;
        ModelAndView modelAndView = new ModelAndView("ketqua");
        modelAndView.addObject("tigia", tigia);
        modelAndView.addObject("USD", USD);
        modelAndView.addObject("ketqua", ketqua);
        return modelAndView;
    }

}
