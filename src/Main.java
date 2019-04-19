import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<user> list=new ArrayList<>();
        list.add(new user("zhangsan",1,1000));
        list.add(new user("lisi",3,6000));
        list.add(new user("wangwu",2,500));
        list.add(new user("zhaoliu",4,8000));
        System.out.println(list);
        for(user user:list){
            System.out.println(user.getId()+user.getName()+user.getSalary());
        }
        Collections.sort(list, new Comparator<user>() {
            @Override
            public int compare(user o1, user o2) {
                return o1.getId()-o2.getId();
            }
        });
        for(user user:list){
            System.out.println(user.getId()+user.getName()+user.getSalary());
        }

    }
}
