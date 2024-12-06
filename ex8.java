public class StringMutation {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
    }
}