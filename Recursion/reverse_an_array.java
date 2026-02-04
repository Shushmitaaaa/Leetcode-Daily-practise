//recursion on 2 pointers
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        //recursion on 2 pointers
        int l=0;
        int r=arr.length-1;
        swap(arr,l,r);
    }
    private static void swap(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        swap(arr,l+1,r-1);
    }
}

//using single variable 
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i=0;
        int n=arr.length;
        swap(arr,i,n);
    }
    private static void swap(int arr[],int i,int n){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        swap(arr,i+1,n);
    }
}
