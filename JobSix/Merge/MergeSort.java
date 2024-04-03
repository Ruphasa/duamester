package JobSix.Merge;

public class MergeSort {
    void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    void merge(int[] data, int left, int mid, int right) {
        int[] temp = new int[data.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int sisa = mid - a;
        for (int i = 0; i <= sisa; i++) {
            data[c + i] = temp[a + i];
        }
    }

    void sort(int[] data, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    void tampil(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
