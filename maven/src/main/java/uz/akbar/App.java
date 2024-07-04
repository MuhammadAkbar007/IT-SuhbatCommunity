package uz.akbar;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 35, 67, 12, 7, 89, 8, 15};
        Arrays.sort(nums, (a, b) -> {
            if (a < b)
                return 1;
            return -1;
        });
    }
}
