package Day1

class Main: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        val n = 4
        val isBadVersion = arrayOf(false, false, false, false, true, true)
        //   for(n in isBadVersion){
        //       if(n == false){
        //           println("this is a good version -> " + n)
        //       } else {
        //           println("this is a bad version  -> " + n)
        //       }
        //   }
        var i = 0
        while(i<n){
            if(isBadVersion[i]){
                println(i)
            }
            i++
        }
        return n
    }
}