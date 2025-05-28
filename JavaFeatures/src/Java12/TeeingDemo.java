package Java12;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingDemo {

	public static void main(String[] args) {

		List<Integer> list = List.of(10, 20, 30, 40, 50, 60);
		String res = list.stream().collect(Collectors.teeing(Collectors.averagingDouble(i -> i), Collectors.counting(),
				(av, count) -> "avg" + av + "count" + count));
		System.out.println("the teeing result is " + res);

	}

}
