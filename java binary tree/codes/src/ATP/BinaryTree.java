package ATP;

public class BinaryTree {

    private Node node;

    public BinaryTree() {
        this.node = node;
    }

    //Método de inserção
    public void insert(Node New) {
        int c = New.getData().length();
        New.setRight(null);
        New.setLeft(null);

        if (getNode() == null) setNode(New);
        else  {
            Node current = getNode();
            Node previous;
            while(true) {
                previous = current;
                if (c <= current.getData().length()) {
                    current = current.getLeft();
                    if (current == null) {
                        previous.setLeft(New);
                        return;
                    }
                }
                else {
                    current = current.getRight();
                    if (current == null) {
                        previous.setRight(New);
                        return;
                    }
                }
            }
        }
    }

//this part is just for example
    public static void PrintPreOrder(Node n) {
        System.out.print("The search term was "+ '"' + n.getData() + '"' + ": " + "\n" + n.getRefListArchives());

        if (n.getLeft() !=null) {
            PrintPreOrder(n.getLeft());
        }
        if (n.getRight() !=null) {
            PrintPreOrder(n.getRight());
        }
    }

    public static void PrintInOrder(Node n) {

        if (n.getLeft() !=null) {
            PrintInOrder(n.getLeft());
        }
        System.out.print("The search term was "+ '"' + n.getData() + '"' + ": " + "\n" + n.getRefListArchives());
        if (n.getRight() !=null) {
            PrintInOrder(n.getRight());
        }
    }

    public static void PrintPostOrder(Node n) {

        if (n.getLeft() !=null) {
            PrintPostOrder(n.getLeft());
        }
        if (n.getRight() !=null) {
            PrintPostOrder(n.getRight());
        }
        System.out.print("The search term was "+ '"' + n.getData() + '"' + ": " + "\n" + n.getRefListArchives());
    }


    public String SearchEngine(final String Search) {
        if (getNode() != null && getNode().getData().equals(Search)) {
            return "Tree search result:" +"\n"+  getNode().getRefListArchives();
        } else if (getNode() == null) {
            return "Tree has no knot" ;
        } else if (Search.compareTo(getNode().getData()) < 0) {
            setNode(getNode().getLeft());
            SearchEngine(Search);
        } else {
            setNode(getNode().getRight());
            SearchEngine(Search);
        }
        return "Search for " + '"' + Search + '"' + " did not show results.";
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "" + node + "";
    }
}
