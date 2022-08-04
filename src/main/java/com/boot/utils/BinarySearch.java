package com.boot.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * @author ：王继创
 * @version : 1.0
 * @description : TODO
 * @date : 2022/7/19 11:09
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 9, 11};
        System.out.println(serach(nums, 9));
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
