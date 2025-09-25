package Easy;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        //Declaring the left and right pointer from starting and last
        int left = 0;
        int right = nums.length - 1;

        //now iterating over the array till left == right
        while(left<=right){
            //Declaring the mid that is middle number
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){ // Checking whether mid-equals or target or not
                return mid; // returning mid
            } else if(nums[mid] < target){ // if mid smaller than target then increment and asign mid to left
                left = mid + 1;
            } else{
                // else decrement and asign mid to right
                right = mid - 1;
            }


        }return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,2,9,3,8,5,1,4,6,2,7};
        int target = 7;
        System.out.println(search(nums, target));
    }
}
