import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Node {

    String name;
    List<Node> adj = new ArrayList<Node>();

    public  Node (String name) {
        this.name = name;
    }
    public void associate (Node newNode) {
        //for (Node node : adj) {
//            if (newNode == node) {
//                Util.log("node.java this node already exists here.");
//            } else {
                adj.add(newNode);
//            }
       // }
    }
}
