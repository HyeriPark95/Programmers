class Solution {
    public int solution(int n, int m, int[] section) {
        int answer=0;
        int[] roll = new int[n];
        for(int a:section){
            roll[a-1]=1;
        }
        for(int i=0;i<roll.length;i++){
            if(roll[i]==1){
                answer++;
                for(int j=0;j<m;j++){
                    roll[Math.min(i+j,roll.length-1)]=0;
                }
            }
        }
        return answer;
    }
}