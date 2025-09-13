package MergeSortedArray;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s=m+n;
        int[] arr= new int[s];
        int i=0;
        int j=0;
        int k=0;
        while(m>j && n>k){
            if(nums1[j]<nums2[k]){
                arr[i]=nums1[j];
                j++;
                i++;
            }
            else{
                arr[i]=nums2[k];
                k++;
                i++;
            }
        }
        while(m>j){
            arr[i]=nums1[j];
            i++;
            j++;
        }
        while(n>k){
           arr[i]=nums2[k];
           i++;
           k++; 
        }
        for(int p=0;p<s;p++){
            nums1[p]=arr[p];
        }
    }
}