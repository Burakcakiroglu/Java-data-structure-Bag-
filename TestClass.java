public class TestClass 
{
    public static void main(String[] args)
    {
        System.out.println("Add() method:");
        Bag bag=new Bag();
        Bag bag1=new Bag();
        bag.add("to");bag.add("and");bag.add("to");bag.add("be");bag.add("not");bag.add("be");
        bag.add("to");bag.add("and");bag.add("aa");bag.add("bb");bag.add("cc");bag.add("aa");
        bag.add("ee");bag.add("dd");bag.add("ff");bag.add("dd");bag.add("cc");bag.add("ff");
        bag1.add("ff");bag1.add("to");bag1.add("aa");bag1.add("dd");bag1.add("and");bag1.add("be");
        bag1.add("be");bag1.add("not");bag1.add("to");bag1.add("and");bag1.add("cc");bag1.add("ff");
        bag1.add("ee");bag1.add("dd");bag1.add("bb");bag1.add("to");bag1.add("cc");bag1.add("aa");
        bag.toString();
        System.out.println("");
        System.out.print("contains() method:");
        System.out.println(bag.contains("to"));
        System.out.println();
        System.out.print("distictSize() method:");
        System.out.println(bag.distictSize());
        System.out.println();
        System.out.print("equals(Bag bag1) method:");
        System.out.println(bag.equals(bag1));
        System.out.println();
        System.out.print("elementSize(AnyType and) method:");
        System.out.println(bag.elementSize("and"));
        System.out.println();
        System.out.print("isEmpty() method:");
        System.out.println(bag.isEmpty());
        System.out.println();
        System.out.println("remove(AnyType ff) method:");
        bag.remove("ff");
        bag.toString();
        System.out.println();
        System.out.println("remove 'ff':");
        bag.remove("ff");
        bag.toString();
        System.out.println();
        System.out.print("size() method:");
        System.out.println(bag.size());
        
         
        
        
    }
}
