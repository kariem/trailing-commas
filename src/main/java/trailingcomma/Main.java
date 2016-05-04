package trailingcomma;

import java.util.Arrays;

public final class Main {

	private static final String[] DINOS_IN_JURASSIC = {
		"Archaeopteryx",
		"Diplodocus",
		"Plesiosaurus",
	};
	private static int i[][] = { {,}, {,}, {,}, };

	enum MovieTypes {
		GOOD,
		BAD,
		UGLY,
		;
	}

	private Main() {}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(DINOS_IN_JURASSIC));
		System.out.println(Arrays.toString(MovieTypes.values()));
		System.out.println(Arrays.deepToString(i));
	}

}
