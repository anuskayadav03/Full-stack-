class Solution {
    public static void main(String[]args){
        int[] nums={1,2,3,2,0};
       for(int i=0;i<nums.length;i++){
        for(int j=nums.length;j<i;j++){
            if(nums[i]!=nums[j]){
                i++;
                j++;
                return false;
            }
        }
       } 
       return true;
    }
}
