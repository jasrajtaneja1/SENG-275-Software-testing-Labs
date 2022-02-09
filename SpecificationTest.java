package lab03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class SpecificationTest {



    @ParameterizedTest(name="x{0}, y{1}")
    @CsvSource({"0, 0", "1, 1", "0, 1", "5, 5", "1279, 719"})
    void volumesUnsafe(int x,int y) {
        // do something with provinceCode
        assertTrue(Specification.insideDisplayArea(x, y));
    }


    @ParameterizedTest(name = "input{0}, motorcycle{1}")
    @CsvSource({"    hhhhhh, false",
            " h3h3h3, false",
            "jfjfjf, true",
            "h3h3h3, true",
            "h3h h3h, false",

            "hhh hhh, false",

            "hhh-333, false",
            "hhh-hhh, false",
            "hh-hh, false",
            "hh-h3, false",
            "hh-hh, true",
            "hh-h3, true",
            })
    void messageIsValidTest(String input, boolean motorcycle){

        assertTrue(Specification.messageIsValid(input, motorcycle));




    }









}