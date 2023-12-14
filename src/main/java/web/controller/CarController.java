package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(required = false) Integer count, Model model){
        if (count != null){
            model.addAttribute("cars", carService.getCars(count));
        } else {
            model.addAttribute("cars", carService.getCars(carService.getCarListSize()));
        }
        return "cars";
    }


}
