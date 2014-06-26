package Lec04;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_lastValue() {
        byte[] nums = new byte[] {1, 2, 3, 4, 5};
        byte value = 5;
        int index = BinarySearch(nums, value);
        assertEquals(-1, index);
    }

    @Test (expected=NullPointerException.class)
    public void testBinarySearch_null() {
        byte[] nums = new byte[] {1, 2, 3, 4, 5};
        byte value = null;
        int index = BinarySearch(nums, value);
    }

    // test all duplicate numbers
    @Test
    public void testBinarySearch_notFound() {
        byte[] nums = new byte[] {4, 4, 4, 4, 4};
        byte value = 4;
        int index = binarySearch(nums, value);
        assertEquals(4, index);
    }

    // test negative numbers
    @Test
    public void testBinarySearch_negative() {
        byte[] nums = new byte[] {-5, -4, -3, -2, -1};
        byte value = -2;
        int index = binarySearch(nums, value);
        assertEquals(4, index);
    }

}
