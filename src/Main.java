import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> listado = new ArrayList<>();
        listado.add("a");
        listado.add("b");
        listado.add("c");
        listado.add("doctorado");
        listado.add("elefante");
        listado.forEach(str->System.out.println(str));//imprimo las minusculas
        List<String> mayusculas = new ArrayList<>();
        mayusculas = listado.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        mayusculas.forEach(str->System.out.println(str));//imprimo las mayusculas

        //ejercicio 2
        int n = 5;
        Concatenacion concateno = (lista, numero)-> String.join(", ", lista.stream().filter(palabra->palabra.length() > numero).collect(Collectors.toList()));
        String palabrasCocatenadas= concateno.concatenar(listado,n);
        System.out.println(palabrasCocatenadas);

    }
}