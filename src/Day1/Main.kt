package Day1
import java.io.Serializable

class Main: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {

        var earliestKnownBadVersion = 0
        while(earliestKnownBadVersion<n){
            if(isBadVersion(earliestKnownBadVersion)){
                break
            }
            earliestKnownBadVersion++
        }
        return earliestKnownBadVersion
    }
}

//   for(n in isBadVersion){
//       if(n == false){
//           println("this is a good version -> " + n)
//       } else {
//           println("this is a bad version  -> " + n)
//       }
//   }