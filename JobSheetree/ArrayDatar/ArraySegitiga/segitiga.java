package JobSheetree.ArrayBalok;

public class segitiga {
    int alas;
    int tinggi;
    double sisiMiring;

    segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    void pythagoras(){
        sisiMiring=Math.sqrt(alas*alas+tinggi*tinggi);
    }

    double hitungLuas(){
        return alas*tinggi/2;
    }

    double hitungKeliling(){
        return alas+tinggi+sisiMiring;
    }
}
