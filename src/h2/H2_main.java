package h2;

public class H2_main {

	public static void main(String[] args) {
		
		int n = 20000;
		int digits = 0;
		int[] a = {0,0,0,0,0,0,0,0,0};
		int tem = n;
		if(n == 0) {
			digits = 1;
		}
		else {
			while(tem > 0) {
				tem = tem / 10;
				digits++;
			}
		}
		
		tem = n;
		
		for(int i = 0; i < digits; i++) {
			a[8 - i] = tem %10;
			tem = tem / 10;
		}
		
		
		System.out.println(n);
		System.out.println(digits);
		for(int i = 0; i < a.length; i++) System.out.print(a[i]);
		
	
	
	}

}
