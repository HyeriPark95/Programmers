class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer =new int[photo.length];
        for(int i=0;i<photo.length;i++){
            for(int p=0;p<photo[i].length;p++){
                for(int j=0;j<name.length;j++){
                    if(photo[i][p].equals(name[j])){
                        answer[i]+=yearning[j]; 
                    }
                }
            }
        }
        return answer;
    }
}