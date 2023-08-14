import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> startmem = new HashMap<String,Integer>();
        for(int i=0;i<participant.length;i++){
            String key = participant[i];
            if(startmem.containsKey(key)){
                int num = startmem.get(key)+1;
                startmem.put(key,num);
            }else{
                startmem.put(participant[i],1);
            }
        }
        //

        //
        for(String end:completion){
            if(startmem.containsKey(end)){
                int num = startmem.get(end)-1;
                startmem.put(end,num);
            }
        }
        //
        Iterator<String> keys = startmem.keySet().iterator();
        loop:while(keys.hasNext()){
            String key = keys.next();
            if(startmem.get(key)>0){
                answer = key;
                break loop;
            }
        }
         return answer;
    }
}