
public class Test {

	public static void main(String[] args) {
		Person p1;
		p1 = new Person();
		p1.age =20;
		Person p2;

		p2=p1;
		p2.age = 30;
		System.out.println(p1.age);
		System.out.println(p2.age);


		int a = 10;
		int b = a;
		 b = 20;
		 System.out.println(a);
		 System.out.println(b);


	}

}
