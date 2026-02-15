
public class RemoveSpecialChars{ 
	public static void main(String args[]) { 
		
		System.out.println("Special charectors Exaaple ::::\n");
		String text = "This - text ! has \\ /allot # of % special % characters \n"; 
		System.out.println("\nAfter Filtering Special Chars ::::"+text);
		text = text.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(text);
		
		String html = "This is bold"; 
		html = html.replaceAll("[^a-zA-Z0-9\\s+]", "");
		System.out.println(html); 
		}
	}
