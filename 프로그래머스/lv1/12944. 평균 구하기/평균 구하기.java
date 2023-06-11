class Solution {
    public double solution(int[] arr) {
        double num = 0;
        for(int a:arr){
            num+=a;
        }
        double answer = (double)num/arr.length;
        return answer;
    }
}