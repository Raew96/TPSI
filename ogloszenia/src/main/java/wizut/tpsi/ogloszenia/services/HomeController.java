package wizut.tpsi.ogloszenia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import wizut.tpsi.ogloszenia.jpa.CarManufacturer;
import wizut.tpsi.ogloszenia.services.OffersService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    OffersService offersService;

    @RequestMapping("/")
    public String home(Model model) {
        List<CarManufacturer> carManufacturers = offersService.getCarManufacturers();

        model.addAttribute("carManufacturers", carManufacturers);

        return "offersList";
    }

}
