import java.util.Arrays;
import java.util.List;
class Pro {
	static void Converter(int arg) {
		System.out.println(Math.abs(arg));
		
	}
	void doAction() {
		List<Integer> numbers = Arrays.asList(5,-3,6,7,8,-9,2);
		numbers.forEach(Pro::Converter);
		
	}
}
public class Program {
	public static void main(String[] args) {
		Program obj = new Program();
		obj.doAction();
	}

	

}
