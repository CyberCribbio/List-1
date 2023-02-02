import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> citynames = Arrays.asList("Catania","Palermo","Enna","Roma");
        citynames.set(2,"Tegucigalpa");
       System.out.println(citynames);
        List<String> kingsOfRome = new ArrayList();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");
        System.out.println(kingsOfRome);
        String[] kingsOfRomeArray = (String[])kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println("kingsOfRomeArray" + Arrays.toString (kingsOfRomeArray));
    }

}