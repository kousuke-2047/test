
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako = new Person("hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person isi = new Person(32);
		System.out.println(isi.age);
		System.out.println(isi.name);

		Person sato = new Person(24,"sato");
		System.out.println(sato.name);
		System.out.println(sato.age);
}
}