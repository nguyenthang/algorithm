package algorithm.quicksort;

/**
 * Created by thangnguyen-imac on 4/8/16.
 */
public class QuickSortApp {

    private int arr[];
    private int len;

    public static void main(String[] args){
        QuickSortApp sorter = new QuickSortApp();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    public void sort(int[] arr){

        if(arr == null || arr.length == 0){
            return;
        }

        this.arr = arr;
        len = arr.length;
        quickSort(0, len - 1);
    }

    private void quickSort(int l, int h) {
        int i = l;
        int j = h;

        int pivot = arr[l+ (h-l)/2];

        while (i <= j){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }

            if(i<= j){
                exchangeNo(i, j);
                i++;
                j--;
            }
        }

        if(l < j)
            quickSort(l, j);
        if(i < h)
            quickSort(i, h);
    }

    private void exchangeNo(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
