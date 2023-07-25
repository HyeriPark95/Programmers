class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x=0;
        int y=0;
        for(int i=0;i<sizes.length;i++){
            if(Math.max(sizes[i][0],sizes[i][1])>x){
                x=Math.max(sizes[i][0],sizes[i][1]);
            }
            if(Math.min(sizes[i][0],sizes[i][1])>y){
                y=Math.min(sizes[i][0],sizes[i][1]);
            }
        }
        answer = x*y;
        return answer;
    }
}