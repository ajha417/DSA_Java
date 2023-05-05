package com.company;

public class ChocolateTester {
    static int barCode;

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    static String name;
    static int weight;
    static int cost;
    ChocolateTester(){
        barCode = 101;
        name ="Cadbury";
        weight = 12;
        cost = 10;
    }
    public static void display(){
        System.out.println("Barcode: "+barCode);
        System.out.println("Name: "+name);
        System.out.println("weight: "+weight);
        System.out.println("cost: "+cost);
    }


    public static void main(String[] args) {
        ChocolateTester obj = new ChocolateTester();
        obj.display();
        System.out.println(obj.getBarCode());
        System.out.println(obj.getName());
        System.out.println(obj.getWeight());
        System.out.println(obj.getCost());

        obj.setBarCode(102);
        obj.setName("Hershey's");
        obj.setWeight(24);
        obj.setCost(50);
        System.out.println(obj.getBarCode());
        System.out.println(obj.getName());
        System.out.println(obj.getWeight());
        System.out.println(obj.getCost());

    }
}
