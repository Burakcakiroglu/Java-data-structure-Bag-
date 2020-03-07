import java.util.*;

public class Bag<AnyType> 
{
    private static final int TABLE_SIZE = 10;
    private int theSize=0,distictSize=0,counter=0;
    private AnyType variable2;
    private BSTree<AnyType>[] tree;
    
    public void Bag()
    {
        tree = new BSTree[TABLE_SIZE];
        for(int i=0;i<tree.length;i++)
        {
            tree[i]=new BSTree<>();
        }
    }
    @Override
    public String toString() 
    {
        String outPut="";
        
        if(theSize==0)
        {
            System.out.println("Bag is Empty.");
        }
        else
        {
            for(int k=0;k<10;k++)
           {
               //System.out.println();
               Node<AnyType> temp = tree[k].getRoot();
           
            /*if(temp==null)
            {
                System.out.print(k + "-->Empty");
            }*/
            //else
            {
               // System.out.print(k + "-->"/* + temp.getItem()+"(amount is "+(temp.getNumber())+")"*/); 
                tree[k].preOrder(temp);
            }
            }
        }
        
	return outPut;
    }
    public void add(AnyType item)
    {
        int x = convertInteger(item);
        if(theSize==0)
        {
            Bag();
            BSTree<AnyType> variable = tree[index(x)];
            variable.insertNode(item); 
            theSize++;
            distictSize++;
        }
        else if(contains(item)==false)
        {
            BSTree<AnyType> variable = tree[index(x)];
            variable.insertNode(item); 
            theSize++;
            distictSize++;
        }
        else
        {
            BSTree<AnyType> variable = tree[index(x)];
            variable.insertNode(item); 
            theSize++;
        }
    }
    public void clear()
    {
        Bag();
        theSize=0;
    }
    public boolean contains(AnyType item)
    {
        boolean aaa = false;
        int number=index(convertInteger(item));
        Node tempNode= tree[number].getRoot();
           
           while(true)
          {
            if(tempNode==null)
            {
                aaa = false;
                break;
            }
            else if(convertInteger((AnyType) tempNode.getItem()) == convertInteger(item))
            {
                aaa=true;
                variable2=(AnyType) tempNode.getItem();
                break;
            }
            else if(convertInteger((AnyType) tempNode.getItem()) > convertInteger(item))
            {
                 if(tempNode.getLeftNode() == null)
                {
                    aaa=false;
                    break;
                }
                 else if(convertInteger((AnyType) tempNode.getLeftNode().getItem()) == convertInteger(item))
                 {
                     aaa=true;
                     variable2=(AnyType) tempNode.getLeftNode().getItem();
                     break;
                 }
                 else 
                {
                   tempNode =  tempNode.getLeftNode();
                }
            }
            else 
            {
                if(tempNode.getRightNode() == null)
                {
                    aaa=false;
                    break;
                }
                 else if(convertInteger((AnyType) tempNode.getRightNode().getItem()) == convertInteger(item))
                 {
                     aaa=true;
                     variable2=(AnyType) tempNode.getRightNode().getItem();
                     break;
                 }
                else 
                {
                   tempNode =  tempNode.getRightNode();
                }
            }
        }
         return aaa;             
    }
    public int distictSize()
    {
        return distictSize;
    }
   
