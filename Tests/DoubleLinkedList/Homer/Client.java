package Tests.DoubleLinkedList.Homer;

import List.DoubleLinkedList.DoubleLinkedList;

public class Client {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        String homer = "Homer";
        String bart = "Bart";
        String lisa = "Lisa";
        String moll = "Moll";
        String maggie = "Maggie";
        String marge = "Marge";
        String srBurns = "Sr. Burns";
        String nedFlanders = "Ned Flanders";
        System.out.println("1)");
        list.addStart(homer);
        list.add(bart);
        list.add(lisa);
        System.out.println("Result: " + list.getList());
        System.out.println("Size: " + list.size());
        
        System.out.println("2)");
        list.clear();
        System.out.println("Result: " + list.getList());

        System.out.println("3)");
        list.addStart(homer);
        list.add(0, bart);
        list.add(1, moll);
        System.out.println("Result: " + list.getList());

        System.out.println("4)");
        list.clear();

        System.out.println("5)");
        list.add(homer);
        list.add(bart);
        list.addStart(lisa);
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());
    
        System.out.println("6)");
        list.clear();
        System.out.println("Result:" + list.getList());

        System.out.println("7)");
        list.addStart(homer);
        list.addStart(maggie);
        list.add(0, bart);
        list.add(1, marge);
        System.out.println("Result: " + list.getList());
        for(int i = 0; i < list.size(); i++){
            if (list.getItem(i).equals(lisa)) {
                System.out.println("Lisa found in the list");
            }
        }

        System.out.println("8)");
        list.clear();

        System.out.println("9)");
        list.add(homer);
        list.add(bart);
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());
        
        System.out.println("10)");
        for(int i = 0; i < list.size(); i++){
            if (list.getItem(i).equals(marge)) {
                System.out.println("Marge found in the list");
            }
            if (list.getItem(i).equals(homer)) {
                System.out.println("Homer found in the list");
            }
            if (list.getItem(i).equals(bart)) {
                System.out.println("Bart found in the list");
            }
            if (list.getItem(i).equals(maggie)) {
                System.out.println("Maggie found in the list");
            }
        }
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());
        
        System.out.println("11)");
        list.clear();

        System.out.println("12)");
        list.addStart(homer);
        list.addStart(bart);
        list.add(marge);
        list.add(1, maggie);
        list.addStart(nedFlanders);
        list.add(srBurns);
        System.out.println("Result: " + list.getList());

        System.out.println("13)");
        list.removeEnd();
        System.out.println("Result: " + list.getList());

        System.out.println("14)");
        list.remove(1);
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());
    
        System.out.println("15)");
        for(int i = 0; i < list.size(); i++){
            if (list.getItem(i).equals(marge)) {
                System.out.println("Marge found in the list");
            }
            if (list.getItem(i).equals(homer)) {
                System.out.println("Homer found in the list");
            }
            if (list.getItem(i).equals(bart)) {
                System.out.println("Bart found in the list");
            }
            if (list.getItem(i).equals(maggie)) {
                System.out.println("Maggie found in the list");
            }
        }
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());
    
        System.out.println("16)");
        list.removeStart();
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());

        System.out.println("17)");
        for(int i = 0; i < list.size(); i++){
            if (list.getItem(i).equals(marge)) {
                System.out.println("Marge found in the list");
            }
            if (list.getItem(i).equals(homer)) {
                System.out.println("Homer found in the list");
            }
            if (list.getItem(i).equals(bart)) {
                System.out.println("Bart found in the list");
            }
            if (list.getItem(i).equals(maggie)) {
                System.out.println("Maggie found in the list");
            }
        }
        System.out.println("Result: " + list.getList() + ", Size: " + list.size());
    
        System.out.println("18)");
        list.clear();
        System.out.println("Result: " + list.getList());
    }
}
