import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class Main3Test {

    Main3 main;

    @BeforeEach
    void setUp() {

        main = new Main3();

    }

    @Test
    void main() throws IOException {

        List<String> list2 = new ArrayList();
        Collections.addAll(list2, "1", "2", "3", "5", "8", "9");


        assertEquals(main.task4(), list2);

    }
}