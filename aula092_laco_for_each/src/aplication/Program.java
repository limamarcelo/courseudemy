package aplication;

public class Program {

	public static void main(String[] args) {
		String []vect = new String[]{"Maria", "Alex", "Ana"};
		
		for (int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}

		System.out.println("-----------------------");
		//Leitura:"para cada objeto 'obj' contido em vect, faça:"
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
