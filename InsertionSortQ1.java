
// Q.1 Write a program for Insertion sort

import java.util.Arrays;

class InsertionSortQ1 {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;
      
      //comparing keys with each element on left side
      
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // swapping key element just smaller than it.
      array[j + 1] = key;
    }
  }

  // Main code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3,10,34,20 };
    InsertionSortQ1 insertion = new InsertionSortQ1();
    insertion.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}