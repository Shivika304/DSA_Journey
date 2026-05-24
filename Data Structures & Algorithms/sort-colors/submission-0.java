class Solution {
    public void swap(int arr[],int a,int b){
        int h=arr[b];
        arr[b]=arr[a];
        arr[a]=h;
    }
    public void sortColors(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
            System.out.print(arr);
        
    }
}