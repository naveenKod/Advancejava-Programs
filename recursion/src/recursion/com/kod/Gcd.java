package recursion.com.kod;

public class Gcd {
public int gcd(int m, int n) {
	if(n==0) {
		return m;
	}else {
		return gcd(n,n%m);
	}
}
}
