package ru.stqa.geometry;

import Arrays.DVD;
import Arrays.DVDCollection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DVDCollection collection = new DVDCollection();
        // System.out.println(collection.dvdCollection[7]);


//        int[] squareNumbers = new int[10];
//        for (int i = 0; i < 10; i++) {
//            int square = (i + 1) * (i + 1);
//            squareNumbers[i] = square;
//            System.out.println(squareNumbers[i]);
//        }
//
//        for (int square : squareNumbers) {
//            System.out.println(square);
//        }

//        int[] array = new int[6];
//
//// Current length is 0, because it has 0 elements.
//        int length = 0;
//
//// Add 3 items into it.
//        for (int i = 0; i < 3; i++) {
//            array[i] = i * i;
//            // Each time we add an element, the length goes up by one.
//            length++;
//        }
//
//        System.out.println("The Array has a capacity of " + array.length);
//        System.out.println("The Array has a length of " + length);


//        int[] nums = {1, 1,1, 0, 0, 1, 1, 1,1};
//        int[] nums2 = {12,22,345,2,6,7896};
//        int[] nums3 = {-4,-1,0,3,10};
//        int[] arr = {1,0,2,3,0,4,5,0};
        // Given a binary array nums, return the maximum number of consecutive 1's in the array.
      //  collection.findMaxConsecutiveOnes(nums);
        // Given an array nums of integers, return how many of them contain an even number of digits.
        //System.out.println(collection.findEvenNumOfDigits(nums2));

//
//
//        for (int sNum:collection.sortedSquares(nums3)){
//            System.out.println(sNum);
//        }
      //  System.out.println(Arrays.toString(collection.duplicateZeros(arr)));


        //Merge sorted array

       // int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3;
//        int n = 3;
//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m = 0;
//        int n = 1;
      //  System.out.println(Arrays.toString(collection.mergeSortedArray(nums1,nums2,m,n)));
//
       // System.out.println(Arrays.toString(collection.mkArrayTest()));

//        int[] nums ={0,1,2,2,3,0,4,2};
//        int val = 2;
//        int k = collection.removeElement(nums, val);
//        int[] nums2 = new int[k];
//        System.out.println("k = " + k);
//
//        for (int i = 0; i < k; i++) {
//            nums2[i] = nums[i];
//
//        } System.out.print("array: "+ Arrays.toString(nums2));


//        // remove duplicates
//        int[] nums= {0,0,1,1,1,2,2,3,3,4};
//        //collection.removeDuplicates(nums);
//        //System.out.println(collection.removeDuplicates(nums));
//
//        int[] arr= {-20,8,-6,-14,0,-19,14,4};
//        System.out.println(collection.checkIfExist(arr));

        // Mountain array
        int[] arr = {0,3,2,1};
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(collection.validMountainArray(arr));
    }

}