public class StringLen {

    public static void main(String[] args) {

        String a = "My name is Rahat ";


        String s = a + '+';
        int count = 0;
        int i = 0;

        while (s.charAt(i) != '+'){
            count++;
            i++;
        }

        System.out.println(count);
    }
}
