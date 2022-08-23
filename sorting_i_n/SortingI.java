package sorting_i_n;
//1	7	5	19
public class SortingI {
    public static void q1(){
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        quickSort(arr,0,n-1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
    public static int partition(int arr[],int head, int last){
        int pivot = arr[last];
        int i = (head - 1);
        for (int j = head; j < last; j++) {

            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;

        return i + 1;
    }
    public static void quickSort(int array[], int head, int last){
        if(head < last){
            int pi = partition(array,head,last);
                quickSort(array,head, pi-1);
                quickSort(array,pi+1,last);
            }
        }
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void q7(){
        int array[] = { 10, 80, 30, 90, 40, 50, 70 };

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        printArray(array);
    }

    public static void main(String[] args) {
        //q7();
    }
}
