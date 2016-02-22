import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class WordCountTest {
    @Test
    public void give_character_count(){
        String myContent = "lalala...\nMy Name is Khan and I am Not a Bollywood Actor.";

        WcUtil myContentFacility = new WcUtil(myContent);
        assertEquals(myContentFacility.countChar(),57);


    }

    @Test
    public void give_word_count(){
        String myContent = "lalala...\nMy Name is Khan and I am Not a Bollywood Actor.";

        WcUtil myContentFacility = new WcUtil(myContent);

        assertEquals(myContentFacility.countWord(),11);

    }

    @Test
    public void give_line_count(){
        String myContent = "lalala...\nMy Name is Khan and I am Not a Bollywood Actor.";

        WcUtil myContentFacility = new WcUtil(myContent);

        assertEquals(myContentFacility.countLine(),2);


    }
}
