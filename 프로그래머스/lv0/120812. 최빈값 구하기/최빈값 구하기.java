class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] tmp=new int[1000];
        for(int i=0;i<array.length;i++){
            int n=array[i];
            tmp[n]++;
        }
        int max =tmp[0];
        for(int i=1;i<tmp.length;i++){
            if(tmp[i]>max) {
                max=tmp[i];
                answer=i;
            }else if(tmp[i]==max){
                answer=-1;
            }
        }
        return answer;
    }
}