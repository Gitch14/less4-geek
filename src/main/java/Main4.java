import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {


    }

    public List task4() {
        List list = Arrays.asList(20,-3,40,10,3,5,-9,-2,112,-31,1,-2);
        List list2 = new ArrayList<>();

        Collections.sort(list);

        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        //Не используя вспомогательных объектов - не знаю или правильно понял

        System.out.println(list2);
        return list2;
    }
}
