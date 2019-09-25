package 正则表达式;
/*
这是我修改的内容
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegestTest {
    public static void main(String[] args) {
        String str ="成都市(武侯区)(成化区)(高校区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher matcher = p.matcher( str );
        if(matcher.find()){
            System.out.println(matcher.group(0));

        }
    }
}
