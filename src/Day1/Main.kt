package Day1

class Main: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        val n = 5
        val isBadVersion = arrayOf(false, false, false, true, true)
        for(n in isBadVersion){
            if(n == false){
                println("this is a good version -> " + n)
            } else {
                println("the bad version is -> " + n)
            }
        }
        return n
    }
}