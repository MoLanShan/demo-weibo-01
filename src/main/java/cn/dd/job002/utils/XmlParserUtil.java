package cn.dd.job002.utils;

import java.awt.print.Book;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlParserUtil {
	private static ArrayList<Book> bookList = new ArrayList<Book>();

	public static void printXML(String xmlPath) {
		// 解析books.xml文件
		// 创建SAXReader的对象reader
		SAXReader reader = new SAXReader();
		try {
			// 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
			Document document = reader.read(new File(xmlPath));
			// 通过document对象获取根节点bookstore
			Element bookStore = document.getRootElement();
			// 通过element对象的elementIterator方法获取迭代器
			Iterator it = bookStore.elementIterator();
			// 遍历迭代器，获取根节点中的信息（书籍）
			while (it.hasNext()) {
				Element book = (Element) it.next();
				System.out.println("节点名：" + book.getName() + "--节点值："
						+ book.getStringValue());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static Element getXmlRootElement(File xmlFile) {
		// 解析books.xml文件
		// 创建SAXReader的对象reader
		SAXReader reader = new SAXReader();
		try {
			// 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
			Document document = reader.read(xmlFile);
			// 通过document对象获取根节点bookstore
			Element bookStore = document.getRootElement();
			return bookStore;
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Element getXmlRootElement(String xmlContent, boolean isFilter) {
		SAXReader reader = new SAXReader();
		try {
			if (isFilter) {
				xmlContent = xmlContent.replace("&", "&amp;")
						.replace("'", "&apos;").replace("\"", "&quot;");
			}
			StringReader stringReader = new StringReader(xmlContent);
			Document document = reader.read(stringReader);
			// 通过document对象获取根节点bookstore
			Element rootElement = document.getRootElement();
			return rootElement;
		} catch (DocumentException e) {
			// e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String xmlContent =
		// "<comment><content>回复@雷亚雷:在哈佛或MIT,每天都有各种议题的小型研讨会，凡在中午或晚餐时间举行的，一般都会准备便餐。即使如此，有时也会忽略。 //@雷亚雷:王老师，不吃午饭吗？</content><time>2012-4-6 5:45:52</time><repostsCount>574</repostsCount><commentsCount>290</commentsCount></comment>";
		String xmlContent = "<comment><content>誠意推介加拿大殿堂級音樂大師David Foster 的演唱會DVD《Hit Man Returns: David Foster & Friends》！演唱者包括Earth, Wind & Fire、Michael Bolton及Donna Summer等等，全都是星光熠熠的唱家班！就連只得11歲的America's Got Talent參加者Jackie Evancho的女高音亦非常震撼人心，金曲聽出耳油！</content><time>2011-6-11 0:15:28</time><repostsCount>1</repostsCount><commentsCount>7</commentsCount></comment>";
		xmlContent = xmlContent.replace("&", "&amp;").replace("'", "&apos;")
				.replace("\"", "&quot;");
		Element rootElement = getXmlRootElement(xmlContent, true);
		System.out.println(rootElement.elementText("content"));
	}
}
