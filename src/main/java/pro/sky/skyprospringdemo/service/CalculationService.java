package pro.sky.skyprospringdemo.service;

public interface CalculationService {
    String welcome();

    String plus (Integer value1, Integer value2);

    String minus(String num1, String num2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);

    String multiply(String num1, String num2);

    String divide(String num1, String num2);
}
