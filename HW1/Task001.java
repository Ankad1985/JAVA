//Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
import java.util.Random;
public class Task001 {
    public static void main(String[] args){

    int i = new Random().ints(1,-1000, 1000).findFirst().getAsInt();
    System.out.println(i); 
        
 }
}