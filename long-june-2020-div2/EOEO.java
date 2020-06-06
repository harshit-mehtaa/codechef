import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

class EOEO {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		
		int t = Integer.parseInt(input.readLine());
		while(t-->0) {
			BigInteger n = new BigInteger(input.readLine());	
			
			while((n.mod(two)).equals(zero)) {
				//n /= 2;
				n = n.divide(two);
			}
			if(n.equals(one)) {
				System.out.println("0");
			}
			else {
				//System.out.println((n-1)/2);
				n = n.subtract(one);
				n = n.divide(two);
				System.out.println(n.toString());
			}
		}
	}
}