package com.company;

public class Tv {

    private String model;
    private int age;
    private int numOfChannels;
    private int diagonal;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.trim().length() == 0){
            System.out.println("Передана некорректная модель!");
            model = "Телевизор";
        }
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Передан некорректный срок службы!");
            age = 5;
        }
        this.age = age;
    }

    public int getNumOfChannels() {
        return numOfChannels;
    }

    public void setNumOfChannels(int numOfChannels) {
        if(numOfChannels <= 0){
            System.out.println("Передано некорректное количество каналов!");
            numOfChannels = 30;
        }
        this.numOfChannels = numOfChannels;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        if(diagonal <= 0){
            System.out.println("Передана некорректная диагональ!");
            diagonal = 32;
        }
        this.diagonal = diagonal;
    }

    public static String programInfo()
    {
        return "\nКоличество полей: 5" + "\nКоличество методов: 3" + "\nКоличество конструкторов: 3";
    }

    public boolean isTurnedOn = false;

    public String turnOn()
    {
        isTurnedOn = true;
        return "Телевизор включен!";
    }

    public String turnOff()
    {
        if (isTurnedOn)
        {
            isTurnedOn = false;
            return "\nТелевизор выключен!";
        }

        {
            return "\nТелевизор не был включен!";
        }
    }

    public Tv() {
        setModel("LG 43UK6300");
        setAge(1);
        setNumOfChannels(82);
        setDiagonal(43);
    }

    public Tv(String model, int age) {
        setNumOfChannels(127);
        setDiagonal(65);
        this.model = model;
        this.age = age;
    }

    public Tv(String model, int age, int numOfChannels, int diagonal) {
        this.model = model;
        this.age = age;
        this.numOfChannels = numOfChannels;
        this.diagonal = diagonal;
    }
}
