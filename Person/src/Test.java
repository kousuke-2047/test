/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {






	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = new Person();
		Person taro = new Person();
		taro.name= "taro";
		taro.age =18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		System.out.println();

		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person no = new Person(25);
		System.out.println(no.name);
		System.out.println(no.age);

		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);


	}

}
