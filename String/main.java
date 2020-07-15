package String;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("HEY THERE");
        sb.replace(0,3,"Hello");
        System.out.println(sb);
        System.out.println(sb.substring(0,5));
    }
}