package gitproject;

public class test {

	public static void main(String[] args) {
		int number = 10;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 1) {
				System.out.println(i + ":奇数");
			} else if (i % 2 == 0) {
				System.out.println(i + ":偶数");
			}
			System.out.println("テスト");
		}

	}
}
