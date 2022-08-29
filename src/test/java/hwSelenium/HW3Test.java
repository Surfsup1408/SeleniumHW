package hwSelenium;

public class HW3Test {

	public static void main(String[] args) throws InterruptedException {

		TestCase3HW obj = new TestCase3HW();

		obj.setUp();

		obj.dragAndDropHW();

		obj.tearDown();
	}
}
