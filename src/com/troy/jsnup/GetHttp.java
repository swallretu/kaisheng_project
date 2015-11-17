package com.troy.jsnup;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetHttp {

	public static void getHtml() throws IOException{
		File input = new File("d:\\input.html");
		Document doc = Jsoup.parse(new URL("http://www.baidu.com/"),20000);
//		Document doc = Jsoup.parse(input, "UTF-8","http://www.baidu.com/");
		
		Elements links = doc.getElementsByTag("a");
		
		for(Element link : links){
			String linkhref = link.attr("href");
			String linktext = link.text();
			System.out.println(linkhref+","+linktext);
		}
	}
	
	public static void main(String[] args) throws IOException{
//		getHtml();
		System.out.println("地段，永远是经商投资最重要的因素。海上五月花【中央大道】位于集美34万方城市综合体旁，是60万平墅区中心唯一的商业街。如此地段，必将成为集美新城的重要商业中心、人流聚集地，升值是必然趋势！现在首付10万即可购买黄金旺铺，最佳时机不容错过！".length());
		System.out.println("随着《爸爸去哪儿2》的热播，亲子游成为时下最热的活动之一。趁难得的暑期时光，带小孩游山玩水，不仅可以增长孩子的知识、见识，更能够增进家长与孩子之间的感情。然而小编认为，亲子不应当仅仅在某个特定的时候子的健康成长，离不开父母每一刻的关爱和陪伴");
		System.out.println("我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我".length());
	}
	
}
