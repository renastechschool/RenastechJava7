package Day32_Maps;

import java.util.TreeMap;

public class Topic3_TreeMap {
    public static void main(String[] args) {
        //DataType VariableName = new DataType();
        TreeMap<String, Integer> ModelYearOfCars = new TreeMap<>();

        ModelYearOfCars.put("Tesla", 2021);
        ModelYearOfCars.put("Volkwagen", 2020);
        ModelYearOfCars.put("Subaru", 2009);
        System.out.println(ModelYearOfCars);

    }
}
