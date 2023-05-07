public class Client {

    /*
     * Josephus Problem..
     * Imagine a wheel of 20 people numbered 1 to 20 clockwise.
     * Each person has a name, phone number, address, and social security number.
     * Starting with person number 1, run clockwise around the wheel
     * eliminate each m-th person chosen at random while the wheel has one or more people on it.
     * Which number is the surviving person still on the list?
     * 
     */

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Person p1 = new Person(1, "Fulano", "123456789", "Rua 1", "123456789");
        Person p2 = new Person(2, "Linda", "987654321", "Rua 2", "987654321");
        Person p3 = new Person(3, "Roberto", "123456789", "Rua 3", "123456789");
        Person p4 = new Person(4, "Ana", "987654321", "Rua 4", "987654321");
        Person p5 = new Person(5, "Pedro", "123456789", "Rua 5", "123456789");
        Person p6 = new Person(6, "Paulo", "987654321", "Rua 6", "987654321");
        Person p7 = new Person(7, "Joana", "123456789", "Rua 7", "123456789");
        Person p8 = new Person(8, "Renata", "987654321", "Rua 8", "987654321");
        Person p9 = new Person(9, "Jose", "123456789", "Rua 9", "123456789");
        Person p10 = new Person(10, "Ana", "987654321", "Rua 10", "987654321");
        Person p11 = new Person(11, "Spiderman", "123456789", "Rua 11", "123456789");
        Person p12 = new Person(12, "Paulo", "987654321", "Rua 12", "987654321");
        Person p13 = new Person(13, "Joana", "123456789", "Rua 13", "123456789");
        Person p14 = new Person(14, "Maria", "987654321", "Rua 14", "987654321");
        Person p15 = new Person(15, "Javascript", "123456789", "Rua 15", "123456789");
        Person p16 = new Person(16, "Ana", "987654321", "Rua 16", "987654321");
        Person p17 = new Person(17, "Hulk", "123456789", "Rua 17", "123456789");
        Person p18 = new Person(18, "MongoDB", "987654321", "Rua 18", "987654321");
        Person p19 = new Person(19, "Joana", "123456789", "Rua 19", "123456789");
        Person p20 = new Person(20, "Maria", "987654321", "Rua 20", "987654321");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.add(p11);
        list.add(p12);
        list.add(p13);
        list.add(p14);
        list.add(p15);
        list.add(p16);
        list.add(p17);
        list.add(p18);
        list.add(p19);
        list.add(p20);

        while(list.size() > 1){
            int m = (int) (Math.random() * list.size());
            list.remove(m);
        }
        if(list.size() == 1){
            System.out.println("\nSurvivor number: " + ((Person) list.get(0)).getNumber());
            System.out.println("--------------------");
            System.out.println("Survivor Data: ");
            System.out.println("Name: " + ((Person) list.get(0)).getName());
            System.out.println("Phone: " + ((Person) list.get(0)).getPhone());
            System.out.println("Address: " + ((Person) list.get(0)).getAddress());
            System.out.println("CPF: " + ((Person) list.get(0)).getCpf());
            System.out.println("--------------------\n");
        }
    }
}
