//import java.util.HashMap;
//import java.util.Objects;
//import java.util.Scanner;
//
////англиско-македонски речник - ХЕШ
////Инпут:
////4
////cat  macka
////fish riba
////dog kuce
////parrot papagal
////lav
//// kuce
////macka
//////KRAJ
////OUTPUT:
////cat
////dog
////parrot
/////
//class MapEntry<K extends Comparable<K>,E> implements Comparable<K> {
//
//    // Each MapEntry object is a pair consisting of a key (a Comparable
//    // object) and a value (an arbitrary object).
//    K key;
//    E value;
//
//    public MapEntry (K key, E val) {
//        this.key = key;
//        this.value = val;
//    }
//
//    public int compareTo (K that) {
//        // Compare this map entry to that map entry.
//        @SuppressWarnings("unchecked")
//        MapEntry<K,E> other = (MapEntry<K,E>) that;
//        return this.key.compareTo(other.key);
//    }
//
//    public String toString () {
//        return "<" + key + "," + value + ">";
//    }
//}
// class SLLNode<E> {
//    protected E element;
//    protected SLLNode<E> succ;
//
//    public SLLNode(E elem, SLLNode<E> succ) {
//        this.element = elem;
//        this.succ = succ;
//    }
//
//    @Override
//    public String toString() {
//        return element.toString();
//    }
//}
//class CBHT<K extends Comparable<K>, E> {
//
//    // An object of class CBHT is a closed-bucket hash table, containing
//    // entries of class MapEntry.
//    private SLLNode<MapEntry<K,E>>[] buckets;
//
//    @SuppressWarnings("unchecked")
//    public CBHT(int m) {
//        // Construct an empty CBHT with m buckets.
//        buckets = (SLLNode<MapEntry<K,E>>[]) new SLLNode[m];
//    }
//
//    private int hash(K key) {
//        // Translate key to an index of the array buckets.
//        return Math.abs(key.hashCode()) % buckets.length;
//    }
//
//    public SLLNode<MapEntry<K,E>> search(K targetKey) {
//        // Find which if any node of this CBHT contains an entry whose key is
//        // equal
//        // to targetKey. Return a link to that node (or null if there is none).
//        int b = hash(targetKey);
//        for (SLLNode<MapEntry<K,E>> curr = buckets[b]; curr != null; curr = curr.succ) {
//            if (targetKey.equals(((MapEntry<K, E>) curr.element).key))
//                return curr;
//        }
//        return null;
//    }
//
//    public void insert(K key, E val) {		// Insert the entry <key, val> into this CBHT.
//        MapEntry<K, E> newEntry = new MapEntry<K, E>(key, val);
//        int b = hash(key);
//        for (SLLNode<MapEntry<K,E>> curr = buckets[b]; curr != null; curr = curr.succ) {
//            if (key.equals(((MapEntry<K, E>) curr.element).key)) {
//                // Make newEntry replace the existing entry ...
//                curr.element = newEntry;
//                return;
//            }
//        }
//        // Insert newEntry at the front of the 1WLL in bucket b ...
//        buckets[b] = new SLLNode<MapEntry<K,E>>(newEntry, buckets[b]);
//    }
//
//    public void delete(K key) {
//        // Delete the entry (if any) whose key is equal to key from this CBHT.
//        int b = hash(key);
//        for (SLLNode<MapEntry<K,E>> pred = null, curr = buckets[b]; curr != null; pred = curr, curr = curr.succ) {
//            if (key.equals(((MapEntry<K,E>) curr.element).key)) {
//                if (pred == null)
//                    buckets[b] = curr.succ;
//                else
//                    pred.succ = curr.succ;
//                return;
//            }
//        }
//    }
//
//    public String toString() {
//        String temp = "";
//        for (int i = 0; i < buckets.length; i++) {
//            temp += i + ":";
//            for (SLLNode<MapEntry<K,E>> curr = buckets[i]; curr != null; curr = curr.succ) {
//                temp += curr.element.toString() + " ";
//            }
//            temp += "\n";
//        }
//        return temp;
//    }
//
//}
////(29?(29?(29?0+ASCII(c1))+ASCII(c2))+ASCII(c3))%102780
//
//public class recnik {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        CBHT<Word,String> recnik =new CBHT<Word,String>(4*n);
//        for (int i=0;i<n;i++){
//            String eng= in.next();
//            String mkd=in.next();
//            recnik.insert(new Word(mkd),eng);
//            recnik.insert(new Word(eng),mkd);
//        }
//        while(true){
//            String word= in.next();
//            if(word.equalsIgnoreCase("KRAJ")){
//                break;
//            }
//            Word searchWord=new Word(word);
//            SLLNode<MapEntry<Word,String>> curr=recnik.search(searchWord);
//
//
//                if(curr!=null){
//                    System.out.println(curr.element.value);
//                }
//                else{
//                    System.out.println("/");
//                }
//            }
//        }
//
//
//    }
//
//class Word implements Comparable<Word>{
//    String word;
//
//    public Word(String word) {
//        this.word = word;
//    }
//
//    @Override
//    public int compareTo(Word o) {
//        return this.word.compareTo(o.word);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Word)) return false;
//        Word word1 = (Word) o;
//        return Objects.equals(word, word1.word);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(word);
//    }
//}
//
