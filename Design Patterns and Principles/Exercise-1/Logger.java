public class Logger
{
    private static Logger instance = null;
    private Logger(){
        System.err.println("Logger constuctor created");
    }
     public static Logger getInstance(){
     if (instance == null) {
        instance = new Logger();
     }
     return instance;
    }
    public void printMsg(String Msg)
    {
        System.out.println(Msg);
    }
}