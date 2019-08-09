import java.util.Arrays;

public class anagram
{
	 static void  isAnagram(String s1,String s2) {
		String str1 = s1.replaceAll("//s", "");
		String str2 = s2.replaceAll("//s", "");
		
		boolean status = true;
		
		if(str1.length()!=str2.length()) {
			status= false;
		}
		
		else {
			char[] ArrayS1 = str1.toLowerCase().toCharArray();
			char[] ArrayS2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status){
			System.out.println("is Anagram");
		}
		else {
			System.out.println("is not Anagram");
		}
		
	}
	 public static void main(String[] args) {
		isAnagram("keep", "peek");
	}
}
