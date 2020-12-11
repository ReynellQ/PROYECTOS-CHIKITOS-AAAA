package proyecto_chikito;

public class Proyecto_chikito {
    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>();
        t.insertar(2);
        t.insertar(1);
        t.insertar(3);
        t.insertar(4);
        System.out.println(t.root);
        for(int i = 0 ; i < 6 ; ++i)
        {
            System.out.println(t.buscar(i));
        
        }
    }
}
