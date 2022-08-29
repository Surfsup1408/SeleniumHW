package hwSelenium;



public class HW4Test {

	public static void main(String[] args) throws InterruptedException {
		
		TestCase4HW obj = new TestCase4HW();

		 obj.setUp();

		obj.addNewJob();

		obj.tearDown();
	}
	
}
