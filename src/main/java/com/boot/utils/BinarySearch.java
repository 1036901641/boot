package com.boot.utils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @author ：王继创
 * @version : 1.0
 * @description : TODO
 * @date : 2022/7/19 11:09
 */
public class BinarySearch {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap(10);
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(5, "Java中文社群");
        map.put(4, "MyBatis framework");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for (Integer key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
        map.forEach((ke1y, value) -> {
            System.out.println(ke1y);
            System.out.println(value);
        });
    }
    public static int serach(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right){
            if(numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                return new int[] {left + 1, right + 1};
            }
        }
        return null;
    }
    
}
