package Day32_Maps;

import java.util.HashMap;

public class Topic2_HashMap {
    public static void main(String[] args) {

        //DataType VariableName = new Datatype();
        HashMap<String, String> MyHashMap = new HashMap<>();

        // put(Key, Value) Inserts the key and value into the map


        MyHashMap.put("Name", "Eloise");
        MyHashMap.put("Age", "34");
        MyHashMap.put("Surname", "Elemen");
        MyHashMap.put("Salary", "120459863");
        MyHashMap.put("Country", "Brazil");

        // get(Key) <- this will return the value of given key
        System.out.println(MyHashMap.get("Age"));
        System.out.println(MyHashMap.get("Name"));

        System.out.println(MyHashMap);


      /*
        put(Key, Value) - Inserts the association of a key and a value into the map.
        If the key is already present, the new value replaces the old value.
        putIfAbsent(Key, Value) - Inserts the association if the key is not already associated with the value.
        putAll() - Inserts all the entries from the specified map to this map.
        get(Key) - Returns the value associated with the specified key. If the key is not found, it returns null.
        getOrDefault(Key, defaultValue) - Returns the value associated with the specified key.
        If the key is not found, it returns the defaultValue.
        containsKey(Key) - Checks if the specified key K is present in the map or not.
        containsValue(Value) - Checks if the specified value V is present in the map or not.
        replace(Key, Value) - Replace the value of the key K with the new specified value V.
        replace(Key, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
        remove(Key) - Removes the entry from the map represented by the key K.
        remove(Key, Value) - Removes the entry from the map that has key K associated with value V.
        keySet() - Returns a set of all the keys present in a map.
        values() - Returns a set of all the values present in a map.
        entrySet() - Returns a set of all the key/value mapping present in a map.

        put
        get
        getOrDefault
        containsKey
        replace
        remove
        keySet

         */

    }
}