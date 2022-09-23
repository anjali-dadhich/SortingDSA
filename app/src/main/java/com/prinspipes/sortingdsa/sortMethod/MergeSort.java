package com.prinspipes.sortingdsa.sortMethod;

public class MergeSort {
    //now we call conqure method
    public static void conquer(Integer[] arr, int startIndex, int endIndex, int midIndex) {
        //mergedArray - it store storted element of both divided arrays
        Integer[] mergedArray = new Integer[endIndex - startIndex +1];

        int array1Index = startIndex;
        int array2Index = midIndex + 1;
        int mergedIndex = 0;

        //compare each element of both arrays
        while(array1Index <= midIndex && array2Index <= endIndex) {
            if(arr[array1Index] < arr[array2Index]){
                mergedArray[mergedIndex++] = arr[array1Index++];
            } else {
                mergedArray[mergedIndex++] = arr[array2Index++];
            }
        }

        //shift all remaining element into merged array
        while(array1Index <= midIndex) {
            mergedArray[mergedIndex++] = arr[array1Index++];
        }

        while(array2Index <= endIndex) {
            mergedArray[mergedIndex++] = arr[array2Index++];
        }

        //copy element of merged array into original array
        for(int i = 0, j =startIndex; i < mergedArray.length; i++,j++) {
            arr[j] = mergedArray[i];
        }

    }

    //Divide Methode -- it divide the array into subarray with help of mid index
    public void divide(Integer[] arr, int startIndex, int endIndex){
        //base condition
        if(startIndex<endIndex ){
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            // for array1
            divide(arr,startIndex, midIndex);
            //for array2
            divide(arr,midIndex+1,endIndex);

            conquer(arr,startIndex, endIndex, midIndex);
        }
    }
}
