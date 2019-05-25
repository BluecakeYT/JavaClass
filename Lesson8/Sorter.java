public class Sorter {

    public static void main (String[] args) {
        int[] integers = {9, 3, 2, 7, 6};
        Sorter sorts = new Sorter();
        sorts.bubbleSort(integers);
        sorts.printArray(integers);
        int[] mores = {8, 9, 8, 7, 2};
        sorts.insertionSort(mores);
        sorts.printArray(mores);
        int[] numbers = {2, 3, 4, 9, 0};
        sorts.selectionSort(numbers);
        sorts.printArray(numbers);
        int[] last = {3, 8, 23, 9, 1213};
        sorts.quickSort(last, 2, 4);
        sorts.printArray(last);
     }
    private void printArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }

     public int[] bubbleSort(int[] arr) {

             int n = arr.length;
             for (int i = 0; i < n-1; i++)
                 for (int j = 0; j < n-i-1; j++)
                     if (arr[j] > arr[j+1])
                     {
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                     }
              return arr;
     }

     public int[] insertionSort(int[] arr) {

         int n = arr.length;
         for (int i = 1; i < n; ++i) {
             int key = arr[i];
             int j = i - 1;

             while (j >= 0 && arr[j] > key) {
                 arr[j + 1] = arr[j];
                 j = j - 1;
             }
             arr[j + 1] = key;
         }
         return arr;
     }

     public void selectionSort(int arr[]) {

         int n = arr.length;


         for (int i = 0; i < n-1; i++) {

             int min_idx = i;
             for (int j = i+1; j < n; j++) {
                 if (arr[j] < arr[min_idx]) {
                     min_idx = j;
             }

             int temp = arr[min_idx];
             arr[min_idx] = arr[i];
             arr[i] = temp;
           }
         }
     }
     public int pivoter(int arr[], int low, int high) {

     int pivot = arr[high];
     int i = (low-1);
     for (int j=low; j<high; j++) {


        if (arr[j] <= pivot) {

            i++;


            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;
    }

    public int[] quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pi = pivoter(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        if (low < 0 || high > arr.length - 1) {
          System.out.println("die");
          int[] temp = {0};
          return temp;
        }
        return arr;
    }
}
