public class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String result = "";
        result += my_string.substring(0, s); // 인덱스 s 이전의 문자열을 가져옴
        result += overwrite_string; // overwrite_string을 가져온 문자열 뒤에 이어붙임
        result += my_string.substring(s + overwrite_string.length()); // 인덱스 s + overwrite_string의 길이 이후의 문자열을 가져옴
        return result;
    }
}