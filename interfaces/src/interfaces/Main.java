package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = new Logger[] {
			new EmailLogger(),
			new SmsLogger(),
			new FileLogger(),
			new DatabaseLogger()
		};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer eren = new Customer(1,"Eren","Arý");
		customerManager.add(eren);

	}

}
