public class Two_Sum {
    public int[] twoSum(int[] numbers, int target) {
	// Start typing your Java solution below
	// DO NOT write main() function
		        
	int[] result = new int[2];
	for (int i = 0; i< numbers.length;i++)
	{
		for (int j = 0; j < numbers.length; j++)
		{
			if (numbers[i] + numbers[j] == target)
				{
				     result[0] = i+1;
				     result[1] = j+1;
				     return result;
				}
		 }
	}
	}
}
