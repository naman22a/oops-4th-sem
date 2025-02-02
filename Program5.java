
class MyString {

    boolean equal(String s1, String s2) {
        return s1.equals(s2);
    }

    String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    String toggleCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

}

public class Program5 {

    public static void main(String[] args) {
        String s = "abcd";
        MyString mstr = new MyString();
        s = mstr.reverse(s);
        System.out.println(s);

        String s1 = "abcd";
        String s2 = "absd";
        System.out.println(mstr.equal(s1, s2));

        System.out.println(mstr.toggleCase("Test"));
    }
}
