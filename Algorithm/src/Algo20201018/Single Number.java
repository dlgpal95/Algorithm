public class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for( int i : nums){

            if (map.containsKey(i)) {
                map.remove(i);
            }else{
                map.put(i,i);
            }
        }

        int k = 0;

        for(int key : map.keySet()){
            k = key;
        }
        return k;
    }
}
////// 더 좋은
class Solution2 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if ( hs.contains(i)) {
                hs.remove(i);
            } else {
                hs.add(i);
            }
        }
        return hs.iterator().next();
    }
}
class Solution3{
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res ^= num;
        }
        return res;
    }
}
