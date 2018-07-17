package algo;

public class Palindrome {
	public int solution(String str)
    {
        int answer = 1;
        
        /*
        String reverse,words;
        Loop1:
        for (int i = s.length(); i >= 1; i--) {
            for (int j = 0; j < s.length()-(i-1); j++) {
                words = s.substring(j,j+i);
                reverse = new StringBuffer(words).reverse().toString();
                if(words.equals(reverse)) {
                    answer = reverse.length();
                    break Loop1;
                }
            }
        }*/
        
         // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 
        int start = 0;
        int len = str.length();
 
        int low, high;
 
        for(int i = 1; i < len; ++i) {
            low = i - 1;
            high = i;
            while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > answer) {
                    start = low;
                    answer = high - low + 1;
                }
                --low;
                ++high;
            }
 
            low = i - 1;
            high = i + 1;
            while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > answer) {
                    start = low;
                    answer = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        return answer;
    }
}
