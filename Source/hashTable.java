import java.util.ArrayList;

public class hashTable<T> {
	private ArrayList<T>[] tabla;
	int cont;
	double factorCarga=1; // cambiarlo 
		
public hashTable() {
		tabla = new ArrayList[10];
		cont = 0;
			
		for(int i = 0; i < tabla.length; i++)
			tabla[i] = new ArrayList<T>();
    }
    
    public int funcionMisteriosa(T elem) {
        return (int) ((int) elem * 0.8767);
	}
	
	

	public void insert(T elem) {
	//if(muyGrande())
			//expande();
		if ((cont/tabla.length) > factorCarga)
			expande();	
	
        int pos = funcionMisteriosa(elem);
		tabla[pos % tabla.length].add(elem);
		cont++;		
	}
		
	public T buscar(T elem) {
		int pos = funcionMisteriosa(elem);
		int index = tabla[pos % tabla.length].indexOf(elem);

		if(index < 0)
			return null;
		else 
			return elem;
	}
		
	public boolean borrar(T elem) {
		boolean res = false;
		int pos = funcionMisteriosa(elem);

		if(tabla[pos % tabla.length].contains(elem)) {
			tabla[pos % tabla.length].remove(elem);
			cont--;
			res = true;
		}

		return res;
	}

	private void expande() {
		ArrayList<T>[] nuevaTabla = new ArrayList[tabla.length * 2];
		
		//Inicializar listas
		for(int i = 0; i < nuevaTabla.length;i++)
			nuevaTabla[i] = new ArrayList<T>();
			
		//Mover elementos
		for(ArrayList<T> lista : tabla) {
			for(T elem : lista) {
				// Volvemos a hashear
				int pos = funcionMisteriosa(elem);
				nuevaTabla[pos % nuevaTabla.length].add(elem);
			}
		}

		tabla = nuevaTabla;
    }
    
    public static void main(String[] args) {
        hashTable tabla = new hashTable<>();

        long start = System.nanoTime();
        for(int i=0;i<=1000000; i++){
            tabla.insert(i);
            System.out.println("inserto   " +  i);
        }
        long end = System.nanoTime();

        float sec = (end - start) / 10000;

		System.out.println("Timepo de incersion " +sec);
		long start1 = System.nanoTime();
		System.out.println("Lo encontre " + tabla.buscar(10000));
		long end1 = System.nanoTime();
		float sec1 = (end1 - start1) / 10000;

		System.out.println("Busqueda " + sec1);
    }


		
}

