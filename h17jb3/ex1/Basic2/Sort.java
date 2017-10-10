package h17jb3.ex1.Basic2;

public class Sort {
//
//    //Sắp xếp chèn (insertion sort)
//    protected static int insertionSort(){
//    }
//
//    //Sắp xếp chọn (select sort)
//    protected static int selectSort(){
//    }
//
//    //Sắp xếp trộn (merge sort)
//    protected static int mergeSort(){
//    }
//
//    //Sắp xếp vun đống (heapsort)
//    protected static int heapSort(){
//    }
//
//    //Sắp xếp nhanh (quicksort)
//    protected static int quickSort(){
//    }
//
//    //Sắp xếp theo cơ số (radix sort)
//    protected static int radixSort(){
//    }
//
//    //Sắp xếp theo cơ số (shell sort)
//    protected static int shellSort(){
//    }

    public static void main(String args[]) throws Exception {
        Sort sapXep = new Sort();
        int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        sapXep.bubbleSort1(arr, arr.length);
    }

    //Sắp xếp nổi bọt (bubble sort)
    private void bubbleSort1(int array[], int n){
        for (int j=0; j<n; j++){
            for (int i=n-1; i>j; i--){
                if (array[i]<array[i-1]){
                    int t = array[i];
                    array[i]=array[i-1];
                    array[i-1]=t;
                }
            } System.out.print(array[j] + " ");
        }
    }

}