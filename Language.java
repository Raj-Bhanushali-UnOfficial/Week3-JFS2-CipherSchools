import java.util.ArrayList;

public class Language {
	public static void main(String[] args) {
		ArrayList<String> lang = new ArrayList<String>();
		
		lang.add("Java");
		lang.add("Csharp");
		lang.add("Python");
		lang.add("PHP");
		
		lang.forEach(System.out::println);
		
	}

}
