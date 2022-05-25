import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Main1Test {
    Main1 main1;

    @BeforeEach
    void setUp() {

        main1 = new Main1();
    }

    @Test
    void main() {

        List list = new ArrayList<>();
        Collections.addAll(list,"but", "spoke", "before", "express", "that", "beautiful", "from", "because", "definitions", "you", "they", "based", "like", "old", "understand", "originally", "an", "were", "shakespeare", "style", "try", "word", "sources", "grandparents", "for", "our", "we", "example", "not", "known", "have", "explanations", "course", "speak", "on", "a", "thoughts", "famous", "or", "many", "help", "classic", "what", "translation", "short", "well");

        main1.listMain1().equals(list);

    }
}