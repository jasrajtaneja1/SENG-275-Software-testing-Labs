package lab04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.util.ArrayList;

class CollectionUtilsTest {


    @Test
    void containsAnyTest() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3, 4, 5, 6));
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Integer> nums2= new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> nums3= new ArrayList<>(Arrays.asList(3));

        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(1,3, 4));
        ArrayList<Integer> nums5 = new ArrayList<>(Arrays.asList(4));

        ArrayList<Integer> nums6 = new ArrayList<>(Arrays.asList(1,3, 4));
        ArrayList<Integer> nums7 = new ArrayList<>(Arrays.asList(5, 6));



        assertEquals(true, CollectionUtils.containsAny(nums, nums1));
        assertEquals(false, CollectionUtils.containsAny(nums2, nums3));
        assertEquals(true, CollectionUtils.containsAny(nums4, nums5));
        assertEquals(false, CollectionUtils.containsAny(nums7, nums6));



    }




}