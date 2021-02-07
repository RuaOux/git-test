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
public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {
        // 2.1 获取student3.xml的path
        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取DOM树--Doucument
        Document document = Jsoup.parse(new File(path), "utf-8");
        // 3. 获取元素对象
        // 3.1 获取所有student对象
        Elements student = document.getElementsByTag("student");
        System.out.println(student);
        System.out.println("-------------------");
        // 3.2 获取属性名为id的元素对象
        Element name = document.getElementById("name");
        System.out.println(name);
        System.out.println("----------");
        // 3.3 获取 number属性为heima_0001的元素对象
        Elements element2 = document.getElementsByAttributeValue("number", "heima_0001");
        System.out.println(element2);
        // 

    }
}
