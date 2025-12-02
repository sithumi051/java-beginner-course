//package com.mycompany.randomnumgenerator;
import java.util.Random;

public class RandomNumGenerator {

    public static void main(String[] args) {
        Random Rnd = new Random();
        
        int num;
        
        for(int i=0; i<10; i++){
            num = Rnd.nextInt(5);     //5 -> Range of the random numbers not including 5
            //num = 1 + Rnd.nextInt(5);    //Range of the random numbers including 5
            System.out.println(num);
            
        }
        
    }
}
