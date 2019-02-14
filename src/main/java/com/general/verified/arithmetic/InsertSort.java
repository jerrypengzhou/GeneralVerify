package com.general.verified.arithmetic;

public class InsertSort {
    public static void main(String []args){
        int []arr ={1,4,2,7,9,8,3,6};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     * @param arr
     */
    private static void sort(int []arr){
        // 增量gap，并逐步缩小增量
        for(int gap=arr.length/2; gap>0; gap = gap/2){
            // 从第gap个元素，逐个对其所在组进行直接插入排序操作
            for(int i=gap; i<arr.length; i++){
                int j = i;
                while(j-gap>=0 && arr[j]<arr[j-gap]){
                    // 插入排序采用交换法
                    swap(arr,j,j-gap);
                    j-=gap;
                }
            }
        }
    }
    /**
     * 交换数组元素
     * @param arr
     * @param a
     * @param b
     */
    private static void swap(int []arr,int a,int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

}
