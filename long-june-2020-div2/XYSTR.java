import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class XYSTR {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(input.readLine());
		while(t-->0) {
			String s = input.readLine();
			int sum = 0;
			
			for(int i=0, j=1; j<s.length(); i++, j++) {
				if(s.charAt(i) != s.charAt(j)) { 
					sum ++;
					i++;
					j++;
				}
			}
			System.out.println(sum);
		}
	}
}