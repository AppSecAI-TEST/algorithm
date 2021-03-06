package com.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by donghao on 2017/8/10.
 */
public class TwoSum {
    public static void main(String[] agrs){
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers,target);
        for (int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
