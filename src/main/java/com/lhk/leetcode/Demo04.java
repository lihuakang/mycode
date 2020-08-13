package com.lhk.leetcode;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 16:36
 *
 * 寻找两个正序数组的中位数
 *   中位数就是最中间的数，或者最中间两个数的平均值
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] num1={1,3};
        int[] num2={2};
        double a=findMedianSortedArrays(num1,num2);
        double b=findMedianSortedArrays2(num1,num2);
        System.out.println(a);
        System.out.println(b);
    }
    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        int[] newnums=new int[nums1.length+nums2.length];
        int m=nums1.length;
        int n=nums2.length;
        if (m==0){
            if (n%2==0){
                return (nums2[n/2-1]+nums2[n/2])/2.0;
            }else {
                return nums2[n/2];
            }
        }
        if (n==0){
            if (m%2==0){
                return (nums1[n/2-1]+nums1[n/2])/2.0;
            }else {
                return nums1[n/2];
            }
        }
        int count=0;
        int i=0,j=0;
        while (count!=(m+n)){
            if (i==m){
                while (j!=n){
                    newnums[count++]=nums2[j++];
                }
                break;
            }
            if (j==n){
                while (i!=m){
                    newnums[count++]=nums1[i++];
                }
                break;
            }
            if (nums1[i]<nums2[j]){
                newnums[count++]=nums1[i++];
            }else {
                newnums[count++]=nums2[j++];
            }
        }
        if (count%2==0){
            return (newnums[count/2-1]+newnums[count/2])/2.0;
        }else {
            return newnums[count/2];
        }
    }

    //方式二，遍历len/2,,奇数就是len/2这个位置的数
    //偶数就是len/2和len/2-1（上一次遍历位置）位置数的和除以2.0
    public static double findMedianSortedArrays2(int[] A,int[] B){
        int m=A.length;
        int n=B.length;
        int len=m+n;
        int left=-1,right=-1;
        int aStart=0,bStart=0;
        for (int i=0;i<=len/2;i++){
            left=right;
            if (aStart<m && (A[aStart]<=B[bStart] || bStart>=n)){
                right=A[aStart++];
            }else {
                right=B[bStart++];
            }
        }
        if ((len & 1)==0){//偶数
            return (left+right)/2.0;
        }else {
            return right;
        }
    }
}
