package cn.dd.job002.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IOUtil {
	public static List<String> getTxtContent(String txtFilePath, String charset)
			throws Exception {
		File txtFile = new File(txtFilePath);
		FileInputStream fis = new FileInputStream(txtFile);
		InputStreamReader isr = new InputStreamReader(fis, charset);
		BufferedReader br = new BufferedReader(isr);

		List<String> lineList = new ArrayList<String>();
		String tempLine = null;

		while ((tempLine = br.readLine()) != null) {
			lineList.add(tempLine);
		}
		br.close();
		return lineList;
	}

	public static boolean writeListToFile(List<String> lineList,
			String outputFilePath, String charset) throws Exception {
		File outputFile = new File(outputFilePath);
		FileOutputStream fos = new FileOutputStream(outputFile);
		int lineCounter = 0;
		for (String line : lineList) {
			if (lineCounter > 0) {
				fos.write('\n');
			}
			fos.write(line.getBytes(charset));
			lineCounter++;
		}
		fos.close();
		return true;
	}

	public static boolean writeListToFile(String txtContent,
			String outputFilePath, String charset) throws Exception {
		File outputFile = new File(outputFilePath);
		FileOutputStream fos = new FileOutputStream(outputFile);
		fos.write(txtContent.getBytes(charset));
		fos.close();
		return true;
	}

	public static void main(String[] args) throws Exception {
		// String txtFilePath = "房地产\\user\\2297199692.txt";
		String txtFilePath = "房地产\\content\\1484018951.txt";
		String inputCharset = "gbk";
		String outputCharset = "utf-8";
		String outputFilePath = "newFile.txt";
		List<String> lineList = getTxtContent(txtFilePath, inputCharset);
		for (String tempLine : lineList) {
			System.out.println(tempLine);
		}

		writeListToFile(lineList, outputFilePath, outputCharset);

	}
}
