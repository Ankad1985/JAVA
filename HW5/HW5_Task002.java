//Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
import java.util.HashMap;
import java.util.Map;
public class HW5_Task002 {
    public static void main(String[] args){
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"red");
        map1.put(2,"green");
        map1.put(3,"blue");
        map1.putIfAbsent(2,"brown");
        map1.putIfAbsent(4,"grey");

        System.out.println(map1);

    } 
    
}
