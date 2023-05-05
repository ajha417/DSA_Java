package com.company;

        class Adder
        {
           // static int add(int a,int b) here we have to shift this method name to particular initialization



            static int add(int a,int b)   //here the method is declared it means that it can be accessed without object creation and it is done with the help of class
            {
                int res;      //so at first it should be declared

                res = a+b;
                return res;
               // int res;   //here res variable is declared later than initialization
            }
            static double add(int a,double b)    //as return type of this method should be double so it is matched with its return type
            {
                double res;
                res = a+b;

                return res;
            }
            static double add(double a,double b)
            {
                double res;

                res = a+b;
                return res;
            }
            static int add(int a,int b,int c)
            {
                int res;

                res=a+b+c;
                return res;
            }
        }
        class Multiplier
        {
            int mul(int a,int b)
            {
                int res;
                res=a*b;
                return res;

            }
            int mul(int a,int b,int c)
            {
                int res;
                res = a*b*c;
                return res;
            }




        }
        class TestOverloading1
        {
            public static void main(String[] args)
            {
                Multiplier m=new Multiplier();  //the first step is to create an object
                System.out.println(Adder.add(100.05,11.90));  //here the methods of Adder class are accessed without object creation
                System.out.println(Adder.add(10,10)); //it is beacuse the methods were of static type
                System.out.println(Adder.add(100,100.11));
                System.out.println(Adder.add(10,11,10));


                //System.out.println(m.mul(10,10,10));  //here the method is called before the object creation
              //  Multiplier m = new Multiplier();
                System.out.println(m.mul(10,10,10));
                System.out.println(m.mul(10,11));
            }
        }



