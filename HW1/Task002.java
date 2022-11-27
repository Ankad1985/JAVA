//Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
import java.util.Scanner; 
public class Task002 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int gigit = in.nextInt();
        in.close();
        
        int n = 0;
        if (gigit == 0){
          n = 0;
        }
        gigit = (gigit/2);
        while (gigit > 0){
          gigit = (gigit/2);
          n += 1;
        }
        n = 1 << n;
  
      System.out.println("Старший значащий бит равен: " + n);
        
 }
}