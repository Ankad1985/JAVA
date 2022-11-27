//Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Scanner;
import java.util.Arrays;

public class Task004 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        input.close();

        // for (int i = Short.MIN_VALUE; i < 0; i++) {
        //     if(i % n != 0){
        //         System.out.print(i + " ");
        //     }
            
        // }

        int index = 0;

        for(int i = Short.MIN_VALUE; i < 0; i++){
            if(i % n != 0){
              index++; 
            }
          }
        int[] m2 = new int[index];
        index = 0;
        for(int i = Short.MIN_VALUE; i < 0; i++){
            if(i % n != 0){
              m2[index++] = i; 
            }
          }  
          
        System.out.print(Arrays.toString(m2));  




 }
}