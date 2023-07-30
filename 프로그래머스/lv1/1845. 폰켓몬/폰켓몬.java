import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length=nums.length;
        HashSet<Integer> arr = new HashSet<Integer>();
        for(int i=0;i<length;i++){
            arr.add(nums[i]);
        }
        answer = Math.min(length/2,arr.size());
        
        return answer;
    }
}