package JobSix.Merge;

public class MergeSortMain {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        MergeSort mSort = new MergeSort();
        System.out.println("sorting dengan merge sort");
        System.out.println("data awal");
        mSort.tampil(data);
        mSort.mergeSort(data);
        System.out.println("data setelah di sorting");
        mSort.tampil(data);
    }
}
