class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double sqrt = Math.sqrt(n);  //Math 클래스의 sqrt() 함수는 제곱근을 구할 수 있다.
                                    //sqrt(x) x 에 제곱근을 구하고 싶은 수를 넣는다.
        if(sqrt % 1 == 0){
            answer = (long) Math.pow(sqrt+1,2); //Math 클래스의 pow() 함수는 제곱을 구할 수 있다.
                                                //pow(x,y) x를 y만큼 곱해준다.
        } else answer = -1;
        
        return answer;
    }
}