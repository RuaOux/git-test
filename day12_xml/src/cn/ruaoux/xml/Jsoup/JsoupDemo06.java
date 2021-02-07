package cn.ruaoux.xml.Jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
    Xpth查询
 */
public class JsoupDemo06 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        // 2.1 获取student3.xml的path
        String path = JsoupDemo06.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档，加载文档进内存，获取DOM树--Doucument
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 3.创建 根据document对象，JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        // 4. 结合xpath语法查询
        // 4.1查询所有student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

        System.out.println("---------------");
        // 4.2查询所有student标签下的name标签
        List<JXNode> name = jxDocument.selN("//student/name");
        for (JXNode jxNode : name) {
            System.out.println(jxNode);
        }
        System.out.println("--------------");
        // 查询student标签下带有id属性的name标签
        List<JXNode> name1 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : name1) {
            System.out.println(jxNode);
        }
        System.out.println("---------");
        // 4.4查询student标签下带有id的name标签，并且id属性值为name
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name[@id='name']");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
        }

    }
}
