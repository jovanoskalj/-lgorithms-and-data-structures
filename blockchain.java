//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Map;
//import java.util.Scanner;
// class DLL<E> {
//    private DLLNode<E> first, last;
//
//    public DLL() {
//        // Construct an empty SLL
//        this.first = null;
//        this.last = null;
//    }
//
//    public void deleteList() {
//        first = null;
//        last = null;
//    }
//
//    public int length() {
//        int ret;
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            ret = 1;
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret++;
//            }
//            return ret;
//        } else
//            return 0;
//
//    }
//
//    public DLLNode<E> find(E o) {
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            while (tmp.element != o && tmp.succ != null)
//                tmp = tmp.succ;
//            if (tmp.element == o) {
//                return tmp;
//            } else {
//                System.out.println("Elementot ne postoi vo listata");
//            }
//        } else {
//            System.out.println("Listata e prazna");
//        }
//        return first;
//    }
//
//    public void insertFirst(E o) {
//        DLLNode<E> ins = new DLLNode<E>(o, null, first);
//        if (first == null)
//            last = ins;
//        else
//            first.pred = ins;
//        first = ins;
//    }
//
//    public void insertLast(E o) {
//        if (first == null)
//            insertFirst(o);
//        else {
//            DLLNode<E> ins = new DLLNode<E>(o, last, null);
//            last.succ = ins;
//            last = ins;
//        }
//    }
//
//    public void insertAfter(E o, DLLNode<E> after) {
//        if(after==last){
//            insertLast(o);
//            return;
//        }
//        DLLNode<E> ins = new DLLNode<E>(o, after, after.succ);
//        after.succ.pred = ins;
//        after.succ = ins;
//    }
//
//    public void insertBefore(E o, DLLNode<E> before) {
//        if(before == first){
//            insertFirst(o);
//            return;
//        }
//        DLLNode<E> ins = new DLLNode<E>(o, before.pred, before);
//        before.pred.succ = ins;
//        before.pred = ins;
//    }
//
//    public E deleteFirst() {
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            first = first.succ;
//            if (first != null) first.pred = null;
//            if (first == null)
//                last = null;
//            return tmp.element;
//        } else
//            return null;
//    }
//
//    public E deleteLast() {
//        if (first != null) {
//            if (first.succ == null)
//                return deleteFirst();
//            else {
//                DLLNode<E> tmp = last;
//                last = last.pred;
//                last.succ = null;
//                return tmp.element;
//            }
//        }
//        // else throw Exception
//        return null;
//    }
//
//    public E delete(DLLNode<E> node) {
//        if(node==first){
//            deleteFirst();
//            return node.element;
//        }
//        if(node==last){
//            deleteLast();
//            return node.element;
//        }
//        node.pred.succ = node.succ;
//        node.succ.pred = node.pred;
//        return node.element;
//
//    }
//
//    @Override
//    public String toString() {
//        String ret = new String();
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            ret += tmp + "<->";
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret += tmp + "<->";
//            }
//        } else
//            ret = "Prazna lista!!!";
//        return ret;
//    }
//
//    public String toStringR() {
//        String ret = new String();
//        if (last != null) {
//            DLLNode<E> tmp = last;
//            ret += tmp + "<->";
//            while (tmp.pred != null) {
//                tmp = tmp.pred;
//                ret += tmp + "<->";
//            }
//        } else
//            ret = "Prazna lista!!!";
//        return ret;
//    }
//
//    public DLLNode<E> getFirst() {
//        return first;
//    }
//
//    public DLLNode<E> getLast() {
//
//        return last;
//    }
//
//    public void izvadiDupliIPrebroj(){
//
//    }
//}
// class DLLNode<E> {
//    protected E element;
//    protected DLLNode<E> pred, succ;
//
//    public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
//        this.element = elem;
//        this.pred = pred;
//        this.succ = succ;
//    }
//
//    @Override
//    public String toString() {
//        return element.toString();
//    }
//}
//
//
//
// class SLLNode<E> {
//     protected E element;
//     protected SLLNode<E> succ;
//
//     public SLLNode(E elem, SLLNode<E> succ) {
//         this.element = elem;
//         this.succ = succ;
//     }
//
//     @Override
//     public String toString() {
//         return element.toString();
//     }
// }
// class CBHT<K extends Comparable<K>, E> {
//
//     // An object of class CBHT is a closed-bucket hash table, containing
//     // entries of class MapEntry.
//     private SLLNode<MapEntry<K,E>>[] buckets;
//
//     @SuppressWarnings("unchecked")
//     public CBHT(int m) {
//         // Construct an empty CBHT with m buckets.
//         buckets = (SLLNode<MapEntry<K,E>>[]) new SLLNode[m];
//     }
//
//     private int hash(K key) {
//         // Translate key to an index of the array buckets.
//         return Math.abs(key.hashCode()) % buckets.length;
//     }
//
//     public SLLNode<MapEntry<K,E>> search(K targetKey) {
//         // Find which if any node of this CBHT contains an entry whose key is
//         // equal
//         // to targetKey. Return a link to that node (or null if there is none).
//         int b = hash(targetKey);
//         for (SLLNode<MapEntry<K,E>> curr = buckets[b]; curr != null; curr = curr.succ) {
//             if (targetKey.equals(((MapEntry<K, E>) curr.element).key))
//                 return curr;
//         }
//         return null;
//     }
//
//     public void insert(K key, E val) {		// Insert the entry <key, val> into this CBHT.
//         MapEntry<K, E> newEntry = new MapEntry<K, E>(key, val);
//         int b = hash(key);
//         for (SLLNode<MapEntry<K,E>> curr = buckets[b]; curr != null; curr = curr.succ) {
//             if (key.equals(((MapEntry<K, E>) curr.element).key)) {
//                 // Make newEntry replace the existing entry ...
//                 curr.element = newEntry;
//                 return;
//             }
//         }
//         // Insert newEntry at the front of the 1WLL in bucket b ...
//         buckets[b] = new SLLNode<MapEntry<K,E>>(newEntry, buckets[b]);
//     }
//
//     public void delete(K key) {
//         // Delete the entry (if any) whose key is equal to key from this CBHT.
//         int b = hash(key);
//         for (SLLNode<MapEntry<K,E>> pred = null, curr = buckets[b]; curr != null; pred = curr, curr = curr.succ) {
//             if (key.equals(((MapEntry<K,E>) curr.element).key)) {
//                 if (pred == null)
//                     buckets[b] = curr.succ;
//                 else
//                     pred.succ = curr.succ;
//                 return;
//             }
//         }
//     }
//
//     public String toString() {
//         String temp = "";
//         for (int i = 0; i < buckets.length; i++) {
//             temp += i + ":";
//             for (SLLNode<MapEntry<K,E>> curr = buckets[i]; curr != null; curr = curr.succ) {
//                 temp += curr.element.toString() + " ";
//             }
//             temp += "\n";
//         }
//         return temp;
//     }
//
// }
// class MapEntry<K extends Comparable<K>,E> implements Comparable<K> {
//
//     // Each MapEntry object is a pair consisting of a key (a Comparable
//     // object) and a value (an arbitrary object).
//     K key;
//     E value;
//
//     public MapEntry (K key, E val) {
//         this.key = key;
//         this.value = val;
//     }
//
//     public int compareTo (K that) {
//         // Compare this map entry to that map entry.
//         @SuppressWarnings("unchecked")
//         MapEntry<K,E> other = (MapEntry<K,E>) that;
//         return this.key.compareTo(other.key);
//     }
//
//     public String toString () {
//         return "<" + key + "," + value + ">";
//     }
// }
//class Block{
//     int index;
//     String data;
//     int hash;
//     int prevhash;
//
//    public Block(int index, String data) {
//        this.index = index;
//        this.data = data;
//        this.hash=
//    }
//}
//
//public class blockchain {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int izbor;
//        do {
//            izbor=in.nextInt();
//            switch (izbor){
//
//            }
//            while(izbor==0)
//        }
//    }
//}
