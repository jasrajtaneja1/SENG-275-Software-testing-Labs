package lab03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BoundaryTest {

    @Test
    void isUnsafe() {
        assertTrue(Boundary.isUnsafe(86));
    }

    @Test
    void isNotUnsafe() {
        assertFalse(Boundary.isUnsafe(85));
    }


    @ParameterizedTest
    @ValueSource(ints  = {5,20, 10, 19})
    void is_comfort(int temps){
        assertTrue(Boundary.isComfortable(temps));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 21, 30, 100, -100})
    void not_comfort(int temps){
        assertFalse(Boundary.isComfortable(temps));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 0, -1, -2, -3})
    void storeys_less_than_two(int storeys){
        assertEquals(0, Boundary.elevatorsRequired(storeys));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 4, 3, 2})
    void storeys_less_than_6(int storeys){
        assertEquals(1, Boundary.elevatorsRequired((storeys)));
    }

    @ParameterizedTest
    @ValueSource(ints = {6,7,8,9,10})
    void above_six_storeys(int storeys){
        assertEquals(2, Boundary.elevatorsRequired(storeys));
    }


    @ParameterizedTest
    @ValueSource(doubles = {-1, 101, 102, -90, -92.6})
    void outside_grade_range(double percent){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {Boundary.percentageToLetterGrade(percent);});
    }

    @ParameterizedTest
    @ValueSource(doubles = {49, 48, 47, 47.6, 2})
    void grade_less_50(double percents){
        assertEquals("F", Boundary.percentageToLetterGrade(percents));

    }

    @ParameterizedTest
    @ValueSource(doubles = {59, 58, 57, 57.6, 51, 50})
    void grade_less_60(double percents){
        assertEquals("D", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {64, 63, 62, 61,60})
    void grade_less_65(double percents){
        assertEquals("C", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {69, 67, 66, 65, 65.1})
    void grade_less_70(double percents){
        assertEquals("C+", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {72, 71, 70, 70.9})
    void grade_less_73(double percents){
        assertEquals("B-", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {76, 75, 74, 73,73.1})
    void grade_less_77(double percents){
        assertEquals("B", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {79, 78, 77, 77.1})
    void grade_less_80(double percents){
        assertEquals("B+", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {84, 83, 82, 81,80, 80.9})
    void grade_less_85(double percents){
        assertEquals("A-", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {89, 88, 87, 86,85, 85.1})
    void grade_less_90(double percents){
        assertEquals("A", Boundary.percentageToLetterGrade(percents));
    }

    @ParameterizedTest
    @ValueSource(doubles = {91, 95, 100})
    void grade_over_90(double percents){
        assertEquals("A+", Boundary.percentageToLetterGrade(percents));
    }



}