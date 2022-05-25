import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Main5Test {
    Main5 main;

    @BeforeEach
    void setUp() {
        main = new Main5();
    }

    @Test
    void main() {
    }

    @Test
    void task4() {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();


        st1.push(5);
        st1.push(6);

        st2.push(8);
        st2.push(9);


        List list = new ArrayList<>();
        list.add(st2);
        list.add(st1);

        assertEquals(main.task4(),list);

    }
}