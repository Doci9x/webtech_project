package htwberlin.webtech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
    @GetMapping(path = "/")
    public ModelAndView showOurPage() {
        return new ModelAndView("helloworld");
    }

}
