//
//import java.util.Scanner;
//
//class SLLNode {
//    String name;
//    int price;
//    SLLNode succ;
//
//    public SLLNode(String name, int price, SLLNode succ) {
//        this.name = name;
//        this.price = price;
//        this.succ = succ;
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
//}
//
//class SLL {
//    SLLNode first;
//
//    public SLL() {
//        this.first = null;
//    }
//
//    public void insertFirst(String name, int price) {
//        SLLNode ins = new SLLNode(name, price, first);
//        first = ins;
//    }
//
//    public void insertLast(String name, int price) {
//        if (first != null) {
//            SLLNode tmp = first;
//            while (tmp.succ != null)
//                tmp = tmp.succ;
//            SLLNode ins = new SLLNode(name, price, null);
//            tmp.succ = ins;
//        } else {
//            insertFirst(name, price);
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder ret = new StringBuilder();
//        if (first != null) {
//            SLLNode tmp = first;
//            ret.append(tmp).append("\n");
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret.append(tmp).append("\n");
//            }
//        } else
//            ret = new StringBuilder("NO ELEMENTS");
//        return ret.toString();
//    }
//}
//
//public class CakeShop {
//
//    public static void removeCakes(SLL cakes) {
//        // TODO: implement method
//        SLLNode curr = cakes.first;
//
//        int brTorti = 0;
//        int sumaCeni = 0;
//        double procechnaCena = 0.0;
//
//        while (curr != null) {
//            sumaCeni = sumaCeni + curr.price;
//            brTorti++;
//            curr = curr.succ;
//        }
//
//        procechnaCena = (double) sumaCeni / (double) brTorti;
//
//        curr = cakes.first;
//        while (curr.succ != null) {
//            if (cakes.first.price > procechnaCena) {
//                cakes.first = cakes.first.succ;
//            }
//            if (curr.succ.price > procechnaCena) {
//                curr.succ = curr.succ.succ;
//                continue;
//            }
//            curr = curr.succ;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        SLL cakes = new SLL();
//
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            String[] parts = line.split("\\s+");
//            cakes.insertLast(parts[0], Integer.parseInt(parts[1]));
//        }
//
//        removeCakes(cakes);
//        System.out.println(cakes.toString());
//    }
//}