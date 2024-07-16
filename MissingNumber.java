public class MissingNumber {

    public int missingNumber(int[] nums) {  
        int org_sum = 0;
        int nums_sum = 0;
        
        // Calculate sum of all elements in nums
        for(int j = 0; j < nums.length; j++) {
            nums_sum += nums[j];
        }
        
        // Calculate sum of numbers from 0 to nums.length
        for(int i = 0; i <= nums.length; i++) {
            org_sum += i;
        }
        
        // The missing number is the difference between org_sum and nums_sum
        return org_sum - nums_sum;
    }
        

    public static void main(String[] args) {
        // Example usage
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1, 2, 4};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        
        MissingNumber solution = new MissingNumber();
        
        System.out.println("Missing number in nums1: " + solution.missingNumber(nums1)); // Expected output: 2
        System.out.println("Missing number in nums2: " + solution.missingNumber(nums2)); // Expected output: 3
        System.out.println("Missing number in nums3: " + solution.missingNumber(nums3)); // Expected output: 8
    }
}
