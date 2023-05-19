import java.util.Arrays;

public class HashTable{

    private static final int TABLE_SIZE = 10;

    private String[] table;

    public HashTable() {
        table = new String[TABLE_SIZE];
        Arrays.fill(table, null);
    }

    private int hashFunction(String key) {
        // A simple hash function that returns the length of the key
        return key.length();
        // You can also use a hash function that returns the modulus
        // of the key-length and table-size % TABLE_SIZE
    }

    public void put(String key, String value) {
        int index = hashFunction(key);
        table[index] = value;
    }

    public String get(String key) {
        int index = hashFunction(key);
        return table[index];
    }

    public static void main(String[] args) {
        HashTable table = new HashTable();

        // Add some key-value pairs to the hash table
        table.put("tiny-cat", "meow");
        table.put("barky-dog", "woof");
        table.put("cow", "moo");

        // Retrieve values based on their keys
        System.out.println(table.get("tiny-cat"));
        System.out.println(table.get("barky-dog"));
        System.out.println(table.get("cow"));
    }
}
