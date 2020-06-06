import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class CHFICRM {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(input.readLine());
		while(t-->0) {
			int n = Integer.parseInt(input.readLine());
			String [] p = input.readLine().split(" ");
			
			HashMap <Integer,Integer> bal = new HashMap <Integer,Integer> ();
			for(int i=1; i<=3; i++) {
				bal.put(i*5, 0);
			}
			
			int temp = 0;
			boolean result = true;
			
			for(int i=0; i<n; i++) {
				temp = Integer.parseInt(p[i]);
				if(temp == 5) {
					bal.put(5, bal.get(5)+1);
				}
				else if(temp == 10) {
					if(bal.get(5)-1 < 0) {
						result = false;
						break;
					}
					else {
						bal.put(5, bal.get(5)-1);
					}
					bal.put(10, bal.get(10)+1);
				}
				else if(temp == 15) {
					if(bal.get(10)-1 < 0) {
						if(bal.get(5)-2 < 0) {
							result = false;
							break;
						}
						else {
							bal.put(5, bal.get(5)-2);
						}
					}
					else {
						bal.put(10, bal.get(10)-1);
					}
				}
			}
			System.out.println((result==false)?"NO":"YES");
		}
	}
}