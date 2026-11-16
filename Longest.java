public class Longest {
	
	public static void main(String[] args) {
		if (args.length <= 0)  {
			System.err.println("No arguments  :(");
			return;
		}
		String longest = longest(args);
		String first = first(args);
		System.out.printf("Longest: %s (%d letters) \nFirst alphabetically: %s \n",longest,longest.length(),first );
	}
	
	public static String longest(String[] strs) {
		String longest = strs[0];
		for (String str : strs) longest = longest.length() < str.length() ? str : longest;
		return longest;
	}
		
	public static String first(String[] strs) {
		String first = strs[0];
		for (String str : strs) first = first.compareTo(str) > 0 ? str : first;
		return first;
	}
	
	
}

