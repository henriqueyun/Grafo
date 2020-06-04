package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
    ArrayList<Node> nodes;

    public Grafo () {
        nodes = new ArrayList<Node>();
    }

    public void addNode(Node n) {
        nodes.add(n);
    };

    public void associate (Node n, Node m) {
        for (Node searched : nodes) {
            if (searched == n) {
                Util.log("found");
                n.associate(m);
                return;
            }
        }
    }

    HashSet<Node> visited = new HashSet<Node>();

    public void dfs (Node currentNode) {
        Util.log("test.Node atual " + currentNode.name);
        visited.add(currentNode);
        for (Node node : currentNode.adj) {
            Util.log("see " + node.name);
            if (!visited.contains(node)) {
                dfs(node);
            } else{
                Util.log(node.name + " já visitado");
            }
        }
        Util.log("visited");
        visited.forEach(x -> Util.log(x.name));
        Util.log("");
        return;
    }

    Queue<Node> q = new LinkedList<Node>();
    // todo
    public void bfs (Node currentNode) {
        q.add(currentNode);
        for (Node node : nodes) {
        }
    }
}
