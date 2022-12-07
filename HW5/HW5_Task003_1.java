//Изменить значения дописав восклицательные знаки. 
//*Создать TreeMap, заполнить аналогично.
import java.util.*;
public class HW5_Task003_1 {
    public static void main(String[] args){

        Map<Integer,String> tmap1 = new TreeMap<>();
        tmap1.put(1,"Hello");
        tmap1.put(2,"World");
        tmap1.compute(1, (k, v) -> v + "!");
        tmap1.compute(2, (k, v) -> v + "!");

        System.out.println(tmap1);


    }
}