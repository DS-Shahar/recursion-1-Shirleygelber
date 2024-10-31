public class Main {
	public static void main(String[] args) {
		System.out.println(ex9(13579));
		
	}
	public static int ex1(int n) {
		if (n==0)
			return 0;
		return n+ex1(n-1);
	}
	public static int ex2(int n) {
		if (n==0)
			return 1;
		return n*ex1(n-1);
	}
	public static int ex3(int n) {
		if (n==0){
			return 1;
		}
		if (n%2!=0) {
			return ex3(n-1)*n;
		}
		return ex3(n-1);
	}
	
	public static int ex4(int n) {
		if (n == 0) {
			return 0;
		}
		
		return ex4(n / 10) + 1;
	}
	public static int ex5(int n1, int n2) {	
		if (n1 == 0) {
			return 0;
		}
		if (n1<0)
			return -1;
		return ex5(n1 - n2, n2) + 1;
	}
	
	public static int ex6(int n1, int n2) {
		if (n1<n2)
			return (n1);
		return ex6(n1-n2,n2);

	}
	public static boolean ex7(int x,int y) {
		if (y>x)
			return false;
		if (y==x)
			return true;
		return ex7(x-y,y);
		
	}
	public static boolean ex8(int n,int i) {
		if (i>(n/2)+1){
			return true;
		}
		if (n%i==0) {
			return false;
		}
		return ex8(n,i+1);
	}
	public static boolean ex9(int n) {
	    if (n < 10) {
	        return true;
	    }
	    int lastDigit = n % 10;
	    int secondLastDigit = (n / 10) % 10;
	    if ((lastDigit % 2) != (secondLastDigit % 2)) {
	        return false;
	    }
	    return ex9(n / 10);
	}
}
