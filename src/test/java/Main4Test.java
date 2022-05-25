import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Main4Test {

    Main4 main;

    @BeforeEach
    void setUp() {

        main = new Main4();

    }

    @Test
    void main() {
        List list = new ArrayList<>();
        Collections.addAll(list,112, 40, 20, 10, 5, 3, 1, -2, -2, -3, -9, -31);


        assertEquals(main.task4(),list);

    }
}