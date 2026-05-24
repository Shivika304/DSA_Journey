class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        //     if(map.get(num)>n/2){
        //         return num;
        //     }
        // }
        // return -1;
        int c=0,elem=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                elem=nums[i];
                c=1;
            }
            else if(nums[i]==elem){
                c++;
            }
            else{
                c--;
            }
        }
        return elem;
    }
}