import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {


    @BeforeEach
    void setUp() {
    }

    @Test
    void main() throws FileNotFoundException {

        List<String> list1 = new ArrayList();
        List<String> list2 = new ArrayList();
        Collections.addAll(list2, "Hello World 5",
                "Hello World 4",
                "Hello World 3",
                "Hello World 2",
                "Hello World 1");
        
        FileReader fr= new FileReader("notes1.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            list1.add(scan.nextLine());
        }


        assertEquals(list1, list2);


    }




}