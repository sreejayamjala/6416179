public class Test1 {
    public static void main(String[] args) {
     Logger l1= Logger.getInstance();
     l1.printMsg("logger1");
     Logger l2= Logger.getInstance();
     l2.printMsg("logger2");
     if(l1==l2)
     {
        System.out.println("same object");
     }
     else
     {
        System.out.println("Singlrton failed");
     }
    }
}
