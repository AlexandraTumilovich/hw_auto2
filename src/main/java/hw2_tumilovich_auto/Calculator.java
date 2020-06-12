package hw2_tumilovich_auto;

public class Calculator {

    public Calculator() {
    }

    public double getSum(double firstNumber, double secondNumber) { // Метод для сложения двух чисел
        return firstNumber + secondNumber;
    }

    public double getDifference(double firstNumber, double secondNumber) { // Метод для вычитания двух чисел
        return firstNumber - secondNumber;
    }

    public double getProduct(double firstNumber, double secondNumber) { // Метод для умножения двух чисел
        return firstNumber * secondNumber;
    }

    public double getQuotient(double firstNumber, double secondNumber) { // Метод для деления одного числ на другое
        return firstNumber / secondNumber;
    }

    public double getSquare(double number){
        return Math.sqrt(number);
    }
}

