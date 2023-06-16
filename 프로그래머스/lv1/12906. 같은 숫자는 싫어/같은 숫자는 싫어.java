import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer_ = new int[arr.length];
        int length=0;
        answer_[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                length++;
                answer_[length]=arr[i];
            }
        }
        int[] answer = new int[length+1];
        for(int i=0;i<=length;i++){
            answer[i]=answer_[i];
        }
        return answer;
    }
}