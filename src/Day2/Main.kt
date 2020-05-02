package Day2

class Main {
    fun numJewelsInStones(J: String, S: String): Int {
        val jHashMap = hashMapOf<Char, Boolean>()
        J.forEach { count ->
            jHashMap[count] = true
        }
        var jewelCount = 0
        S.forEach { count ->
            if (jHashMap[count] == true){
                jewelCount++
            }
        }
        return jewelCount
    }
}