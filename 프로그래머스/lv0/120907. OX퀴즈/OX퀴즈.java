class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String[] num= quiz[i].split(" ");
            if(num[1].equals("+")){
                int an = Integer.parseInt(num[0])+Integer.parseInt(num[2]);
                if(an==Integer.parseInt(num[4])){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }else{
                int an = Integer.parseInt(num[0])-Integer.parseInt(num[2]);
                if(an==Integer.parseInt(num[4])){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }
        }
        return answer;
    }
}