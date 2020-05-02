package Day2

class Main {
    fun numJewelsInStones(J: String, S: String): Int {
        val jewelHashMap = hashMapOf<Char, Boolean>()
        var jewelCount = 0
        J.forEach {
            jewelHashMap[it] = true
        }
        S.forEach {
            if (jewelHashMap[it]==true){
                jewelCount++
            }
        }
        return jewelCount
    }
}