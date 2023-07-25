class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int length= board.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(board[i][j]==1){
                    if(board[Math.max(0,i-1)][Math.max(0,j-1)]!=1){
                        board[Math.max(0,i-1)][Math.max(0,j-1)]=2;
                    }
                    if(board[Math.max(0,i-1)][j]!=1){
                        board[Math.max(0,i-1)][j]=2;
                    }
                    if(board[Math.max(0,i-1)][Math.min(length-1,j+1)]!=1){
                        board[Math.max(0,i-1)][Math.min(length-1,j+1)]=2;
                    }
                    if(board[i][Math.max(0,j-1)]!=1){  
                        board[i][Math.max(0,j-1)]=2;
                    }
                    if(board[i][Math.min(length-1,j+1)]!=1){
                        board[i][Math.min(length-1,j+1)]=2;
                    }
                    if(board[Math.min(length-1,i+1)][Math.max(0,j-1)]!=1){
                        board[Math.min(length-1,i+1)][Math.max(0,j-1)]=2;
                    }
                    if(board[Math.min(length-1,i+1)][j]!=1){
                        board[Math.min(length-1,i+1)][j]=2;
                    }
                    if(board[Math.min(length-1,i+1)][Math.min(length-1,j+1)]!=1){
                        board[Math.min(length-1,i+1)][Math.min(length-1,j+1)]=2;
                    }
                }
            }
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}