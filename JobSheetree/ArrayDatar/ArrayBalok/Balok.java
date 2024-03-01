package JobSheetree.ArrayBalok;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    Balok(int p, int l, int t) {
        panjang=p;
        lebar=l;
        tinggi=t;
    }

    Balok(int p, int l){
        
    }

    Balok(int p){

    }

    Balok(){

    }

    int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}
