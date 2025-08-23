
public class Main {
    public static void main(String[] args) {
range r = new range(0,10,2);
        int si = r.size();
        System.out.println(si);
r.setStep(3);
 si = r.size();
System.out.println(si);
//        System.out.println(r);
//        for (int val : r) {  // iterator ka kaam ye loop karega
//            System.out.print(val + " ");
//        }

    }
}