package Day3
/*
Given an arbitrary ransom note string and another string containing letters from all the magazines,
write a function that will return true if the ransom note can be constructed from the magazines ;
otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/
class Solution {
    fun main(args: Array<String>) {
        fun canConstruct(ransomNote: String, magazine: String): Boolean {
            var symbols = 0
            for((index, value) in magazine.withIndex()){
                // println(ransomNote[0]==magazine[index])
                for(symbols in ransomNote) {
                    print(symbols)
                    if (symbols.equals(magazine[index])){
                        println(value)
                    }
                }

            }
            return true
        }
    }
}