package capsule2;

public class Capsule {

	public static void main(String[] args) {
		Person taro = new Person("山田太郎",20);
		System.out.println(taro.getName());
		taro.setName("jiro");
		System.out.println(taro.getName());

		Person isi = new Person("isi",12);
		isi.getName();
		System.out.println(isi.getName());
		;


	}

}
