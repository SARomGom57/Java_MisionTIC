import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class ArregloLista {
    public static void main(String[] args) {
        ArrayList<CarroArObj> carrosLista1 = new ArrayList<CarroArObj>();
        ArrayList<String> carrosLista2 = new ArrayList<String>();
        carrosLista1.add(new CarroArObj("Mazda"));
        carrosLista1.add(new CarroArObj("Audi"));
        carrosLista1.add(new CarroArObj("Renault"));
        carrosLista2.add("Fiat");
        carrosLista2.add("Chevy");
        for (int i = 0; i < carrosLista1.size(); i++) {
            System.out.println(carrosLista1.get(i).getMarca());
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < carrosLista2.size(); i++) {
            System.out.println(carrosLista2.get(i));
        }

        /*
         * carrosLista1.set(0, new CarroArObj("Toyota"))
         * carrosLista2.set(0, "Mecedes Benz")
         * carrosLista1.remove(1);
         */

        for (int i = 0; i < carrosLista1.size(); i++) {
            System.out.println(carrosLista1.get(i).getMarca());
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < carrosLista2.size(); i++) {
            System.out.println(carrosLista2.get(i));
        }

        System.out.println("--------------------------------");

        Collections.sort(carrosLista2);
        for (int i = 0; i < carrosLista2.size(); i++) {
            System.out.println(carrosLista2.get(i));
        }

        System.out.println("--------------------------------");

        // LinkendList
        LinkedList<String> carrosLista3 = new LinkedList<String>();
        carrosLista3.add("Volvo");
        carrosLista3.add("BMW");
        carrosLista3.add("Seat");
        System.out.println(carrosLista3);
        carrosLista3.addFirst("Peugeot");
        System.out.println(carrosLista3);
        carrosLista3.addLast("Ford");
        System.out.println(carrosLista3);
        carrosLista3.add(1, "Subaru");
        System.out.println(carrosLista3);

        if (carrosLista3.contains("Ford")) {
            System.out.println("Ford esta en la lista");
        }

        System.out.println("-------------------------------");

        // Hashmap
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("Green", "Verde");
        map1.put("Red", "Rojo");
        map1.put("Blue", "Azul");
        map1.put("Yellow", "Amarillo");

        for (String i : map1.values()) {
            System.out.println(i); // Itera las keis
        }

        for (String i : map1.keySet()) {
            System.out.println(i); // Itera los values
        }
        System.err.println("Green en español es: " + map1.get("Green"));
        System.err.println("Blanco en español es: " + map1.get("White")); // no existe esta key
        System.err.println("Black en español es: " + map1.getOrDefault("Black", "No existe"));

        // Hashmap con obj CarroArObj
        Map<CarroArObj, String> map2 = new HashMap<CarroArObj, String>();
        map2.put(new CarroArObj("Jeep"), "Rojo");
        map2.put(new CarroArObj("Citroen"), "Plateado");
        map2.put(new CarroArObj("Skoda"), "Blanco");
        System.out.println(map2.size());
        for (CarroArObj i : map2.keySet()) {
            System.out.println(i.getMarca() + " - " + map2.get(i));
        }

        // HashSet
        HashSet<String> ciudades = new HashSet<String>();
        ciudades.add("Cali");
        ciudades.add("Barranquilla");
        ciudades.add("Bucaramanga");
        ciudades.add("Cali");
        System.out.println(ciudades);
    }
}
