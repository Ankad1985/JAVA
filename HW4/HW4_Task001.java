//Написать приложение для ввода ФИО, возраст и пол пользователей. 
//Данные хранить в разных списках. Сортировать пользователей по возрасту.
//Не вывести в порядке возрастания возрастов а именно сортировать!)
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.LinkedList;

public class HW4_Task001 {
    public static void main(String[] args) {
        
        ArrayList<String> list_fname = new ArrayList<>();
        ArrayList<String> list_lname = new ArrayList<>();
        ArrayList<String> list_tname = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<String> list_sex = new ArrayList<>();
        List<Integer> key = new LinkedList<>();

        boolean flag = true;
        while (flag) {
            Scanner input_fio  = new Scanner(System.in);
            Scanner input_age = new Scanner(System.in);
            Scanner input_sex = new Scanner(System.in);
            

            System.out.println("Enter full name : ");
            String fio = input_fio.nextLine();
            System.out.println("Enter your age: ");
            Integer age = input_age.nextInt();

            list_age.add(age);
            String[] fio1 = fio.split(" ");
            if (fio1.length == 3) {
                list_fname.add(fio1[1]);
                list_lname.add(fio1[0]);
                list_tname.add(fio1[2]);
            } else if (fio1.length == 2) {
                list_lname.add(fio1[0]);
                list_fname.add(fio1[1]);
                list_tname.add("");
            } else {
                list_lname.add(fio1[0]);
                list_fname.add("");
                list_tname.add("");
            }
            
            System.out.println("Enter your gender M/F: ");
            String gender = input_sex.nextLine();
            if(gender.toUpperCase().equals("M")) {
                list_sex.add("man");
            }
            
            else  {
                list_sex.add("woman");
            }
            key.add(list_age.size() - 1); 
            System.out.println("Do you want to enter new data? Y/N");
            Scanner scanNewData = new Scanner(System.in);
            String yn = scanNewData.nextLine();
           
            if(yn.toUpperCase().equals("N")) {
                flag = false;
            }
        }

        int cnt = list_age.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(key.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(key.get(i))){
                    max_age = list_age.get(key.get(i));
                    index = i;
                }
            }
            int tmp = key.get(cnt);
            key.set(cnt, key.get(index));
            key.set(index, tmp);

            cnt--;
        }
        
        key.forEach(i ->
        System.out.println(list_lname.get(i)+" "+list_fname.get(i)+" "+list_tname.get(i)+" "+list_age.get(i)+" "+list_sex.get(i)));


    }
}
