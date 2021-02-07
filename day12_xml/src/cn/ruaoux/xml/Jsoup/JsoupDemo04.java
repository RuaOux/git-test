package cn.ruaoux.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
    Doucument/Element对象
 */
public class JsoupDemo04 {
    public static void main(String[] args) throws IOException {
        // 2.1 获取student3.xml的path
        String path = JsoupDemo04.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取DOM树--Doucument
        Document document = Jsoup.parse(new File(path), "utf-8");
        /*
		       1. 获取子元素对象
			* getElementsByTag（String tagName）：根据标签名称获取元素对象集合
			* getElementsByAttribute（String key）：根据属性名称获取元素对象集合
			* getElementsByAttributeValue（String key，String value）：根据对应的属性名和属性值获取元素对象
			* getElementsById（String id）：根据id属性名获取唯一的element对象
		       2. 获取属性值：
			* String attr（String key）：根据属性名称获取属性值
		       3. 获取文本内容：
			* String text（）：获取文本
			* String html（）：获取innerHtml
         */
        // 通过document对象获取name标签，获取所有的name标签，
        Elements name = document.getElementsByTag("name");
        System.out.println(name.size());
        System.out.println("-------------");
        // 通过Element对象获取子标签对象
        Element element_student = document.getElementsByTag("student").get(0);
        Elements name1 = element_student.getElementsByTag("name");
        System.out.println(name1.size());
        System.out.println("---------------");
        // 获取student对象的属性值
        String number = element_student.attr("number");
        System.out.println(number);
        // 获取文本内容
        String text = name1.text();
        String html = name1.html();
        System.out.println(text);
        System.out.println(html);
    }
}
