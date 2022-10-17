import java.util.*;;
	public class PhoneBook {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedHashMap<String, String> LL = new LinkedHashMap<>();
		System.out.println();
		LL.put("AJ", "9959959999");
		LL.put("BJ", "9949969998");
		LL.put("CD", "9939979997");
		LL.put("DY", "9929989996");
		LL.put("EC", "9229939995");
		System.out.println(LL);
		System.out.println("Enter name of the person: ");
		String per = input.next();
		if (LL.containsKey(per) == true) {
		System.out.println("phone number : " + LL.get(per));
		}
		else {
		System.out.println("invalid");
		}
	}
}
