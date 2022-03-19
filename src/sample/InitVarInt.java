package sample;

public class InitVarInt {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("-- Output1 --");
		method1();
		
		System.out.println("-- Output2 --");
		method2();
	}
	
	// int型の変数を使って割引率を計算
		static void method1() {
			int price = 100;
			int discount = 3;
			int result = price - (price * discount / 10);
			
			System.out.println(price);
		}
		
		// int型の変数を使って割引率を計算2
		static void method2() {
			int result;
			int price, discount;
			
			price = 100;
			discount = 3;
			result = price - (price * discount / 10);
			
			System.out.println(price);
		}
}
