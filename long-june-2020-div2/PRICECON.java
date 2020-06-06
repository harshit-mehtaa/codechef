import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class PRICECON {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(input.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(input.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			String [] p = input.readLine().split(" ");
			
			int init_sum = 0;
			int reduced_sum = 0;
			int temp = 0;
			
			for(int i=0; i<n; i++) {
				temp = Integer.parseInt(p[i]);
				
				init_sum += temp;
				reduced_sum += (temp>k)?k:temp;
			}
			System.out.println(init_sum-reduced_sum);
		}
	}
}