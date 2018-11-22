package cn.dd.job002.controler;

import cn.dd.job002.manager.DataLoadManager;

public class SystemControler {
	public static void main(String[] args) throws Exception {
		if(args==null || args.length!=1){
			System.out.println("usage: 至少需要输入一个源数据目录!");
		}
		String inputDir = args[0];
		String inputCharset = "gbk";

		String output4User = "user_pojo_list.txt";
		String output4Content = "content_pojo_list.txt";
		String outputCharset = "utf-8";

		DataLoadManager.startProcess(inputDir, inputCharset, output4User, output4Content,
				outputCharset);
		
		System.out.println("done!");
	}
}
