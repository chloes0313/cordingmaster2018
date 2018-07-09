package project_0629;

public class Astarisk {

	public static void main(String[] args) {
	
		char[][] arr = new char[9][9];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				
				// 마름모
				/*if(i+j >= 4 && i+j <= 12 && Math.abs(j-i) <= 4) {
					arr[i][j] = '■';
			
				} else {
					arr[i][j] = '□';
				}*/
				
				//반쪽 마름모
				if(i == j || i+j == 8) {
					arr[i][j] = '■';
			
				} else {
					arr[i][j] = '□';
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
