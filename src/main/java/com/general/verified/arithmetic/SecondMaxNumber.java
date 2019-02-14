
package com.general.verified.arithmetic;

public class SecondMaxNumber {

    public static void main(String[] args) {
        // 初始化一个序列
        int[] array = {
                1, 3, 4, 5, 2, 6, 9, 7, 8, 0 ,10, 19 ,15
        };
        System.out.println("第二大的数字是："+ getSecondMaxNumberInArray(array));
    }


    public static int getSecondMaxNumberInArray(int[] array){
        int[] maxArray = {0,0};
        for (int i : array) {
            if(maxArray[0] < i){
                maxArray[0] = i;
                adjustSequence(maxArray);
            }
        }
        return maxArray[0];
    }

    private static int[] adjustSequence(int [] maxArray){
        if(maxArray[0] > maxArray[1]){
            int temp = maxArray[0];
            maxArray[0] = maxArray[1];
            maxArray[1] = temp;
        }
        return maxArray;
    }
}
