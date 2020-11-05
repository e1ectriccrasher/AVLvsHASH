import java.util.Hashtable;



public class hashTable <T>{

    int num;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + num;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        hashTable other = (hashTable) obj;
        if (num != other.num)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();

        long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            h.put(h.hashCode(), i);
            System.out.println("\n" + "add" + Integer.toString(i));
        }
        long end = System.currentTimeMillis();

        float sec =(end - start) / 100F;

        System.out.println(sec);
        

        
        
        
    }

    




}
