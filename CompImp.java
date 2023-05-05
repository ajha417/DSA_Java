package com.company;

import java.util.Comparator;

public class CompImp implements Comparator<Integer> {  //here this class is implementing Comparator interface
            public int compare(Integer o1,Integer o2){   //here compare is the method of Comparator
                if(o1%10>o2%10){
                    return 1;
                }
                return -1;
            }

}

