package Exersice16_1;

/*
    Write a method called notEquals that accepts a second list as a parameter,
    returns true if the two lists are not equal, and returns false otherwise.
    Two lists are considered unequal if they store the different
    values in any random order and do not have the same length.
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(8);
    list1.add(19);
    list1.add(4);
    list1.add(17);

    LinkedIntList list2 = new LinkedIntList();
    list2.add(17);
    list2.add(4);

    System.out.println(list1.notEquals(list2));



}
}