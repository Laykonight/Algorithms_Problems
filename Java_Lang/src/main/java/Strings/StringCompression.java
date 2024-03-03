package Strings;

public class StringCompression {
    public static String StringCompress(String str){
        if (str.length() < 3){
            return str;
        }
        StringBuffer compress = new StringBuffer("");
        int len = str.length();
        int counter = 1;
        char c = str.charAt(0);
        for (int i = 1; i < len; ++i){
            char current =str.charAt(i);
            if (c == current){
                ++counter;
                continue;
            }
            compress.append(c).append(counter);
            c = current;
            counter = 1;
        }
        compress.append(c).append(counter);
        if (compress.length() < len){
            return compress.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "ABAAAAA";
        System.out.println(StringCompress(str));
    }
}