    public boolean equals(Bag item)
    {
        boolean variable=false;
        
         if(item.size()==theSize && item.distictSize()==distictSize)
         {
             for(int i=0;i<10;i++)
             {
                 Node<AnyType> node=tree[i].getRoot();
                 preOrderCounter(node,item);
             }
             if(distictSize==getCounter())
             {
                 variable=true;
             }
             else
             {
                 variable=false;
             }
         }
         else
         {
             variable=false;
         }
         return variable;
    }
    public int elementSize(AnyType item)
    {
        int number=index(convertInteger(item));
        Node tempNode= tree[number].getRoot();
        int counter=0;
        if(!contains(item))
        {
            System.out.println("Invalid value.");
        }
        else 
        {
          while(true)
          {
              if(convertInteger(item)==convertInteger((AnyType) tempNode.getItem()))
                {
                     counter=(int) tempNode.getNumber();
                     break;
                }
              else if(convertInteger(item) < convertInteger((AnyType) tempNode.getItem()))
              {
                  tempNode=tempNode.getLeftNode();
              }
              else if(convertInteger(item) > convertInteger((AnyType) tempNode.getItem()))
              {
                  tempNode=tempNode.getRightNode();
              }
          }
        }
        return counter;
    }
    public boolean isEmpty()
    {
        return theSize==0;
        
    }
    public void remove(AnyType item)
    {
        Node<AnyType> temp=null;
        if(theSize==0)
        {
            System.out.println("Bag is empty.");
        }
        else if(!contains(item))
        {
            System.out.println("Invalid value.");
        }
        else
        {
            theSize--;
            int number=convertInteger(item);
            Node<AnyType> node =tree[index(number)].getRoot();
            while(true)
            {
            if(convertInteger(node.getItem())==convertInteger(item))
            {
                if(node.getNumber() > 1)
                {
                    node.setNumber(node.getNumber() - 1);
                    break;
                }
                else if(node.getNumber()==1)
                {
                    if(node.getLeftNode()==null && node.getRightNode()==null)
                    {
                       if(convertInteger(node.getItem())==convertInteger((AnyType) tree[index(number)].getRoot().getItem()))
                       {
                           tree[index(number)]=new BSTree<>();
                           break;
                       }
                       else
                       {
                          if(convertInteger((AnyType) temp.getItem())==convertInteger(item))
                          {
                              temp.setLeftNode(null);
                              break;
                          }
                          else //if(convertInteger((AnyType) temp.getRightNode().getItem())==convertInteger(item))
                          {
                              temp.setRightNode(null);
                              break;
                          }
                       }
                    }
                    else if(node.getLeftNode()!=null && node.getRightNode()==null)
                    {
                        Node<AnyType> temp3=getMaxNode(node);
                        node.setItem(temp3.getItem());
                        node.setNumber(temp3.getNumber());
                        break;
                    }
                    else if(node.getLeftNode()==null && node.getRightNode()!=null)
                    {
                        Node<AnyType> temp3=getMinNode(node);
                        node.setItem(temp3.getItem());
                        node.setNumber(temp3.getNumber());
                        break;
                    }
                    else if(node.getLeftNode()!=null && node.getRightNode()!=null)
                    {
                        Node<AnyType> temp3=getMaxNode(node.getLeftNode());
                        node.setItem(temp3.getItem());
                        node.setNumber(temp3.getNumber());
                        break;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
            else if(convertInteger(node.getItem()) > convertInteger(item))
            {
                temp=node;
                node=node.getLeftNode();
            }
            else if(convertInteger(node.getItem()) < convertInteger(item))
            {
                temp=node;
                node=node.getRightNode();
            }
            }
        }
    }
    public int size()
    {
        return theSize;
    }
    public int convertInteger(AnyType temp)
    {
        int number=System.identityHashCode(temp);
        return number;
    }
    public int index(int number)
    {
        return (number % 10);
    }
    public Node getMaxNode(Node node)
    {
        Node<AnyType> temp=null;
        while(true)
        {
            if(node.getRightNode()!=null)
            {
                temp=node.getRightNode();
                if(node.getRightNode().getRightNode()==null && node.getRightNode().getLeftNode()==null)
                {
                    node.setLeftNode(null);
                    node.setRightNode(null);
                    break;
                }
                else
                {
                    node=node.getRightNode();
                }
            }
            else if(node.getLeftNode()!=null)
            {
                temp=node.getLeftNode();
                
                if(node.getLeftNode().getRightNode()==null && node.getLeftNode().getLeftNode()==null)
                {
                    node.setLeftNode(null);
                    node.setRightNode(null);
                    break;
                }
                else
                {
                    node=node.getLeftNode();
                }
            }
            else if(node.getRightNode()==null && node.getLeftNode()==null)
            {
                break;
            }
        }
        return temp;
    }
    public Node getMinNode(Node node)
    {
        Node<AnyType> temp=node;
        while(true)
        {
            if(node.getLeftNode()!=null)
            {
                
                temp=node.getLeftNode();
                if(node.getLeftNode().getRightNode()==null && node.getLeftNode().getLeftNode()==null)
                {
                    node.setLeftNode(null);
                    node.setRightNode(null);
                    break;
                }
                else
                {
                    node=node.getLeftNode();
                }
            }
            else if(node.getRightNode()!=null)
            {
                
                temp=node.getRightNode();
                if(node.getRightNode().getRightNode()==null && node.getRightNode().getLeftNode()==null)
                {
                    node.setLeftNode(null);
                    node.setRightNode(null);
                    break;
                }
                else
                {
                    node=node.getRightNode();
                }
            }
            else if(node.getRightNode()==null && node.getLeftNode()==null)
            {
                break;
            }
        }
        return temp;
    }
    public  void preOrderCounter(Node node,Bag item) 
    { 
        if (node != null) 
        { 
            if(item.contains(node.getItem())==true && node.getNumber()==item.elementSize(node.getItem()))
              {
                 counter++;
              }
            preOrderCounter(node.getLeftNode(),item); 
            preOrderCounter(node.getRightNode(),item); 
        } 
    }
    public int getCounter()
    {
        return counter;
    }
}