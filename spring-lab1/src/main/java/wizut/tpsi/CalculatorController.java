package wizut.tpsi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {


    @RequestMapping("/calculator")
    public String home(Model model, Integer number_a, Integer number_b)
    {
        model.addAttribute("number_a", number_a);
        model.addAttribute("number_b", number_b);
        model.addAttribute("result", number_a + number_b);


        return "calculator";
    }

    @RequestMapping("/calculator1")
    public String home1(Model model, Integer number_a, Integer number_b, String list)
    {
        model.addAttribute("number_a", number_a);
        model.addAttribute("number_b", number_b);
        model.addAttribute("list", list);

        if(list.equals("+")) {
            model.addAttribute("result", number_a + number_b);
        }
        else if(list.equals("-")) {
            model.addAttribute("result", number_a - number_b);
        }
        else if(list.equals("*")) {
            model.addAttribute("result", number_a * number_b);
        }
        else {
            model.addAttribute("result", "ZLE" );
        }
        return "calculator1";
    }

    @RequestMapping("/calculator2")
    public String home2(Model model, CalculatorForm calculator)
    {
        model.addAttribute("calculator", calculator);

        if(calculator.getList().equals("+")) {
            model.addAttribute("result", calculator.getNumber_a() + calculator.getNumber_b());
        }
        else if(calculator.getList().equals("-")) {
            model.addAttribute("result", calculator.getNumber_a() - calculator.getNumber_b());
        }
        else if(calculator.getList().equals("*")) {
            model.addAttribute("result", calculator.getNumber_a() * calculator.getNumber_b());
        }
        else {
            model.addAttribute("result", "ZLE" );
        }
        return "calculator2";
    }

}
