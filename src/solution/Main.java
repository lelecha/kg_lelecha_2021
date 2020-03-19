package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {

		
		String s1 = arg[0];
		String s2 = arg[1];
		
		if(s1.length() != s2.length()) {
			System.out.println(false);
			return;
		}
		Map<Character, Character> map = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++) {
			if(map.containsKey(s1.charAt(i)) && map.get(s1.charAt(i)) != s2.charAt(i) ) {
				System.out.println(false);
				return;
			}
			map.put(s1.charAt(i), s2.charAt(i));
		}
		
		System.out.println(true);
	}
}
