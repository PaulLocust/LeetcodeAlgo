package ArrayString;
/*
 * 135. Candy
 * Hard
 */
public class Candy {

	public static void main(String[] args) {
		/**
		 * Смысл задачи в том, чтобы сделать 2 обхода.
		 * В первом обходе ratings мы смотрим, если следующее число больше текущего, 
		 * то в массиве единиц candyArr мы берем текущее число и прирваниваем его вместе с единицей
		 * к следующему.
		 * После того, как мы дойдем до конца массива, мы проводим следующий обход,
		 * но уже справа-налево, механика действий схожа, но тут мы должны учитывать 
		 * уже полученные при первом обходе числа. 
		 * Math.max(candyArr[i-1], candyArr[i] + 1);
		 * Это выражение необходимо для того, чтобы определить, что окажется больше:
		 * уже полученное при первом обходе число или же полученное в текущей итерации 2-го обхода.
		 * Всё! 
		 */
		
		int[] ratings = {1,3,4,5,2}; // {1, 2, 1, 1, 1}  - {1,2,1,2,1}
		int n = ratings.length;
		
		int[] candyArr = new int[n]; //{1,1,1,1,1,1,1}
		for (int i=0;i<n;i++) {candyArr[i]=1;}
	
		for (int i = 0; i < n-1; i++) {
			if (ratings[i] < ratings[i+1]) {
				candyArr[i+1] = candyArr[i] + 1;
			}
		}
		
		for (int i = n-1; i > 0; i--) {
			if (ratings[i-1] > ratings[i]) {
				candyArr[i-1] = Math.max(candyArr[i-1], candyArr[i] + 1);
			} 
		}
		int ans = 0;
		for (int a: candyArr) {
			System.out.print(a + " ");
			ans += a;
		}
		
		System.out.println("\n"+ans);
		
		
	}

}
