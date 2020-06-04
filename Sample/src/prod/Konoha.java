package prod;

import javax.management.loading.ClassLoaderRepository;
import java.util.ArrayList;

public class Konoha {

    public static void main(String[] args) {

        ArrayList<Amigo> amigos = new ArrayList<Amigo>();

        amigos.add(new Amigo("João"));  // 0
        amigos.add(new Amigo("Clarisse"));
        amigos.add(new Amigo("Edivaldo"));
        amigos.add(new Amigo("Maria"));
        amigos.add(new Amigo("Pedro"));
        amigos.add(new Amigo("Gabriella"));
        amigos.add(new Amigo("Marcos"));
        amigos.add(new Amigo("Benedita"));
        amigos.add(new Amigo("Sara"));
        amigos.add(new Amigo("Fernando"));

        GrafoDeAmigos gda = new GrafoDeAmigos();
        gda.criarAmizadeEntre(amigos.get(0), amigos.get(1));
        gda.criarAmizadeEntre(amigos.get(1), amigos.get(2));
        gda.criarAmizadeEntre(amigos.get(2), amigos.get(3));
        gda.criarAmizadeEntre(amigos.get(1), amigos.get(4));
        gda.criarAmizadeEntre(amigos.get(0), amigos.get(5));

        gda.DFS(amigos.get(0));
    }
}
