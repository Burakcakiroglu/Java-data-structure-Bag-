public class BSTree<AnyType>
{
    private Node<AnyType> root;
    
    public boolean isEmpty() 
    {
        return (root == null);
    }
    public void insertNode(AnyType newVariable) 
    {
        Node<AnyType> temp1=null;
        if(root == null)
        {
            root = new Node(null,newVariable,1,null);
        }
        else if(convertInteger1(newVariable) == convertInteger1((AnyType) getRoot().getItem()))
        {
            getRoot().setNumber((getRoot().getNumber())+ 1);
        }
        else
        {
            Node<AnyType> temp = getRoot();
            
            while(true)
            {
                if(convertInteger1(newVariable) < convertInteger1((AnyType) temp.getItem()))
                {
                    if(temp.getLeftNode() == null)
                    {
                        Node<AnyType> newNode=new Node(null,newVariable,1,null);
                        temp.setLeftNode(newNode);
                        break;
                    }
                    else if(convertInteger1(newVariable) == convertInteger1((AnyType) temp.getLeftNode().getItem()))
                        {
                          temp.getLeftNode().setNumber((temp.getLeftNode().getNumber())+1);
                          break;
                        }
                    else
                        temp = temp.getLeftNode();
                }
                else if(convertInteger1(newVariable) == convertInteger1((AnyType) temp.getItem()))
                {
                    temp.setNumber((temp.getNumber())+1);
                    break;
                }
                else
                {
                    if(temp.getRightNode() == null)
                    {
                        Node<AnyType> newNode=new Node(null,newVariable,1,null);
                        temp.setRightNode(newNode);
                        break;
                    }
                    else if(convertInteger1(newVariable) == convertInteger1((AnyType) temp.getRightNode().getItem()))
                        {
                          int variable=(temp.getRightNode().getNumber())+1;
                          temp.getRightNode().setNumber(variable);
                          break;
                        }
                    else
                        temp = temp.getRightNode();
                }
            }	
        }
    }
    public int convertInteger1(AnyType temp)
    {
        int number=System.identityHashCode(temp);
        return number;
    }
     public  void preOrder(Node node) 
    { 
        if (node != null) 
        { 
            System.out.print(node.getItem() + "(Amount is "+ node.getNumber()+") "); 
            preOrder(node.getLeftNode()); 
            preOrder(node.getRightNode()); 
        } 
    } 
    public Node getRoot()
    {
        return root;
    }
}