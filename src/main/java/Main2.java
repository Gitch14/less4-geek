import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();


        try(FileWriter writer = new FileWriter("notes1.txt", false))
        {

            String text = "Hello World";

            writer.write(text + " 1\n");
            writer.write(text + " 2\n");
            writer.write(text + " 3\n");
            writer.write(text + " 4\n");
            writer.write(text + " 5\n");

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        FileReader fr= new FileReader("notes1.txt");
        Scanner scan = new Scanner(fr);


        while (scan.hasNextLine()) {
            list.add(scan.nextLine());

        }

        try(FileWriter writer1 = new FileWriter("notes1.txt", false))
        {

            for (int i = list.size()-1; i >= 0; i--) {
                writer1.write((String) list.get(i)+"\n");
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



        fr.close();
    }
}
