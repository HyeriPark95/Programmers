import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        //위치 정해주기
        int[][] arr={{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,1},{3,2}};
        HashMap<String,int[]> key = new HashMap<String,int[]>();
        key.put("1",arr[0]);
        key.put("2",arr[1]);
        key.put("3",arr[2]);
        key.put("4",arr[3]);
        key.put("5",arr[4]);
        key.put("6",arr[5]);
        key.put("7",arr[6]);
        key.put("8",arr[7]);
        key.put("9",arr[8]);
        key.put("*",arr[9]);
        key.put("0",arr[10]);
        key.put("#",arr[11]);
        
        //초기위치
        int[] lh={3,0};
        int[] rh={3,2};
        
        for(int i=0;i<numbers.length;i++){
            String number=Integer.toString(numbers[i]);
            if(number.equals("1")||number.equals("4")||number.equals("7")||number.equals("*")){
                answer+="L";
                lh=key.get(number);
            }else if(number.equals("3")||number.equals("6")||number.equals("9")||number.equals("#")){
                answer+="R";
                rh=key.get(number);
            }else{
                int[] mid=key.get(number);
                //왼쪽거리 구하기
                int lx=mid[0]-lh[0];
                int ly=mid[1]-lh[1];
                if(lx<0)lx=lx*-1;
                if(ly<0)ly=ly*-1;
                int leftdis=lx+ly;
                
                //오른쪽거리 구하기
                int rx=mid[0]-rh[0];
                int ry=mid[1]-rh[1];
                if(rx<0)rx=rx*-1;
                if(ry<0)ry=ry*-1;
                int rightdis=rx+ry;
                
                //거리가 더 적은쪽으로 움직이기
                if(leftdis<rightdis){
                    answer+="L";
                    lh=key.get(number);
                }else if(rightdis<leftdis){
                    answer+="R";
                    rh=key.get(number);
                }else if(rightdis==leftdis){
                    if(hand.equals("left")){
                        answer+="L";
                        lh=key.get(number);
                    }else{
                        answer+="R";
                        rh=key.get(number);
                    }
                }
            }
        }
        return answer;
    }
}