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
public class JsoupDemo05 {
    public static void main(String[] args) throws IOException {
        // 2.1 获取student3.xml的path
        String path = JsoupDemo05.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取DOM树--Doucument
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 3. 查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("------------");
        // 获取student标签并且number属性值为heima_0001的age子标签
        // 4.1 获取student标签并且number属性值为heima_0001
        Elements age = document.select("student[number='heima_0001'] age");
        System.out.println(age);

    }
}
