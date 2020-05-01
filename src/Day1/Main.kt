package Day1

class Main: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        val n = 5
        val isBadVersion = arrayOf(false, false, false, true, true)
        //   for(n in isBadVersion){
        //       if(n == false){
        //           println("this is a good version -> " + n)
        //       } else {
        //           println("this is a bad version  -> " + n)
        //       }
        //   }
        var i = 0
        //  val isBadVersion = arrayOf(1, 2, 3, 4, 5)
        while(i<n){
            ++i

        }
        return n
    }
}