package project_0629;

public class gogodan {
	public static void main(String[] args) {
		
		System.out.println("구구단을 외우자!---------------------------------------------------------------------------------------------------------------------------------------");
		
		for(int j = 1 ; j < 10 ; j++) {
			System.out.printf("[%d단] : ", j);
			for(int i = 1; i < 10 ; i++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}

