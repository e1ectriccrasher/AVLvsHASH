
public class Main
{
    public static void main(String[] args)
    {
        AVLTree tree = new AVLTree();

        long start = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            tree.add(i);
        }
        long end = System.currentTimeMillis();

        float sec = (end - start) / 1000F;

        System.err.println("incersion " + sec);

        long start1 = System.nanoTime();
        System.out.println(tree.search(tree.Root,50));
        long end1 = System.nanoTime();

        float sec1 = (end1 - start1);

        System.out.println("Busqueda " + sec1);

        


    }
}