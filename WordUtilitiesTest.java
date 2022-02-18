package lab04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class WordUtilitiesTest {

    @Test
    void swapCaseTest(){
        String empty = "";
        String allUpper = "LOWER";
        String allLower = "lower";
        String lower_and_upper = "LoWeR";
        String null_string = null;
        String title_case = "the quick brown fox jumps over the lazy dog";


        assertEquals(empty, WordUtilities.swapCase(empty));
        assertEquals("lower", WordUtilities.swapCase(allUpper));
        assertEquals("LOWER", WordUtilities.swapCase(allLower));
        assertEquals("lOwEr", WordUtilities.swapCase(lower_and_upper));
        assertEquals(null, WordUtilities.swapCase(null_string));
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", WordUtilities.swapCase(title_case));





    }


}