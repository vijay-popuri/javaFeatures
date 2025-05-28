package Java12;

public class SwitchExpression {
	public String switchExprs(int marks) {
		String res = switch (marks / 10) {
		case 10, 9 -> "A+";
		case 8 -> "A";
		case 7 -> "B+";
		case 6 -> "B";
		case 5 -> "C";
		case 4 -> "FAIL";
		default -> "E";
		};
		return res;
	}

	public static void main(String[] args) {
		SwitchExpression se = new SwitchExpression();

		System.out.println(se.switchExprs(76));
	}

}
