import java.util.HashMap;

//Изменить значения дописав восклицательные знаки. 
//*Создать TreeMap, заполнить аналогично.
import java.util.Map;
public class HW5_Task003 {
    public static void main(String[] args){

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Hello");
        map1.put(2,"World");
        map1.compute(1, (k, v) -> v + "!");
        map1.compute(2, (k, v) -> v + "!");
        System.out.println(map1);


    }
}
