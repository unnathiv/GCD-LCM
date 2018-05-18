
public class Gcd {
static int a;
static int b;
static int c;
public static int gcd(int a,int b) {
	
	if(a%b==0)
	return b;
	return gcd(b, a%b);
  }
public static int lcm(int a,int b) {
	int c=gcd(a,b);
	int l=(a*b)/c;
	return l;
}
public static void main(String[] args) {
	Gcd gcd=new Gcd();
	System.out.println(+Gcd.gcd(3, 7));
	System.out.println(+Gcd.lcm(3, 7));
	}
}
