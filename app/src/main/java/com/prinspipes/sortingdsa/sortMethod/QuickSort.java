package com.prinspipes.sortingdsa.sortMethod;

public class QuickSort {
    //role - quick sort method which sort the array recursively
    //param - high = index of ending element, low = indext of starting element
     public Integer[] quickSort(Integer[] arr, int low, int high){
        // low always smaller than high
        if(low<high){
            int pivotIndex = partition(arr, low, high); //pivotIndex is correct index of pivot element

            //sort the array which contain smaller values than pivot
            quickSort(arr,low, pivotIndex-1);
            //sort the array which contain greater values than pivot
            quickSort(arr,pivotIndex+1, high);
        }
        return arr;
    }

    //partition method find pivot's correct position and divide the array into sub arrays
    //return - pivot index
    private int partition(Integer[] arr, int low, int high){
        int pivot = arr[high];  // set last element of array
        int i = low-1; // always increase when will find smaller element

        for(int j=low; j<high; j++) {
            if(arr[j] < pivot){
                i++;
                //put small elements to left by swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        //now put pivot element in its correct position
        i++;
        System.out.println("pivot high = " +arr[high]);
        System.out.println("pivot  = " +pivot);
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }
}
