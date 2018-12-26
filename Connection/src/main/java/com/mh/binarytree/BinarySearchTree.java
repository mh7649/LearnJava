package com.mh.binarytree;

/**
 * Created by mh7649 on 2018/8/25
 */
public class BinarySearchTree<T extends Comparable> implements Tree<T> {

    protected BinaryNode<T> root;

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public int height() {
        return 0;
    }

    public String preOrder() {
        return null;
    }

    public String inOrder() {
        return null;
    }

    public String postOrder() {
        return null;
    }

    public void insert(T data) {
        if (data == null) {
            throw new RuntimeException(INSERT_NULL);
        }
        root = insert(data, root);
    }

    private BinaryNode<T> insert(T data, BinaryNode<T> node) {
        if (node == null) {
            node = new BinaryNode<T>(data, null, null);
        }
        int compareResult = data.compareTo(node.data);
        if (compareResult > 0) {
            node.right = insert(data, node.right);
        } else if (compareResult < 0) {
            node.left = insert(data, node.left);
        }
        return node;
    }

    /**
     * 分三种情况：
     * 1、删除叶子节点（没有孩子的节点）
     * 2、删除只有一个孩子的节点
     * 3、删除有两个孩子的节点
     * @param data 需删除的节点数据
     */
    public void remove(T data) {
        if (data == null) {
            throw new RuntimeException(REMOVE_NULL);
        }
        root = remove(data, root);
    }

    private BinaryNode<T> remove(T data, BinaryNode<T> node) {
        // 没有找到要删除的元素， 递归结束
        if (node == null) {
            return node;
        }
        int compareResult = data.compareTo(node.data);
        if (compareResult < 0) {
            node.left = remove(data, node.left);
        } else if (compareResult > 0) {
            node.right = remove(data, node.right);
        } else if (node.right != null && node.left != null) {
            // 情况3： 有两个孩子
            // 中继替换，找到右子树中最小的元素并替换需要删除的元素
            node.data = findSuccessor(node.right).data;
            // 删除替换的元素
            node.right = remove(node.data, node.right);
        } else {
            //情况1、2： 叶子节点、只有一个节点。
            return node.left != null ? node.left : node.right;
        }
        return node;
    }

    /**
     * 用循环删除节点
     * @param data
     * @return
     */
    public BinaryNode<T> removeWhile(T data) {
        if (data == null) {
            throw new RuntimeException(REMOVE_NULL);
        }
        BinaryNode<T> parent = root;
        BinaryNode<T> current = this.root;
        boolean isLeft = true;

        while(data.compareTo(current.data) != 0) {
            // 更新父节点
            parent = current;
            int result = data.compareTo(current.data);
            if (result < 0) {
                //从左子树查找
                current = current.left;
                isLeft = true;
            } else if (result > 0) {
                // 从右子树查找
                current = current.right;
                isLeft = false;
            }
            if (current == null) {
                return null;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeft) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        return null;
    }

    /**
     * 查找中继节点--右子树最小值节点
     * @param delNode 删除节点
     * @return 删除节点的最小值节点
     */
    public BinaryNode<T> findSuccessor(BinaryNode<T> delNode) {
        BinaryNode<T> successorParent = delNode;
        BinaryNode<T> successor = delNode;
        BinaryNode<T> current = delNode.right;
        // 不断查找左节点， 直到为空， 则successor为最小值节点。
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        // 如果删除节点的右节点不是最小节点
        if (successor != delNode) {
            // 删除最小节点
            successorParent.left = successor.right;
            // 删除 删除节点（把中继结点的右孩子指向当前要删除结点的右孩子）
            successor.right = delNode.right;
        }
        return successor;
    }

    protected BinaryNode<T> findMin(BinaryNode<T> node) {
        return node;
    }

    public T findMax() {
        return null;
    }

    public T findMin() {
        return null;
    }

    public boolean contains(T data) throws Exception {
        return false;
    }

    public BinaryNode<T> findNode(T data) {
        return null;
    }

    public void clear() {

    }
}
