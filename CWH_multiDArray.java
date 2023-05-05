package com.company;

public class CWH_multiDArray {
    public static void main(String[] args) {
        int [][] multiA;
        multiA=new int[2][3];
//        multiA={{1,2,3},{2,3,4},{5,6,7}};
        multiA[0][0]=23;
        multiA[0][1]=89;
        multiA[0][2]=21;
        multiA[1][0]=12;
        multiA[1][1]=98;
        multiA[1][2]=123;

        for(int i=0;i<multiA.length;i++){
            for(int j=0;j< multiA[i].length;j++)
            {

                    System.out.print(multiA[i][j]);
                    System.out.print(" ");

            }
            System.out.println("");
        }


    }
}
