package Array;

public class array_duplicate {
    public static void arr_duplicate(int[] nums){
        int n = nums.length;

        for (int i = 0; i<n ; i++) {
            nums[nums[i]% n] += n;
        }
        for (int i = 0; i< n;i++) {
            if(nums[i] >= 2 * n ){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 ={0,3,2,1};
        int[] nums2 ={2,3,1,2,3};

        arr_duplicate(nums1);
        arr_duplicate(nums2);
    }
}
