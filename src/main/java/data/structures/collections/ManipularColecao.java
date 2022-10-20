package data.structures.collections;

import java.sql.Array;
import java.util.*;

public class ManipularColecao {

    public static void main(String[] args) {
        List<Integer> listaNumerica = new ArrayList<>();
        int x1 = 10;
        int x2 = 5;
        int x3 = 115;

        listaNumerica.add(x1);
        listaNumerica.add(x2);
        listaNumerica.add(x3);

        System.out.println(listaNumerica);

//        Collections.sort(listaNumerica);

        listaNumerica.sort((o1, o2) -> o2 - o1);

        System.out.println(listaNumerica);



//        System.out.println(listaNumerica.size());
//        System.out.println(listaNumerica.get(1));
//
//        for(int x: listaNumerica) {
//            System.out.println(x);
//        }
//
//        //LIST OF
//        var listaNumerica2 = List.of(1,2,3);
//        System.out.println(listaNumerica2);

        Map<String, Pessoa> pessoas = new HashMap<>();

        var pessoa1 = new Pessoa("joao", 12);
        var pessoa2 = new Pessoa("maria", 26);
        var pessoa3 = new Pessoa("alan", 17);
        var pessoa4 = new Pessoa("alan", 30);

        pessoas.put(pessoa1.getNome(), pessoa1);
        pessoas.put(pessoa2.getNome(), pessoa2);
        pessoas.put(pessoa3.getNome(), pessoa3);
        pessoas.put(pessoa4.getNome(), pessoa4);


        System.out.println(pessoas);

        System.out.println(pessoas.getOrDefault("jose", new Pessoa("jose", 0)));
        System.out.println(pessoas.get("maria"));

//        pessoas.sort(Comparator.comparing(Pessoa::getNome)); //Comparable, Comparator

//        System.out.println(pessoas);


    }

}
