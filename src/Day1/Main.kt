package Day1
import java.io.Serializable

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
        var earliestKnownBadVersion = 0
        while(earliestKnownBadVersion<n){
            if(isBadVersion[earliestKnownBadVersion]){
                println(earliestKnownBadVersion)
                break
            }
            earliestKnownBadVersion++
        }
        return n
    }
}