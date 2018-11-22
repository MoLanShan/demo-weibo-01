package cn.dd.job002.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.dd.job002.utils.DateUtil;
import cn.dd.job002.utils.StringUtil;

public class WbContentInfoPojo {
	private long uid;
	private String content;
	private Date time;
	private int repostsCount;
	private int commentsCount;
	
	public String toString4FileOutput() {
		List<Object> fieldList = new ArrayList<Object>();
		fieldList.add(uid);
		fieldList.add(content);
		fieldList.add(DateUtil.formatDate(time));
		fieldList.add(repostsCount);
		fieldList.add(commentsCount);
		return StringUtil.join(fieldList, "\001");
	}
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getRepostsCount() {
		return repostsCount;
	}
	public void setRepostsCount(int repostsCount) {
		this.repostsCount = repostsCount;
	}
	public int getCommentsCount() {
		return commentsCount;
	}
	public void setCommentsCount(int commentsCount) {
		this.commentsCount = commentsCount;
	}
}
