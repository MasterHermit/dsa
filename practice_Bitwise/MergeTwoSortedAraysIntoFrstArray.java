import java.util.*;
public class MergeTwoSortedAraysIntoFrstArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,t=nums1.length-1;
          //i last index of nums1 values
          //j last index of nums2
          //t total index
          while(i>=0&&j>=0){
              if(nums1[i]>=nums2[j]){
                  nums1[t]=nums1[i];
                  i--;
                  t--;
              }
              else{
                  nums1[t]=nums2[j];
                  j--;
                  t--;
                  
              }
          }
          while(j>=0&&t>=0){
              nums1[t]=nums2[j];
              j--;
              t--;
          }
          
      }
      static void mergeBitManipulation(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
  //arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
   //No. of arguments to be copied are decided by len argument.
  //The components at source_Position to source_Position + length – 1 are copied to destination array from destination_Position to destination_Position + length – 1
          Arrays.sort(nums1);
       
          
      }
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,3,5};
        mergeBitManipulation(nums1,3,nums2,3);
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
    
}
