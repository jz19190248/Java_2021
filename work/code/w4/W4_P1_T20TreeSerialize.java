import java.io.*;
import java.util.Arrays;

/**
 * @auther jiangze
 * @description 实现二叉树序列化的读与写
 * @data 2021/6/5
 */
public class W4_P1_T20TreeSerialize {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.createTreeByPreMidMethod(
                new Character[]{'A','B','D', 'C', 'E','G','F','H'},
                new Character[]{'D', 'B', 'A', 'G', 'E', 'C', 'F','H'});
        try{
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("Tree.ser"));
            oos.writeObject(binaryTree);
            oos.flush();
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("Tree.ser"));
            BinaryTree binaryTree1;
            binaryTree1 = (BinaryTree) ois.readObject();
            binaryTree1.preOrder();
            ois.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
    }
}
/**
 * 链式存储实现的二叉树
 */
class BinaryTree<T> implements Serializable {
    public static class TreeNode<E>  implements Serializable{
        private E data;
        private TreeNode<E> lchild, rchild;
        public TreeNode(E data) {
            this.data = data;
        }
        public E getData() {
            return data;
        }
        public void setData(E data) {
            this.data = data;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode<?> treeNode = (TreeNode<?>) o;
            if (data != null ? !data.equals(treeNode.data) : treeNode.data != null) return false;
            if (lchild != null ? !lchild.equals(treeNode.lchild) : treeNode.lchild != null) return false;
            return rchild != null ? rchild.equals(treeNode.rchild) : treeNode.rchild == null;
        }

        @Override
        public int hashCode() {
            int result = data != null ? data.hashCode() : 0;
            result = 31 * result + (lchild != null ? lchild.hashCode() : 0);
            result = 31 * result + (rchild != null ? rchild.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", lchild=" + lchild +
                    ", rchild=" + rchild +
                    '}';
        }
    }

    /*
     * 树结点的个数
     */
    private int nodeCount;
    private TreeNode<T> rootNode;


    public BinaryTree(TreeNode<T> rootNode) {
        this.rootNode = rootNode;
        nodeCount = 1;
    }
    public BinaryTree() {
        this.rootNode = null;
        nodeCount = 0;
    }
    public TreeNode<T> createTreeByPreMidMethod(T[] preArray, T[] midArray) {
        if (preArray.length == 0 || midArray.length == 0) {
            return null;
        }
        TreeNode<T> root = new TreeNode<>(preArray[0]);
        if (this.rootNode == null) {
            this.rootNode = root;
        }
        for (int i = 0; i < midArray.length; i++) {
            if (root.data == midArray[i]) {
                root.lchild = createTreeByPreMidMethod(Arrays.copyOfRange(preArray, 1, 1 + i), Arrays.copyOfRange(midArray, 0, i));

                root.rchild = createTreeByPreMidMethod(Arrays.copyOfRange(preArray, i + 1, preArray.length), Arrays.copyOfRange(midArray, i + 1, midArray.length));
            }
        }
        return root;
    }

    public void preOrder() {
        preOrder(rootNode);
        System.out.println();
    }
    private void preOrder(TreeNode<T> node) {
        // 若二叉树不为空
        if (node != null) {
            System.out.print(node.data);// 访问当前结点
            preOrder(node.lchild);// 按先跟次序遍历当前结点的左子树
            preOrder(node.rchild);// 按先跟次序遍历当前结点的右子树
        }
    }
}


