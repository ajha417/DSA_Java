package com.component;

public class ComponentTest {
    public static void main(String[] args) {
        Component mouse = new Leaf(500,"mouse");
        Component monitor = new Leaf(15000,"monitor");
        Component hdd = new Leaf(1500,"hdd");
        Component ram = new Leaf(800,"ram");
        Component cpu = new Leaf(2500,"cpu");


        Composite cabninet = new Composite("Cabinet");
        Composite ph = new Composite("Peri");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);
        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabninet.addComponent(hdd);
        cabninet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabninet);

        ram.showPrice();
        computer.showPrice();

    }
}
