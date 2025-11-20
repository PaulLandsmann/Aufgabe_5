package h3;

public class H3_main {

	public static void main(String[] args) {
		int[][] einheiten = {
				{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,}
		};
		
		
		int input = 1227;
		int tem = input;
		
		while (tem > 0) {
			for(int i = 0; i < einheiten[0].length; i++) {
				if(tem >= einheiten[0][i]) {
					tem = tem - einheiten[0][i];
					einheiten[1][i]++;
					i--;
					
				}
			}
			
		}
		
		//for(int i = 0; i < einheiten.length; i++) {
		//	for(int j = 0; j < einheiten[0].length; j++) {
		//		System.out.print(einheiten[i][j] + " ");
		//	}
		//	System.out.println();
		//}

	}

}
