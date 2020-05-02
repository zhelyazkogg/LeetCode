package Day1
import java.io.Serializable

class Main: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var firstSuspectedBadVersion = 0
        var earliestKnownBadVersion = n
        while(firstSuspectedBadVersion < earliestKnownBadVersion){
            val mid = firstSuspectedBadVersion + (earliestKnownBadVersion - firstSuspectedBadVersion)/2
            if(isBadVersion(mid)){
                earliestKnownBadVersion = mid
            } else {
                firstSuspectedBadVersion = mid + 1
            }
        }
        return firstSuspectedBadVersion
    }
}

//   for(n in isBadVersion){
//       if(n == false){
//           println("this is a good version -> " + n)
//       } else {
//           println("this is a bad version  -> " + n)
//       }
//   }