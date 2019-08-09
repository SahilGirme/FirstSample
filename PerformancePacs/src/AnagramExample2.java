import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> anagramMap = new HashMap<>();

		String[] inputwords = {"cat","omt","act","dda","tac","dad","add","tom","mot"};
		for (String input : inputwords) {
			char[] word = input.toCharArray();
			Arrays.sort(word);
			String key = String.valueOf(word);
			if (!anagramMap.containsKey(key));
			{
				anagramMap.put(key, new ArrayList<String>());

			}
			anagramMap.get(key).add(input);
		}
		// System.out.println("Anagram Map ="+ anagramMap);
		anagramMap.forEach((word, anagrams) -> {
			System.out.println(word);
			System.out.println(anagrams);

		});
		
	}

}
