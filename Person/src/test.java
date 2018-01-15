/**
 *
 */

/**
 * @author testuser
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Person taro=new Person();
	taro.name="山田太郎";
	taro.age=20;
	taro.talk();
	taro.walk();
	taro.run();
	System.out.println(taro.name);
	System.out.println(taro.age);

	Robot aibo=new Robot();
	aibo.name="aibo";
	aibo.talk();
	aibo.walk();
	aibo.run();
	System.out.println(aibo.name);

	Robot asimo=new Robot();
	asimo.name="asimo";
	asimo.talk();
	asimo.walk();
	asimo.run();
	System.out.println(asimo.name);

	Robot pepper=new Robot();
	pepper.name="pepper";
	pepper.talk();
	pepper.walk();
	pepper.run();
	System.out.println(pepper.name);

	Robot doraemon=new Robot();
	doraemon.name="doraemon";
	doraemon.talk();
	doraemon.walk();
	doraemon.run();





	}

}
