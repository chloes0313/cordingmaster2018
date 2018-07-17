package algo;

import java.util.Arrays;

public class SameNum {
	public static void main(String[] arg) {
		int[] arr = {1,1,3,3,0,1,1};
		solution(arr);
	}
	public static int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        answer[0] = arr [0];
        int len = 1;
        for(int i = 1, j = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                    continue;
            }
            answer[j] = arr[i];
            j++;
            len++;
        }
        
        int[] tmp = new int[len];
        for(int i = 0; i < len; i++) {
        	tmp[i] = answer[i];
        }

        answer = tmp;
        System.out.println(Arrays.toString(answer));
        return answer;
	}
	
}