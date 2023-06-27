class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=0;i<food.length;i++){
            for(int n=0;n<food[i]/2;n++){
                answer+=String.valueOf(i);
            }
        }
        answer+="0";
        for(int i=food.length-1;i>=0;i--){
            for(int n=food[i]/2;n>0;n--){
                answer+=String.valueOf(i);
            }
        }
        return answer;
    }
}