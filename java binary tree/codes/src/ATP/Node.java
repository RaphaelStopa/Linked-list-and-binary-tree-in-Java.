package ATP;

public class Node {

    private linked_list refListArchives;
    private String data;
    private Node right;
    private Node left;


    public Node(linked_list refListArchives, String data) {
        this.data = data;
        this.refListArchives = refListArchives;
    }

    public linked_list getRefListArchives() {
        return refListArchives;
    }

    public String getData() {
        return data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "" + (left == null ? "" : left)  + "\n"  + "Searched for the term: "+ '"' + data + '"' + "." + "\n" + refListArchives + "\n"+ (right == null ? "" : right) ;
    }
}

