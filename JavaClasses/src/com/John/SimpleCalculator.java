package com.John;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double first){
        this.firstNumber = first;
    }

    public void setSecondNumber(double second){
        this.secondNumber = second;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber* secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber > 0){
            return firstNumber/secondNumber;
        }else{
            return 0.0;
        }

    }
}
