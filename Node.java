public class Node<AnyType>
{
    private AnyType item;
    private int number;
    private Node<AnyType> leftNode,rightNode;
    private Node<AnyType> next;
    
    public Node(Node<AnyType> leftNode,AnyType item, int number, Node<AnyType> rightNode) 
    {
        this.leftNode=leftNode;
        this.item = item;
        this.number = number;
        this.rightNode = rightNode;
    }
    public Node<AnyType> getNext() 
    { 
        return next;
    }
    public void setNext(Node<AnyType> newNext) 
    {
        next = newNext; 
    }
    public AnyType getItem() 
    {
        return item; 
    }
    public int getNumber() 
    { 
        return number; 
    }
    public Node getRightNode() 
    {
        return rightNode; 
    }
    public void setItem(AnyType newLeft) 
    {
        item = newLeft; 
    }
    public void setNumber(int number1) 
    { 
        number = number1; 
    }
    public void setRightNode(Node newRightNode) 
    {
        rightNode = newRightNode; 
    }
    public void setLeftNode(Node newLeftNode)
    {
        leftNode=newLeftNode;
    }
    public Node getLeftNode()
    {
        return leftNode;
    }
}