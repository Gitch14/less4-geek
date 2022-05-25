import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {


    }

    public List task4() throws IOException {
        List list = new ArrayList<>();


        try(FileWriter writer = new FileWriter("notes2.txt", false))
        {



            writer.write("1\n");
            writer.write("3\n");
            writer.write("9\n");
            writer.write("5\n");
            writer.write("8\n");
            writer.write("2\n");

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        FileReader fr= new FileReader("notes2.txt");
        Scanner scan = new Scanner(fr);


        while (scan.hasNextLine()) {
            list.add(scan.nextLine());

        }

        Collections.sort(list);

        for (Object s : list) {
            System.out.println(s);
        }




        fr.close();

        return list;
    }
}
