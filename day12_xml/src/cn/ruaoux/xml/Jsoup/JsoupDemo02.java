package cn.ruaoux.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
/*
    Jsoup对象功能
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        // 2.1 获取student3.xml的path
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取DOM树--Doucument
        /*Document doucument = Jsoup.parse(new File(path), "utf-8");
        System.out.println(doucument);*/
        // 2. parse：（String html）：解析xml或html的字符串
        /*String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<students>\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t<name>zhangsan</name>\n" +
                "\t<age>25</age>\n" +
                "\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name>jack</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>lemale</sex>\n" +
                "\t</student>\n" +
                "</students>";
        Document document = Jsoup.parse(str);
        System.out.println(document);*/

    }
}
