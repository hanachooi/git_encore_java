import java.util.Arrays;

public class TwoAryMain {

	// 2차원 배열은 배열의 배열
	// 선언방법 : int[][] numAry, int numAry[][]
	public static void main(String[] args) {

		/*
		int[][] numAry = {{1,2,3,},{4,5,6}};
		System.out.println("length : " + numAry.length);
		System.out.println("numAry[0] : " + numAry[0].length);
		
		for(int i=0; i<numAry.length; i++) {
			for(int j = 0; j<numAry[i].length; j++) {
				System.out.println("i = " + i + ", j = " + j + " " + numAry[i][j] + '\t');
			}
			System.out.println();
		}
		*/
		// 구구단의 결과를 2차원에 담는다면?
		// 출력예시) 2단 : 2 4 .... 18 
		// 3단 : 3 6 ... 27
		int[][] arr = new int[10][10];
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				arr[i][j] = (i*j);
			}
		}
		for(int i=1; i<arr.length; i++) {
			System.out.println((i+1) + " 단 : ");
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
