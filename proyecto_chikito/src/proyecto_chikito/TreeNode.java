package proyecto_chikito;

public class TreeNode<T extends Comparable> {
    T elemento;
    TreeNode father, left, right;
    int cant;

    public TreeNode(TreeNode father, TreeNode left, TreeNode right, T elemento) {
        this.father = father;
        this.left = left;
        this.right = right;
        this.elemento = elemento;
    }

    public TreeNode getFather() {
        return father;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public T getElemento() {
        return elemento;
    }

    public void setFather(TreeNode father) {
        this.father = father;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "elemento=" + elemento + "\n\t, father=" + (father!=null ? father.elemento : "a") + ",\n\t left=" + left + ",\n\t right=" + right + '}';
    }

   
    
    
    
}
