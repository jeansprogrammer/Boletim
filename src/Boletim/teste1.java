package Boletim;

import java.util.ArrayList;
import java.util.List;

public class teste1 {

    public static void main(String[] args) {

        List<String> listaCores = new ArrayList<String>(40); 

        listaCores.add("Azul");
        listaCores.add("Azul");
        listaCores.add("Azul");
        listaCores.add("Azul");
        listaCores.add("Azul");

        System.out.println(listaCores.size());
        System.out.println(listaCores.toString());
        System.out.println(listaCores.get(4));

        listaCores.add(4,"Vermelho");
        System.out.println("Inseri o Vermelho na posição 4");

        System.out.println(listaCores.size());
        System.out.println(listaCores.toString());
        System.out.println(listaCores.get(4));

    }
}