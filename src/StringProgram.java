import java.util.HashMap;

public class StringProgram {
	public static void main(String[] args) {
		String str[] = { "abcijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyzhujhjhnj" };
		checkPanagram(str);
	//	System.out.println(b);
	}

	private static void checkPanagram(String[] str) {
	
		int count = str.length;
		int number = 0;
		int var=0;
		
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < str[i - 1].length(); j++) {
				HashMap<Character, Integer> map = new HashMap<Character, Integer>();
				char c = str[i - 1].toString().charAt(j);
				if (!map.containsKey(c)) {
					
					map.put(c, 1);
					number++;
				} else {
					map.put(c, map.get(c) + 1);
				}
			}

			if (number > 26) {
		
				number=0;
				//return 1;
				System.out.println("1");
			} else {
				number=0;
				System.out.println("0");
			//return 0;
			}



		}
	//	return 0;
		

	}
}
