package pouet;

import static pouet.zou.Test3.you;
import java.util.ArrayList;
import java.util.List;

class Toto {
}

class Pichade {

}

public class Test extends Pichade {

	static class Zozoz {

	}

	public Test() {
	}

	private int x;
	protected Toto toto;

	public static void main(String[] args) {
		Test t = new Test();
		t.blah();
	}

	void blah() {
		this.x = 5;
		this.toto = new Toto();

		System.out.println(this.x);

		int l;
		l = 10;
		l += 1;

		List<String> list = new ArrayList<>();
		for (String s : list) {
			System.out.println("sss = " + s);
		}

		manyArgs(1, 2, 3, 4);
	}

	void manyArgs(int a, int b, int c, int d) {
	}

	void varargTest(String[] s, String... ss) {

	}

	public int getX() {
		return x;
	}

}
