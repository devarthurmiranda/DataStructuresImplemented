package Tests.DoubleLinkedList.RandomizeVector;
import List.DoubleLinkedList.DoubleLinkedList;

public class Client {

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        int[] vector = new int[1000];

        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 19999) - 9999;
            list.add(vector[i]);
        }

        System.out.println("=====================================================================================================");
        System.out.println("Vector:");
        for(int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("\n=====================================================================================================");


        System.out.println("\n=====================================================================================================");
        System.out.println("List:");
        System.out.println(list.getList());
        System.out.println("=====================================================================================================");
    }
}
