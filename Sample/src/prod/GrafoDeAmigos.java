package prod;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GrafoDeAmigos {

    ArrayList<Amigo> visitados;

    public void criarAmizadeEntre(Amigo n, Amigo m) {
        n.fazerAmizade(m);
        m.fazerAmizade(n);
    }

    public void DFS (Amigo a) {
        visitados = new ArrayList<Amigo>();
        realDFS(a);
    }

    public void realDFS (Amigo a) {
        if (!visitados.contains(a)) {
            System.out.println(a.toString() + " at DFS ");
            visitados.add(a);
            for(Amigo amigo : a.getAmigos()) {
                realDFS(amigo);
            }
        }
    }

    public void BFS (Amigo a) {
        ArrayDeque<Amigo> fila = new ArrayDeque<Amigo>();
        visitados = new ArrayList<Amigo>();
        visitados.add(a);
        fila.push(a);
        while(!fila.isEmpty()) {
            Amigo amigo = fila.remove();
            System.out.println(amigo.toString());
            for (Amigo iterator : amigo.getAmigos()) {
                if(!visitados.contains(iterator))
                    fila.push(iterator);
                    visitados.add(iterator);
            }
        }
    }


}
