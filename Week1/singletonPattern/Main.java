package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1=Logger.getInstance();
		logger1.log("First message of log");
		Logger logger2=Logger.getInstance();
		logger2.log("Second message of log");
        if(logger1==logger2) {
        	System.out.println("Both instances of logger are same(Singleton is working)");
        }else {
        	System.out.println("Instances of logger are different(Singleton failed)");
        }
        
	}

}
