import java.util.*;

public class Main5 {
    public static void main(String[] args) {
       

    }

    public List task4(){

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();


        st1.push(5);
        st1.push(6);

        st2.push(8);
        st2.push(9);

        System.out.println("Создаем стек ");
        System.out.println("Первый стэк " + st1);
        System.out.println("Второй стэк " + st2);

        Iterator<Integer> i = st1.iterator();
        Iterator<Integer> i2 = st2.iterator();

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(i.hasNext()) {
            list.add(i.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        st1.clear();

        for(int j =0;j<list2.size();j++) {
            st1.push(list2.get(j));
        }

        st2.clear();

        for(int j =0;j<list.size();j++) {
            st2.push(list.get(j));
        }
        System.out.println(" ");
        System.out.println("Меняем информацию местами ");
        System.out.println(" ");
        System.out.println("Новый первый стэк " + st1);
        System.out.println("Новый второй стэк " + st2);
        System.out.println(" ");

        List list1 = new ArrayList<>();
        list1.add(st1);
        list1.add(st2);

        return list1;
    }
}
