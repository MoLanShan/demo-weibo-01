package cn.dd.job002.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.dd.job002.utils.StringUtil;

public class WbUserInfoPojo {
	private long uid;
	private String screenName;
	private String name;
	private int province;
	private int city;
	private String location;
	private String description;
	private String userDomain;
	private String gender;
	private int followersCount;
	private int friendsCount;
	private int statusesCount;
	private int favouritesCount;
	private Date createdAt;
	private boolean verified;
	private String remark;
	private String verifiedReason;

	@Override
	public String toString() {
		return "WbUserInfoPojo [uid=" + uid + ", screenName=" + screenName
				+ ", name=" + name + ", province=" + province + ", city="
				+ city + ", location=" + location + ", description="
				+ description + ", userDomain=" + userDomain + ", gender="
				+ gender + ", followersCount=" + followersCount
				+ ", friendsCount=" + friendsCount + ", statusesCount="
				+ statusesCount + ", favouritesCount=" + favouritesCount
				+ ", createdAt=" + createdAt + ", verified=" + verified
				+ ", remark=" + remark + ", verifiedReason=" + verifiedReason
				+ "]";
	}

	public String toString4FileOutput() {
		List<Object> fieldList = new ArrayList<Object>();
		fieldList.add(uid);
		fieldList.add(getScreenName());
		fieldList.add(province);
		fieldList.add(remark);
//		System.out.println("screenName="+(screenName==null?"null值":"null字符串"));
		return StringUtil.join(fieldList, "\001");
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getScreenName() {
//		if(screenName==null || screenName.equals("null")){
//			screenName="";
//		}
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}

	public int getStatusesCount() {
		return statusesCount;
	}

	public void setStatusesCount(int statusesCount) {
		this.statusesCount = statusesCount;
	}

	public int getFavouritesCount() {
		return favouritesCount;
	}

	public void setFavouritesCount(int favouritesCount) {
		this.favouritesCount = favouritesCount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getVerifiedReason() {
		return verifiedReason;
	}

	public void setVerifiedReason(String verifiedReason) {
		this.verifiedReason = verifiedReason;
	}
}
