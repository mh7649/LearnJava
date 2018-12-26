package com.mh.binarytree;

/**
 *
 * 参考链接：https://blog.csdn.net/javazejian/article/details/53727333
 * Created by mh7649 on 2018/8/25
 * @param <T>
 */
public interface Tree<T extends Comparable> {

    public static final String INSERT_NULL = "不能插入空数据";
    public static final String REMOVE_NULL = "不能删除空数据";

    /**
     * 判断树是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 树的大小
     * @return 树的节点个数
     */
    int size();

    /**
     * 树的层树/高度
     * @return 树的高度
     */
    int height();

    /**
     * 先序遍历
     * @return
     */
    String preOrder();

    /**
     *中序遍历
     * @return
     */
    String inOrder();

    /**
     * 后序遍历
     * @return
     */
    String postOrder();

    /**
     * 插入数据
     * @param data
     */
    void insert(T data);

    /**
     * 删除
     * @param data
     */
    void remove(T data);

    /**
     * 查找最大值
     * @return
     */
    T findMax();

    /**
     * 查找最小值
     * @return
     */
    T findMin();

    /**
     * 是否包含某个值
     * @param data
     * @return
     * @throws Exception
     */
    boolean contains(T data) throws Exception;

    /**
     * 根据值找到节点
     * @param data 值
     * @return 节点
     */
    BinaryNode<T> findNode(T data);

    /**
     * 清空树
     */
    void clear();
}
