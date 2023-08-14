import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //해시맵에 이름별로 선수 인원 넣기
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
        //완주한 멤버들 제거
        for(String end:completion){
            if(startmem.containsKey(end)){
                int num = startmem.get(end)-1;
                startmem.put(end,num);
            }
        }
        //완주 못한 멤버 찾아서 answer에 넣어주고 loop탈출
        Iterator<String> keys = startmem.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            if(startmem.get(key)>0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}