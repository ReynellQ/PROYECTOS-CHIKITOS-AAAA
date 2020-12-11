package proyecto_chikito;


public class Tree<U extends Comparable> {
    TreeNode<U> root;

    public Tree() {
        this.root = null;
    }
    public void insertar(U e){
        root = pepito(e, root);
    }
    private TreeNode pepito(U e, TreeNode n){
        if(n == null){
            n = new TreeNode<>(null,null,null,e);
            return n;
            
        }else{
            if(e.compareTo(n.getElemento()) < 0){
                n.left = pepito(e,n.left);
                n.left.father = n;
                return n;
            }else if( e.compareTo(n.getElemento()) > 0){
                n.right = pepito(e,n.right);
                n.right.father = n;
                return n;
            }else{
                return null;
            }
        }
    }
    public boolean buscar(U e){
        return busqueda(e,root);
    }
    public boolean busqueda(U e, TreeNode n){
        if(n == null){
            return false;
        }else{
            if(e.compareTo(n.getElemento()) < 0){
                return busqueda(e,n.left);
            }else if( e.compareTo(n.getElemento()) > 0){
                return busqueda(e,n.right);
            }else{
                return true;
            }
        }
    }
    

    @Override
    public String toString() {
        return "Tree{" + "root=" + root + '}';
    }
    
    
}
