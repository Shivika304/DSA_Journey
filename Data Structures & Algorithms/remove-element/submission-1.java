class Solution {
    
    public int removeElement(int[] nums, int val) {
        // int c=0,i=0,j=nums.length-1;
        // while(i<=j){
        //    if(nums[i]!=val){
        //       i++;
        //       continue;
        //    }
        //    if(nums[j]==val){
        //     j--;
        //     continue;
        //    }
        //    int h=nums[i];
        //    nums[i]=nums[j];
        //    nums[j]=h;
        // i++;
        // j--;
        //    }
        
        // return i;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}