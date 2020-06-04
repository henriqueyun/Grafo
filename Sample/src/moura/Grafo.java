package moura;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Grafo {

    private final int n;

    private int m;

    private HashMap<Integer, ArrayDeque<Integer>> adj;

    public Grafo(int n) {
        this.n = n;
        this.m = 0;
        this.adj = new HashMap<>();
        for (int i = 0;i < n; i++) {
            adj.put(i, new ArrayDeque<>());
        }
    }

    public final void adicionaAresta (int u, int v) {
        // if ()
    }

    public final void adicionaArestaDirecionada (int u, int v) {

    }

}
