package prod;

import java.util.ArrayList;

public class Amigo {

    private String nome;
    private int grau;
    private ArrayList<Amigo> amigos = new ArrayList<Amigo>();

    public Amigo(String nome) {
        this.nome = nome;
    }

    public void fazerAmizade (Amigo a) {
        if(!isAmigo(a)) {
            amigos.add(a);
            grau += 1;
        }
    }

    public boolean isAmigo (Amigo a) {
        for (Amigo amigo : this.amigos) {
            if (amigo == a)
                return true;
        }
        return false;
    }

    public ArrayList<Amigo> getAmigos(){
        return this.amigos;
    }

    public String toString(){
        return this.nome;
    }
}
