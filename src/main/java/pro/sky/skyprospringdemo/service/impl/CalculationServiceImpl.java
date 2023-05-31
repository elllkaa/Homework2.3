package pro.sky.skyprospringdemo.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.service.CalculationService;

@Service
public abstract class CalculationServiceImpl implements CalculationService {
    
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String plus (Integer num1, Integer num2) {
        int result = Integer.parseInt(String.valueOf(num1)) + Integer.parseInt(String.valueOf(num2));
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        int result = Integer.parseInt(String.valueOf(num1)) - Integer.parseInt(String.valueOf(num2));
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        int result = Integer.parseInt(String.valueOf(num1)) * Integer.parseInt(String.valueOf(num2));
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (Integer.parseInt(String.valueOf(num2)) == 0) {
            return "На ноль делить нельзя";
        }
        int result = Integer.parseInt(String.valueOf(num1)) / Integer.parseInt(String.valueOf(num2));
        return num1 + " / " + num2 + " = " + result;
    }



}
