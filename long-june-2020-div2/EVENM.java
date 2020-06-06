import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class EVENM {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(input.readLine());
		while(t-->0) {
			int n = Integer.parseInt(input.readLine());
			int temp = 1;
			
			for(int i=0; i<n; i++) {
				if(i%2 == 0) {
					for(int j=0; j<n; j++) {
						System.out.print((temp++) + " ");
					}
					System.out.println();
				}
				else {
					temp += n-1;
					for(int j=0; j<n; j++) {
						System.out.print((temp--) + " ");
					}
					System.out.println();
					temp += n+1;
				}
			}
		}
	}
}