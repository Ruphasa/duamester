package JobSheet12;

public class Graph23 {
    int vertex;
    DoubleLinkedList23[] list;

    Graph23(int vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedList23[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList23();
        }
    }

    void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    void degree(int asal) {
        int k, totalIn = 0, totalOut = 0;

        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size; k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil di kosongkan");
    }

    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + "(" + list[i].getJarak(j) + "m),");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    boolean isAdjacency(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size; i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }
}
