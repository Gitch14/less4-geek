import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {


    }

    public List<String> listMain1(){
        List<String> listMain1 = new ArrayList<>();

        String text = "These are short, famous texts in English from classic sources like the Bible or Shakespeare. Some texts have word definitions and explanations to help you. Some of these texts are written in an old style of English. Try to understand them, because the English that we speak today is based on what our great, great, great, great grandparents spoke before! Of course, not all these texts were originally written in English. The Bible, for example, is a translation. But they are all well known in English today, and many of them express beautiful thoughts.";

        String[] strings = text.split("\\W+");
        for (int i = 0; i < strings.length; i++){
            strings[i] = strings[i].toLowerCase();
        }



        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)){
                Integer k = map.get(s);
                map.put(s,k+1);
            }else {
                map.put(s,1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) listMain1.add(entry.getKey());

        }

        return listMain1;
    }

}
