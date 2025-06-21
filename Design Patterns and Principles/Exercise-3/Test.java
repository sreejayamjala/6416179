public class Test {
    public static void main(String[] args) {
        
        Computer g = new Computer.ComputerBuilder()
                         .CPU("Intel Core i8")
                         .RAM("16 GB")
                         .GPU("NVIDIA GeForce RTX 3080")
                         .build();
        g.display();
        
        System.err.println("---------------------");

        Computer a = new Computer.ComputerBuilder()
                         .CPU("Intel Core i8")
                         .RAM("16 GB")
                         .GPU("NVIDIA GeForce RTX 3080")
                         .build();
        a.display();                 
    }

}
