import java.util.Arrays;

public class Temp {

	int[] nums = new int[] { 2, 35, 67, 12, 7, 89, 8, 15 };Arrays.sort(nums,(a,b)->
	{
            if (a < b)
                return 1;
            if (a > b)
                return -1;
            return 0;
        });

	System.out.println(Arrays.toString(nums));

	/************************************************/
	public class App {
		public static void main(String[] args) {
			int[] nums = new int[] { 2, 35, 67, 12, 7, 89, 8, 15 };
			Arrays.sort(nums, (a, b) -> Integer.compare(b, a)); // Sorting in descending order

			System.out.println(Arrays.toString(nums));
		}
	}

}
