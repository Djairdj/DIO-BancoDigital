package UIntefaces;

import Modelos.Endereco;

import java.util.Scanner;

public class EndUI {
    static Scanner scan = new Scanner(System.in);

    public static Endereco novoEndereco() {
        String street, complement, city, cep, bairro, uf, pais;
        int number;
        System.out.print("Digite o nome da rua: ");
        street = scan.nextLine();
        System.out.print("Digite o número do imóvel: ");
        number = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o nome do complemento: ");
        complement = scan.nextLine();
        System.out.print("Digite o nome do bairro: ");
        bairro = scan.nextLine();
        System.out.print("Digite a cidade: ");
        city = scan.nextLine();
        System.out.print("Digite o CEP: ");
        cep = scan.nextLine();
        System.out.print("Digite o nome do estado: ");
        uf = scan.nextLine().toUpperCase();
        System.out.print("Digite o nome do país: ");
        pais = scan.nextLine();
        return new Endereco(set(street), number, set(complement), set(bairro), set(city), setCep(cep), uf, set(pais));
    }

    public static Endereco novoEndereco(String street, int number, String complement, String bairro, String city, String cep, String uf, String pais) {
        return new Endereco(set(street), number, set(complement), set(bairro), set(city), setCep(cep), uf.toUpperCase(), set(pais));
    }

    private static String set(String word) {
        String[] v = word.split(" ");
        for (int i = 0; i < v.length; i++) {
            v[i] = capitalize(v[i]);
        }
        return String.join(" ", v);
    }

    public static String capitalize(String word) {
        word = word.toUpperCase().charAt(0) + word.substring(1);
        return word;
    }

    private static String setCep(String cep) {
        cep = cep.replaceAll("[^.0-9]", "");
        if (cep.length() == 8) {
            return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
        }
        System.out.println("CEP Invalido!");
        return "00.000-000";
    }
    
}