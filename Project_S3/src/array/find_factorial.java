package array;

public class find_factorial {

	public static void main(String[] args) {
		int n = 5;
		int ans = factorial(n);
		System.out.println(ans);
	}

	private static int factorial(int n) {
		if(n == 0 || n == 1) return 1;
		int ans = 1;
		while(n>=1) {
			ans = ans * n;
			n--;
		}
		return ans;
	}

}
