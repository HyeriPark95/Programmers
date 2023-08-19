import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String[] s_s = s.split("");
        String[] s_skip = skip.split("");
        String al = "abcdefghijklmnopqrstuvwxyz";
        String[] s_al = al.split("");
        for(int i=0;i<s_s.length;i++){
            int count=0;
            int now=al.indexOf(s_s[i]); //지금 있는 자리
            while(count<index){
                now++;
                System.out.println(now);
                if(now>=26){
                    now=0;
                }
                if(!Arrays.asList(s_skip).contains(s_al[now])){
                    count++;
                }
            }
            answer+=s_al[now];
        }
        return answer;
    }
}