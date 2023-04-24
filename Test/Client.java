package Test;

import LinkedList.LinkedList;

public class Client {

    /*
     * Problema de Josephus.
     * Imagine uma roda de 20 pessoas numeradas de 1 a 20 no sentido horário.
     * Cada pessoa possui nome, telefone endereço e CPF.
     * Começando com a pessoa de número 1, percorra a roda no sentido horário
     * elimine cada m-ésima pessoa escolhida aleatoriamente enquanto a roda tiver uma ou mais pessoas.
     * Qual o número é a pessoa sobrevivente que ainda está na lista?
     * 
     */

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Pessoa p1 = new Pessoa(1, "Fulano", "123456789", "Rua 1", "123456789");
        Pessoa p2 = new Pessoa(2, "Linda", "987654321", "Rua 2", "987654321");
        Pessoa p3 = new Pessoa(3, "Roberto", "123456789", "Rua 3", "123456789");
        Pessoa p4 = new Pessoa(4, "Ana", "987654321", "Rua 4", "987654321");
        Pessoa p5 = new Pessoa(5, "Pedro", "123456789", "Rua 5", "123456789");
        Pessoa p6 = new Pessoa(6, "Paulo", "987654321", "Rua 6", "987654321");
        Pessoa p7 = new Pessoa(7, "Joana", "123456789", "Rua 7", "123456789");
        Pessoa p8 = new Pessoa(8, "Renata", "987654321", "Rua 8", "987654321");
        Pessoa p9 = new Pessoa(9, "Jose", "123456789", "Rua 9", "123456789");
        Pessoa p10 = new Pessoa(10, "Ana", "987654321", "Rua 10", "987654321");
        Pessoa p11 = new Pessoa(11, "Spiderman", "123456789", "Rua 11", "123456789");
        Pessoa p12 = new Pessoa(12, "Paulo", "987654321", "Rua 12", "987654321");
        Pessoa p13 = new Pessoa(13, "Joana", "123456789", "Rua 13", "123456789");
        Pessoa p14 = new Pessoa(14, "Maria", "987654321", "Rua 14", "987654321");
        Pessoa p15 = new Pessoa(15, "Javascript", "123456789", "Rua 15", "123456789");
        Pessoa p16 = new Pessoa(16, "Ana", "987654321", "Rua 16", "987654321");
        Pessoa p17 = new Pessoa(17, "Hulk", "123456789", "Rua 17", "123456789");
        Pessoa p18 = new Pessoa(18, "MongoDB", "987654321", "Rua 18", "987654321");
        Pessoa p19 = new Pessoa(19, "Joana", "123456789", "Rua 19", "123456789");
        Pessoa p20 = new Pessoa(20, "Maria", "987654321", "Rua 20", "987654321");
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
            System.out.println("\nSobrevivente numero " + ((Pessoa) list.get(0)).getNumero());
            System.out.println("--------------------");
            System.out.println("Dados do sobrevivente: ");
            System.out.println("Nome: " + ((Pessoa) list.get(0)).getNome());
            System.out.println("Telefone: " + ((Pessoa) list.get(0)).getTelefone());
            System.out.println("Endereço: " + ((Pessoa) list.get(0)).getEndereco());
            System.out.println("CPF: " + ((Pessoa) list.get(0)).getCpf());
            System.out.println("--------------------\n");
        }
    }
}
