package array;

//FIXME починить
public class CharArray {

	
	
	public static void main(String[] args) {
		char[] charArray = {'h','E','L','l','o'};
		
		for (int i =65;i<122;i++){
			System.out.println( i + " : " + (char)i);	
		}
		for (int i=0;i<charArray.length;i++){
			if((char)charArray[i]<'A' && (char)charArray[i]>'z')System.out.println("Error input");
			else {
				if((char)charArray[i]>'`')charArray[i]=charArray[i-32];
			}
		}

	}

}