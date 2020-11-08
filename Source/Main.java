
public class Main
{
    public static void main(String[] args)
    {
        AVLTree tree = new AVLTree();

        long start = System.nanoTime();
        for (int i=0;i<100;i++){
            tree.add(Integer.toString(i));
        }
        long end = System.nanoTime() ;

        float sec = (end - start);

        System.err.println("incersion " + sec);

        long start1 = System.nanoTime();
        System.out.println(" Lo encontre " + tree.search(AVLTree.Root, Integer.toString(12)));
        long end1 = System.nanoTime();

        float sec1 = (end1 - start1) ;

        System.out.println("Busqueda " + sec1);

        


    }
}