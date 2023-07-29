class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String[] num= quiz[i].split(" ");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[2]);
            int result = Integer.parseInt(num[4]);
            if(num[1].equals("+")){
                int an = num1+num2;
                if(an==result){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }else{
                int an = num1-num2;
                if(an==result){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }
        }
        return answer;
    }
}