class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length-2;i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(0, nums.length-1, nums);
        }
        else{
            for(int start = nums.length-1; start > pivot; start--){
                if(nums[start] > nums[pivot]){
                    swap(pivot, start, nums);
                    break;
                }
            }
            reverse(pivot+1, nums.length-1, nums);
        }
    }
    public void swap(int left, int right, int[] nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void reverse(int left, int right, int[] nums){
        while(left < right){
            swap(left, right, nums);
            left++;
            right--;
        }
    }
}
