package Arrays;


import ru.stqa.geometry.Main;

import java.sql.Array;

public class DVDCollection {

    public DVD[] dvdCollection;

    // Constructor for DVDCollection to initialize the array and add DVDs.
    public DVDCollection() {
        dvdCollection = new DVD[15];

        // Create DVD objects and add them to the dvdCollection array.
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");

        dvdCollection[7] = avengersDVD;
        dvdCollection[3] = incrediblesDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;
        dvdCollection[3] = starWarsDVD;

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }
        return max = Math.max(max, current);
    }

    public int findEvenNumOfDigits(int[] nums) {
        int evenNums = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if (length % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            int square = nums[i] * nums[i];
            nums[i] = square;
        }
        for (int x = 0; x < n; x++) {
            for (int j = 1; j < n - x; j++) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }

            }

        }
        return nums;

    }

    public int[] insertArray() {
        int[] intArray = new int[6];
        int length = 0;
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }
        intArray[length] = 10;
        length++;
        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[0] = 20;
        for (int i = 4; i >= 2; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[2] = 30;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        return intArray;
    }

    public int[] duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;


            }

        }
        return arr;
    }

    public int[] mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = n + m - 1;
        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
        return nums1;
    }

    //insert number at a given index and shift the array to the right
    public int[] mkArrayTest() {
        int[] arr = new int[10];
        int k = 1;
        int index = 2;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = k;
            k++;
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = 99;
        return arr;
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;

    }

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        for (int num : nums) {
            System.out.println("num = " + num);

        }
        return index;

    }

    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validMountainArray(int[] arr) {
//        if (arr.length < 3) {
//            return false;
//        }
//        int i = 0;
//        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
//            i++;
//        }
//        while (i == 0 || i == arr.length - 1) {
//            return false;
//        }
//        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
//            i++;
//        }
//        return i == arr.length - 1;
        if (arr.length < 3){
            return false;}
        int i = 0;
        while (i<arr.length-1 && arr[i]<arr[i+1]){
            i++;
        }
        while(i==0 || i==arr.length-1){
            return false;
        }
        while (i<arr.length-1 && arr[i]>arr[i+1]){
            i++;
        }
        return i==arr.length-1;
    }
}