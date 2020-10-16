package Day5

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

class Solution {
    fun firstUniqChar(s: String): Int {
       // val letterHashMap = hashMapOf<Int, String>()
        val firstNonRepeatingLetter = 0

        for ((index, value) in s.withIndex()){
            println(s[index])

            if (firstNonRepeatingLetter.equals(s)){
                println(value)
            }
        }


        return firstNonRepeatingLetter
    }
}