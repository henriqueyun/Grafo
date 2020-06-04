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
        if (!foiVisitado(a)) {
            System.out.println(a.toString() + " at DFS ");
            visitados.add(a);
            for(Amigo amigo : a.getAmigos()) {
                realDFS(amigo);
            }
        }
    }

 

    public boolean foiVisitado(Amigo a) {
        for (Amigo v : visitados) {
            if (v == a) {
                return true;
            }
        }
        return false;
    }

}
