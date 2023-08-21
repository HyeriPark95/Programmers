import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int N, int[] stages) {
        ArrayList<Integer> answer = new ArrayList<>();
        double[] values= new double[N];
        Map<Integer,Double> fail = new HashMap<>();
        for(int i=1;i<=N;i++){
            int all=0;
            int inStage=0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]==i)inStage++;
                if(stages[j]>=i)all++;
            }
            if(all==0 && inStage==0){
                fail.put(i,0.0);
            }else{
               fail.put(i,(double)inStage/all); 
            }
        }
        List<Map.Entry<Integer,Double>> list = new LinkedList<>(fail.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                // 내림차순 정렬
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Integer,Double> a: list){
            answer.add(a.getKey());
            System.out.println("key:"+a.getKey()+"value:"+a.getValue());
        }
        return answer;
    }
}