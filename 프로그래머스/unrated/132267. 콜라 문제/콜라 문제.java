class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int i= n/a;
            n=n-(i*a);
            n=n+(i*b);
            answer+=i*b;
        }
        return answer;
    }
}