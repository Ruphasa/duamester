package profitCounter;

public class sum {
    int elemen;
    double keuntungan[], total;

    sum(int e) {
        elemen = e;
        keuntungan = new double[elemen];
        total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total += arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double left = totalDC(arr, l, mid - 1);
            double right = totalDC(arr, mid + 1, r);
            return left + right + arr[mid];
        }
        return 0;
    }
}
