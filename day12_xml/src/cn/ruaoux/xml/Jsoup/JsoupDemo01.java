package cn.ruaoux.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        // 2. 获取Document对象.根据xml文档获取
        // 2.1 获取student3.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取DOM树--Doucument
        Document doucument = Jsoup.parse(new File(path), "utf-8");
        // 3. 获取元素对象 Element
        Elements elements = doucument.getElementsByTag("name");
        System.out.println(elements.size());
        // 3.1 获取第一个name的element对象
        Element element = elements.get(0);
        // 3.2 获取数据
        System.out.println(element);
        String name = element.text();
        System.out.println(name);
    }
}
