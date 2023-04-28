class Solution {
    public int solution(int n) {
        return n%7!=0?(n/7)+1:n/7;
        // 삼항 연산자 7로 나눈 나머지 값이 0이 아닐때 (n/7)+1 을 가지고 0이라면 n/7 의 값을 가진다.
    }
}