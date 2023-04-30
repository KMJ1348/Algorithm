class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        int x = dot[0]>0 ? 1 : 0;  //삼항 연산자. (조건식) ? (조건식이 참일경우 실행될 코드) : (조건식 거짓일 경우 코드) 
        int y = dot[1]>0 ? 1 : 0;  // 1일 경우 양수, 0일경우 음수
        
        if ( x == 1 && y == 1 ){
            answer = 1;
        } else if (x == 0 && y == 1 ){
            answer = 2;
        } else if (x == 0 && y == 0 ){
            answer = 3;
        } else if ( x == 1 && y == 0 ){
            answer = 4;
        }
        
        return answer;
    }
}