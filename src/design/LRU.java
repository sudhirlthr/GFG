package design;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    public static void main(String[] args) {
        LruImpl lru = new LruImpl(10);
        lru.set("A", "Apple");
        lru.get("A");
        lru.set("B", "Ball");
        lru.set("C", "Cat");
        lru.set("D", "Donkey");
        lru.set("E", "Ect");
        lru.set("F", "Fun");
        lru.set("G", "Guava");
        lru.get("D");
        lru.get("G");
        lru.set("H", "Halua");
        lru.set("I", "IceCream");
        lru.set("J", "Jam");
        lru.set("K", "KitKat");
        lru.set("L", "Lemon");
        lru.set("E", "Elephant");
        lru.get("D");
    }
}
class LruImpl{
    private final Map<String, String> map;
    LruImpl(Integer size){
        this.map = new LinkedHashMap<String, String>(size+1, 0.75f, false){
            protected boolean removeEldestEntry(Map.Entry<String, String > eldest){
                return size()>size;
            }
        };
    }
    public void set(String key, String value){
        setAndUpdateIndex(key, value);
    }
    public String get(String key){
        if (map.containsKey(key)) {
            String value = map.get(key);
            setAndUpdateIndex(key, value);
            return value;
        }
        return null;
    }

    private void setAndUpdateIndex(String key, String value) {
        map.remove(key);
        map.put(key, value);
        System.out.println(map);
    }
    /*public void put(int key, int value) {
        if (lru.containsKey(key)){
            lru.put(key, value);
            makeRecently(key);
        }else{
            if(lru.size() >= capacity){
                Integer oldestKey = lru.keySet().iterator().next();
                lru.remove(oldestKey);
            }
            lru.put(key, value);
        }
    }

    private void makeRecently(int key) {
        Integer value = lru.get(key);
        lru.remove(key);
        lru.put(key, value);
    }*/
}
