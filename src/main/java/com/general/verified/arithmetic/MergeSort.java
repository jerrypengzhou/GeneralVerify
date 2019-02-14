package com.general.verified.arithmetic;

public class MergeSort{
    public static void main(String []args){
        int [] sortA = {8,10,14,18,24,32,40,48};
        int [] sortB = {3,9,11,13,19,29,37};
        int [] retunrSrot = merge(sortA, sortB);
        for (int i : retunrSrot) {
            System.out.println(i);
        }
    }

    private static int[] merge(int[] sortA,int[] sortB){
        int pa = 0;
        int pb = 0;
        int px = 0;
        int [] sertX = new int[sortA.length + sortB.length];
        // 如果两个数组是否有没有到底
        while(pa < sortA.length && pb < sortB.length){
            // 插入排序的指针地址值比较
            if(sortA[pa] < sortB[pb]){
                sertX[px++] = sortA[pa++];
            }else {
                sertX[px++] = sortB[pb++];
            }
        }
        while(pa < sortA.length){
            sertX[px++] = sortA[pa++];
        }
        while(pb < sortB.length){
            sertX[px++] = sortA[pb++];
        }
        return sertX;
    }
}
