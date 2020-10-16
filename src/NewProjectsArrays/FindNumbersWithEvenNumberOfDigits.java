package NewProjectsArrays;

// Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//        Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.
//        Example 2:
//
//        Input: nums = [555,901,482,1771]
//        Output: 1
//        Explanation:
//        Only 1771 contains an even number of digits.

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        // create a counter to keep track
        int count = 0;
        // do a for i in nums
        for(int i : nums){

            //count should go over every number in the array and count its every digit. if the length of the number
            // is dividable to 2 it should return a True, and if its only dividable to 1 then it should return a False.
            count += String.valueOf(i).length() % 2 == 0 ? 1 : 0;
        }
        // and last we need that count of how many numbers have an even number of digits
        return count;
    }
}
