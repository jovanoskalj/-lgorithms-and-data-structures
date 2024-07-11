////l1 1 0 6 5
////l2   3 8 2
////result: 1 4 4 7
////Dadeni se dve edinecno povrzani listi. Da se dobie treta (rez lista) koja ke gi sodrzi ednocifrenite zborovi;
//import java.io.BufferedReader;
//import  java.io.*;
//import java.util.Scanner;
//
//class SLLNode<E> {
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
//class SLL<E> {
//    private SLLNode<E> first;
//
//    public SLL() {
//        // Construct an empty SLL
//        this.first = null;
//    }
//
//    public void deleteList() {
//        first = null;
//    }
//
//    public int length() {
//        int ret;
//        if (first != null) {
//            SLLNode<E> tmp = first;
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
//    @Override
//    public String toString() {
//        String ret = new String();
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            ret += tmp + " ";
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret += tmp + " ";
//            }
//        } else
//            ret = "Prazna lista!!!";
//        return ret;
//    }
//
//    public void insertFirst(E o) {
//        SLLNode<E> ins = new SLLNode<E>(o, first);
//        first = ins;
//    }
//
//    public void insertAfter(E o, SLLNode<E> node) {
//        if (node != null) {
//            SLLNode<E> ins = new SLLNode<E>(o, node.succ);
//            node.succ = ins;
//        } else {
//            System.out.println("Dadenot jazol e null");
//        }
//    }
//
//    public void insertBefore(E o, SLLNode<E> before) {
//
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            if(first==before){
//                this.insertFirst(o);
//                return;
//            }
//            //ako first!=before
//            while (tmp.succ != before)
//                tmp = tmp.succ;
//            if (tmp.succ == before) {
//                SLLNode<E> ins = new SLLNode<E>(o, before);
//                tmp.succ = ins;
//            } else {
//                System.out.println("Elementot ne postoi vo listata");
//            }
//        } else {
//            System.out.println("Listata e prazna");
//        }
//    }
//
//    public void insertLast(E o) {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            while (tmp.succ != null)
//                tmp = tmp.succ;
//            SLLNode<E> ins = new SLLNode<E>(o, null);
//            tmp.succ = ins;
//        } else {
//            insertFirst(o);
//        }
//    }
//
//    public E deleteFirst() {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            first = first.succ;
//            return tmp.element;
//        } else {
//            System.out.println("Listata e prazna");
//            return null;
//        }
//    }
//
//    public E delete(SLLNode<E> node) {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            if(first ==node){
//                return this.deleteFirst();
//            }
//            while (tmp.succ != node && tmp.succ.succ != null)
//                tmp = tmp.succ;
//            if (tmp.succ == node) {
//                tmp.succ = tmp.succ.succ;
//                return node.element;
//            } else {
//                System.out.println("Elementot ne postoi vo listata");
//                return null;
//            }
//        } else {
//            System.out.println("Listata e prazna");
//            return null;
//        }
//
//    }
//
//    public SLLNode<E> getFirst() {
//        return first;
//    }
//
//    public SLLNode<E> find(E o) {
//        if (first != null) {
//            SLLNode<E> tmp = first;
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
//}
//
//
//public class zbir {
//    public static SLL <Integer> sum (SLL<Integer> lista1,SLL<Integer> lista2){
//        SLLNode<Integer> dvizi1=lista1.getFirst();
//        String broj1= new String();
//        String broj2= new String();
//        SLLNode<Integer> dvizi2=lista2.getFirst();
//        while(dvizi1!=null){
//            broj1=broj1+dvizi1.element;
//            dvizi1=dvizi1.succ;
//        }
//        while(dvizi2!=null){
//            broj2= broj2+dvizi2.element;
//            dvizi2=dvizi2.succ;
//        }
//        SLL<Integer> result = new SLL<Integer>();
//        int suma = Integer.parseInt(broj1)+Integer.parseInt(broj2);
//        int n= String.valueOf(suma).length();
//        while (suma>0){
//            result.insertFirst(suma%10);
//            suma/=10;
//        }
//      return result;
//    }
//    public static void main(String[] args) throws IOException{
//        Scanner in= new Scanner(System.in);
//       SLL<Integer> lista1= new SLL<Integer>();
//       SLL<Integer> lista2=new SLL<Integer>();
//       int n=in.nextInt();
//       for(int i=0;i<n;i++){
//           lista1.insertLast(in.nextInt());
//       }
//       int m= in.nextInt();
//       for(int i=0;i<m;i++){
//           lista2.insertLast(in.nextInt());
//       }
//       SLL<Integer> result=sum(lista1,lista2);
//        System.out.println(result);
//    }
//}