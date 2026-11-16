public class Stats{
	
	
	public static void main(String[] args) {
		if (args.length <= 0)  {
			System.err.println("No arguments  :(");
			return;
		}
		int[] nums = parse(args);
		int sum = sum(nums);
		int min = min(nums);
		int max = max(nums);
		double average = (double)sum/nums.length; 
		double SD = standardDeviation(nums,average);
		System.out.printf("Count: %d \nSum: %d \nMin %d \nMax: %d \nAverage %.2f \nStandard Deviation: %.2f \n", nums.length, sum,min,max,average,SD);
		
		
		
	}
	public static int[] parse(String[] strs) {
		int[] nums = new int[strs.length];
		for(int i = 0;i < nums.length;i++){
			nums[i] = Integer.valueOf(strs[i]);
		}
		return nums;
	}
	public static double standardDeviation(int[] nums,double average) {
		int sum = 0;
		for (int num : nums) {
			sum+= Math.pow(num-average,2);
		}
		return Math.sqrt(sum/(nums.length-1));
	}
	public static int sum(int[] nums) {
		int sum = 0;
		for (int num : nums) sum += num;
		return sum;
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
