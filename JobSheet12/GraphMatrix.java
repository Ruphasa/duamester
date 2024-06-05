package JobSheet12;

public class GraphMatrix {
    int vertex;
    int[][] matrix;

    GraphMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    void makeEdge(int asal, int tujuan, int jarak) {
        matrix[asal][tujuan] = jarak;
    }

    void removeEdge(int asal, int tujuan) {
        matrix[asal][tujuan] = 0;
    }

    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.print((char) ('A' + j) + "(" + matrix[i][j] + "m) ");
                }
            }
            System.out.println();
        }
    }

    int degree(int asal) {
        return inDegree(asal)+outDegree(asal);
    }

    int inDegree(int asal) {
        int inTotal = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[i][asal] != 0) {
                inTotal++;
            }
        }
        return inTotal;
    }

    int outDegree(int asal) {
        int outTotal = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[asal][i] != 0) {
                outTotal++;
            }
        }
        return outTotal;
    }
}
