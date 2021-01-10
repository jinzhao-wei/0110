package Strings;
//将每个单词的首字母变成大写；
public class Main {
    public static void main(String[] args) {
        String str=new String("hello!how old are you?");
        String regex="[\\s|!|.]";//空白符、制表符等等或！或.
        String str1[]=str.split(regex);//将str分割
        //for (int j=0;j<str1.length;j++)
            //System.out.print(str1[j]);
        String str2[]=new String[100];
        for (int i=0;i<str1.length;i++){
            char s=str1[i].charAt(0);//获取str第一位字符
            String First=String.valueOf(s);//将s转为String类型
            String ss=str1[i].substring(1,str1[i].length());//截取除了第一个字符以外的字符
            str2[i]=First.toUpperCase()+ss;//将他们相连
            System.out.print(str2[i]+" ");
        }


    }
}
