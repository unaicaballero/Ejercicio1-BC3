import java.util.ArrayList;

public class MainArrayListNombre {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("Ana");
        listaNombres.add("Carlos");
        listaNombres.add("Beatriz");
        listaNombres.add("David");

        listaNombres.add(1, "Elena");
        System.out.println("Lista original " + listaNombres.size() + " elementos:");

        for (String nombre : listaNombres) {
            System.out.println("- " + nombre);
        }

        listaNombres.remove("Carlos");

        listaNombres.remove(0);

        System.out.println("Eliminando a 'Carlos' y al elemento en posición 0 ...");

        System.out.println("Lista tras las eliminaciones " + listaNombres.size() + " elementos:");

        System.out.println(listaNombres);
    }
}