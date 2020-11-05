public class Main
{
    public static void main(String[] args)
    {
        AVLTree tree = new AVLTree();

        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            tree.add(i);
        }
        long end = System.currentTimeMillis();

        float sec = (end - start) / 1000F;

        System.err.println(sec);
    }
}