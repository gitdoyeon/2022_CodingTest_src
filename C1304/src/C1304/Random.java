package C1304;

public class Random {

	public static void main(String[] args) {
	
		 int[][] random = new int[4][4];
		 getRandom(random);
	}
	private static void getRandom(int[][] random) {
		
		for(int i=0; i<random.length; i++) {
			for(int j=0; j<random[i].length; j++) {
				random[i][j]=(int)(Math.random()*10+1);
				System.out.print(random[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
