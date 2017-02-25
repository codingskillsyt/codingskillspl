
public class Loop {

	// while(a > 5) {System.out.println("ala");}
	
	// for(int i = 0; i < 5; i++) {Sytem.out.println(i);}
	// i++; i = i + 1; i += 1; ++i;
	
	//   *      2 spacje, *              1      i*2 + 1
	//  ***     1 spacje, * * *          3
	// *****    0 spacji ** * **         5
	
	// 4 5 6
	
	public static void printTree(int size) {
		for(int i = 0; i < size; i++) {
			System.out.println(
					getStringFromChar(' ', size - i - 1) + getStringFromChar('*', i * 2 + 1));
		}
	}

	public static String getStringFromChar(char c, int times) {
		String out = "";
		for (int i = 0; i < times; i++) {
			out = out + c;
		}
		return out;
	}
	
	
	public static void main(String[] args) {
		int treeSize = 4;
		while (treeSize < 7) {
			printTree(treeSize);
			treeSize += 1;
		}
	}
	
}
