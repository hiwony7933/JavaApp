package Practice;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import sun.net.www.protocol.http.HttpURLConnection;

public class HaniMainPractice {

	public static void main(String[] args) {

		int cnt = 0;
		try {
			String keyword = URLEncoder.encode("코로나", "utf-8");
			String addr = "http://search.hani.co.kr/Search?command=query&keyword=" + keyword
					+ "&media=news&submedia=&sort=d&period=all&" + "datefrom=2000.01.01&dateto=2020.01.28&pageseq=0";
			URL url = new URL(addr);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(20000);
			con.setUseCaches(false);

			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			String html = sb.toString();
			br.close();
			con.disconnect();

			Document document = Jsoup.parse(html);
			Elements spans = document.select("#contents > div.search-result-section.first-child > div > span");
			String temp = spans.get(0).text();
			String[] ar = temp.split(" ");
			cnt = Integer.parseInt(ar[0]);

		} catch (Exception e) {
			System.out.println("기사 개수 파악 예외" + e.getMessage());
			e.printStackTrace();
		}
		if (cnt <= 0) {
			System.out.println("검색된 기사가 없습니다.");
		}
		ArrayList<String> list = new ArrayList<String>();

		try {
			int pagesu = cnt / 10;
			if (pagesu % 10 != 0) {
				pagesu = pagesu + 1;
			}
			for (int i = 0; i < pagesu; i = i + 1) {
				String keyword = URLEncoder.encode("코로나", "utf-8");
				String addr = "http://search.hani.co.kr/Search?command=query&keyword=" + keyword
						+ "&media=news&submedia=&sort=d&period=all&" + "datefrom=2000.01.01&dateto=2020.01.28&pageseq="
						+ i;
				URL url = new URL(addr);

				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setConnectTimeout(10000);
				con.setUseCaches(false);

				try {
					StringBuilder sb = new StringBuilder();
					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						sb.append(line + "\n");
					}
					String html = sb.toString();
					br.close();
					con.disconnect();

					Document document = Jsoup.parse(html);
					Elements links = document.select(
							"#contents > div.search-result-section.first-child > ul > li.first-child > dl > dt > a");
					for (int j = 0; j < links.size(); j = j + 1) {
						list.add(links.get(j).attr("href"));

					}

				} catch (Exception e) {
					System.out.println("링크수집실패" + e.getMessage());
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.print("링크 수집실패" + e.getMessage());
			e.printStackTrace();
		}

		try {
			for (String addr : list) {
				try {
					URL url = new URL(addr);
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					con.setConnectTimeout(10000);
					con.setUseCaches(false);

					StringBuilder sb = new StringBuilder();
					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						sb.append(line + '\n');

					}
					String html = sb.toString();
					br.close();
					con.disconnect();

					Document document = Jsoup.parse(html);
					Elements articles = document.getElementsByClass("title");

					for (int i = 0; i < articles.size(); i = i + 1) {
						PrintWriter pw = new PrintWriter(new FileOutputStream("./코로나.txt"));
						pw.println(html);
						pw.flush();
						pw.close();
					}
				} catch (Exception e) {
					System.out.println("기사읽기예외" + e.getMessage());
				}
			}
		} catch (Exception e) {
			System.out.println("기사읽기예괴" + e.getMessage());
		}

	}
}
