/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab04;

import org.apache.commons.math3.geometry.spherical.oned.ArcsSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class SplittingTest {

    @Test
    void splitting_test(){
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {};
        int[] array3 = {5, 3, 1};
        int[] array4 = {1, 2, 4, 7};









        assertEquals(false, Splitting.canBalance(array1));
        assertEquals(false, Splitting.canBalance(array2));
        assertEquals(false, Splitting.canBalance(array3));
        assertEquals(true, Splitting.canBalance(array4));




    }

}