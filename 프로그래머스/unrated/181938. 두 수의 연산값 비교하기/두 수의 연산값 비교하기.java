class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = Integer.toString(a) + Integer.toString(b);
        int a_b = Integer.valueOf(ab);
        
        if(a_b>2*a*b){
            return a_b;
                
            }else {
                return 2*a*b;
            }
        
        }
    }
    
