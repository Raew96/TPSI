package wizut.tpsi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model)
    {
        Map< String, String > operacje = new HashMap<String, String>();
        operacje.put("addition", "DODAWANIE");
        operacje.put("subtraction", "ODEJMOWANIE");
        operacje.put("multiplication", "MNOZENIE");

        model.addAttribute("operacjeMap", operacje);
        return "home";
    }
    @RequestMapping("/hello")
    public String hello(Model model, String imie, Integer wiek) {

        model.addAttribute("imie", imie);
        model.addAttribute("wiek", wiek);

        return "hello";
    }


}
