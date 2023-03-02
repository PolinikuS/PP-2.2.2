package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.ServiceInterface;

@Controller
public class CarController {


    private ServiceInterface serviceInterface;

    @Autowired
    public CarController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @GetMapping(value = "/cars")
    public String page(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", serviceInterface.getCarsList(count.intValue()));
        return "cars";
    }
}
