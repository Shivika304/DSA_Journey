class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0,j=0;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
            if((arr[i]+arr[j])==target){
                return new int[]{i+1,j+1};
            }
        }
    }
    return new int[0];
  }
}
