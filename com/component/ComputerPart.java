package com.component;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}

class Leaf implements Component{

    int price;
    String name;
    public Leaf(int price,String name){
        super();
        this.price = price;
        this.name = name;
    }
    @Override
    public void showPrice() {
        System.out.println("Name:"+name+" and price:"+price);
    }
}

class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name){
        super();
        this.name = name;
    }

    public void addComponent(Component c){
        components.add(c);
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c:components){
            c.showPrice();
        }
    }
}

public class ComputerPart {

}
