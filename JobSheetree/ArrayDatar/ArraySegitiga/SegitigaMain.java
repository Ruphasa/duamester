package JobSheetree.ArrayBalok;

public class mainSegitiga {
    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];
        int[][] data = {
            {10,4},
            {20,10},
            {15,6},
            {25,10}
        };
        for (int i = 0; i < data.length; i++) {
            sgArray[i] = new segitiga(data[i][0], data[i][1]);
            sgArray[i].pythagoras();
            System.out.println("Segitiga ke-"+(i+1));
            System.out.println("Luas : "+sgArray[i].hitungLuas()+"\nKeliling : "+sgArray[i].hitungKeliling());
        }
    }
}
