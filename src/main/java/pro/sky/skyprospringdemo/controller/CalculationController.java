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
        return calculatorServiseInterface.welcome();
    }

    @GetMapping("/plus")
    public Integer plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String resultMinus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiseInterface.resultMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String resultMultiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiseInterface.resultMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String resultDivade(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiseInterface.resultDivide(num1, num2);
    }

}
