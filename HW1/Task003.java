//Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
import java.util.Scanner;
import java.util.Arrays;

class Task003{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        input.close();

        int index = 0;

        for(int i = 0; i < Short.MAX_VALUE; i++){
            if(i % n == 0){
              index++; 
            }
          }
        int[] m1 = new int[index];
        index = 0;
        for(int i = 0; i < Short.MAX_VALUE; i++){
            if(i % n == 0){
              m1[index++] = i; 
            }
          }  
          
        System.out.print(Arrays.toString(m1));  


    }
}