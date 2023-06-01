package pro.sky.skyprospringdemo.service;

public interface CalculationService {
    String welcome();

    String plus (Integer value1, Integer value2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);

}
