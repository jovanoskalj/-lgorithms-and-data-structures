//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
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
//            ret += tmp + "->";
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret += tmp + "->";
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
//public class rezultantnaLista
//{
//    public static SLL<Integer> sum(SLL<Integer> lista1, SLL<Integer> lista2) {
//        Stack<Integer> stack1 = new Stack<Integer>();
//        Stack<Integer> stack2 = new Stack<Integer>();
//
//        SLLNode<Integer> move = lista1.getFirst();
//        while (move!=null){
//            stack1.push(move.element);
//            move=move.succ;
//        }
//        move=lista2.getFirst();
//        while (move!=null){
//            stack2.push(move.element);
//            move=move.succ;
//        }
//
//        SLL<Integer> result = new SLL<Integer>();
//        int carry = 0;
//        int s1,s2;
//        while (!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
//            if (!stack1.isEmpty()){
//                s1=stack1.pop();
//            }
//            else {
//                s1=0;
//            }
//            if (!stack2.isEmpty()){
//                s2=stack2.pop();
//            }
//            else {
//                s2=0;
//            }
//
//            int s =(s1+s2)%10 + carry;
//            result.insertFirst(s);
//            carry = (s1+s2)/10;
//        }
//        return result;
//    }
//    public static void main(String []args) throws IOException
//    {
//        Scanner in = new Scanner(System.in);
//        SLL<Integer> lista1 = new SLL<Integer>();
//        SLL<Integer> lista2 = new SLL<Integer>();
//
//        int N = in.nextInt();
//
//
//        for(int i=0;i<N;i++)
//        {
//            lista1.insertLast(in.nextInt());
//        }
//        int M = in.nextInt();
//        for (int i = 0; i < M; i++) {
//            lista2.insertLast(in.nextInt());
//        }
//        SLL<Integer> result = sum(lista1, lista2);
//        System.out.println(result);
//    }
//}