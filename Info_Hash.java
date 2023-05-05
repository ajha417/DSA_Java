package com.company;

class Customer{
    private int custId;
    private String custName;
    public Customer(int custId,String custName){
        this.custId = custId;
        this.custName = custName;

    }
    public int hashCode(){
        return custId;
    }
    public boolean equals(Object ob){
        Customer cust = (Customer)ob;
        if(this.hashCode()==cust.hashCode()){
            return this.custName.equals(cust.custName);
        }
        return false;
    }
}

public class Info_Hash {
    public static void main(String[] args) {

        Customer customer1 = new Customer(12,"Amit");
        Customer customer2 = new Customer(13,"Ajay");
        if(customer1.equals(customer2)){
            System.out.println("Objects are equal");
        }
        else{
            System.out.println("Objects are not equal");
        }
    }
}
