package pro.sky.skyprospringdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.service.CalculationService;

@RestController
@RequestMapping("/calculator")
public class CalculationController {
    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }
    private final CalculationService calculationService;

    public String welcome() {
        return calculationService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculationService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculationService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculationService.divide(num1, num2);
    }

}
