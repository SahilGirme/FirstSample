
public class RemoveVowels {

	public static String remVow(String str) {
		return str.replaceAll("[AEIOUaeiou]", "");
		
	}
	public static void main(String[] args) {
		String s="java";
		System.out.println(remVow(s));
	}
}
