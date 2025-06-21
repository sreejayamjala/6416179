public class Computer {
     private String CPU;
     private String RAM;
     private String storage;
     private String GPU;

     private Computer(ComputerBuilder builder) 
    {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.GPU=builder.GPU;
    }

    public void display()
    {
        System.out.println("CPU: "+CPU);
        System.out.println("RAM: "+RAM);
        System.err.println("Storag: "+storage);
        System.out.println("GPU: "+GPU);
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        public ComputerBuilder CPU(String value) {
            this.CPU = value;
            return this;
        }
        public ComputerBuilder RAM(String value) {
            this.RAM = value;
            return this;
        }
        public ComputerBuilder storage(String value) {
            this.storage = value;
            return this;
        }
        public ComputerBuilder GPU(String value) {
            this.GPU = value;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
