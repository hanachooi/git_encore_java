import java.util.Random;

public class ArrayMain {

	public static void main(String[] args) {

		int[] ary = new int[10];
		System.out.println("배열의 길이 : " + ary.length);
		
		Random random = new Random();
		
		for(int idx = 0; idx<ary.length; idx++) {
			ary[idx] = random.nextInt(100) + 1;
		}
		
		System.out.println(">>> enhanced loop <<<");
		for(int data : ary) {
			System.out.println(data + "\t");
		}
		
		String ssn = "777777-77777";
		char[] n = ssn.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		sb.append("apple");
		sb.append("dddd", 0, 3);
		System.out.println(sb.toString());
	}

}
