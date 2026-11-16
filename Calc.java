public class Calc {
	
	public static void main(String[] args) {
		if (args.length < 2)  {
			System.err.println("Not enough arguments  :(");
			return;
		}
		int[] nums = parse(args);
		int result = 0;
		switch(args[0].toLowerCase()) {
			default: System.err.println("Unknown Operation: " + args[0]); return; 
			case "add": result = sum(nums); break;
			case "mult": result = product(nums); break;
			case "max": result = max(nums); break;
			case "min": result = min(nums); break;
		}
		System.out.println(result);
		
	}
	public static int[] parse(String[] strs) {
		int[] nums = new int[strs.length-1];
		for(int i = 1;i < strs.length;i++){
			nums[i-1] = Integer.valueOf(strs[i]);
		}
		return nums;
	}
	public static int sum(int[] nums) {
		int sum = 0;
		for (int num : nums) sum += num;
		return sum;
	}
	public static int product(int[] nums) {
		int product = 1;
		for (int num : nums) product *= num;
		return product;
	}
	public static int max(int[] nums) {
		int max = nums[0];
		for (int num : nums) max = num > max ? num : max;
		return max;
	}
	public static int min(int[] nums) {
		int min = nums[0];
		for (int num : nums) min = num < min ? num : min;
		return min;
	}
}
