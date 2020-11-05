public class Node
{
    Integer name;
    int height;
    Node left;
    Node right;

    public Node()
    {
        this.name = new Integer(12);
        this.height = 1;
        this.left = null;
        this.right = null;
    }

    public Node(Integer name)
    {
        this.name = new Integer(name);
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

