package com.basket.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userId
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.passwd
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String passwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nickname
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.signature
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String signature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.introduction
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.country
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.province
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.city
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.tag1
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String tag1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.tag2
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String tag2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.isVip
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String isVip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.vipEndDate
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private Date vipEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.isRecommend
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String isRecommend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.recommendTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private Date recommendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.isAdministrator
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String isAdministrator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.createdTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastModified
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private Date lastModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastLoginTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastLoginIp
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private String lastLoginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userId
     *
     * @return the value of user.userId
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userId
     *
     * @param userId the value for user.userId
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.passwd
     *
     * @return the value of user.passwd
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.passwd
     *
     * @param passwd the value for user.passwd
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nickname
     *
     * @return the value of user.nickname
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nickname
     *
     * @param nickname the value for user.nickname
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar
     *
     * @return the value of user.avatar
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar
     *
     * @param avatar the value for user.avatar
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.signature
     *
     * @return the value of user.signature
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.signature
     *
     * @param signature the value for user.signature
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.introduction
     *
     * @return the value of user.introduction
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.introduction
     *
     * @param introduction the value for user.introduction
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gender
     *
     * @param gender the value for user.gender
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.country
     *
     * @return the value of user.country
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.country
     *
     * @param country the value for user.country
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.province
     *
     * @return the value of user.province
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.province
     *
     * @param province the value for user.province
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.city
     *
     * @return the value of user.city
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.city
     *
     * @param city the value for user.city
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.tag1
     *
     * @return the value of user.tag1
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getTag1() {
        return tag1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.tag1
     *
     * @param tag1 the value for user.tag1
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setTag1(String tag1) {
        this.tag1 = tag1 == null ? null : tag1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.tag2
     *
     * @return the value of user.tag2
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getTag2() {
        return tag2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.tag2
     *
     * @param tag2 the value for user.tag2
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setTag2(String tag2) {
        this.tag2 = tag2 == null ? null : tag2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.isVip
     *
     * @return the value of user.isVip
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getIsVip() {
        return isVip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.isVip
     *
     * @param isVip the value for user.isVip
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setIsVip(String isVip) {
        this.isVip = isVip == null ? null : isVip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.vipEndDate
     *
     * @return the value of user.vipEndDate
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public Date getVipEndDate() {
        return vipEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.vipEndDate
     *
     * @param vipEndDate the value for user.vipEndDate
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setVipEndDate(Date vipEndDate) {
        this.vipEndDate = vipEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.isRecommend
     *
     * @return the value of user.isRecommend
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getIsRecommend() {
        return isRecommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.isRecommend
     *
     * @param isRecommend the value for user.isRecommend
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend == null ? null : isRecommend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.recommendTime
     *
     * @return the value of user.recommendTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public Date getRecommendTime() {
        return recommendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.recommendTime
     *
     * @param recommendTime the value for user.recommendTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.isAdministrator
     *
     * @return the value of user.isAdministrator
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getIsAdministrator() {
        return isAdministrator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.isAdministrator
     *
     * @param isAdministrator the value for user.isAdministrator
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setIsAdministrator(String isAdministrator) {
        this.isAdministrator = isAdministrator == null ? null : isAdministrator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.createdTime
     *
     * @return the value of user.createdTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.createdTime
     *
     * @param createdTime the value for user.createdTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastModified
     *
     * @return the value of user.lastModified
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastModified
     *
     * @param lastModified the value for user.lastModified
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastLoginTime
     *
     * @return the value of user.lastLoginTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastLoginTime
     *
     * @param lastLoginTime the value for user.lastLoginTime
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastLoginIp
     *
     * @return the value of user.lastLoginIp
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastLoginIp
     *
     * @param lastLoginIp the value for user.lastLoginIp
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", passwd=").append(passwd);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", signature=").append(signature);
        sb.append(", introduction=").append(introduction);
        sb.append(", gender=").append(gender);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", tag1=").append(tag1);
        sb.append(", tag2=").append(tag2);
        sb.append(", status=").append(status);
        sb.append(", isVip=").append(isVip);
        sb.append(", vipEndDate=").append(vipEndDate);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", recommendTime=").append(recommendTime);
        sb.append(", isAdministrator=").append(isAdministrator);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", lastModified=").append(lastModified);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getTag1() == null ? other.getTag1() == null : this.getTag1().equals(other.getTag1()))
            && (this.getTag2() == null ? other.getTag2() == null : this.getTag2().equals(other.getTag2()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsVip() == null ? other.getIsVip() == null : this.getIsVip().equals(other.getIsVip()))
            && (this.getVipEndDate() == null ? other.getVipEndDate() == null : this.getVipEndDate().equals(other.getVipEndDate()))
            && (this.getIsRecommend() == null ? other.getIsRecommend() == null : this.getIsRecommend().equals(other.getIsRecommend()))
            && (this.getRecommendTime() == null ? other.getRecommendTime() == null : this.getRecommendTime().equals(other.getRecommendTime()))
            && (this.getIsAdministrator() == null ? other.getIsAdministrator() == null : this.getIsAdministrator().equals(other.getIsAdministrator()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getLastModified() == null ? other.getLastModified() == null : this.getLastModified().equals(other.getLastModified()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getLastLoginIp() == null ? other.getLastLoginIp() == null : this.getLastLoginIp().equals(other.getLastLoginIp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Jul 12 15:34:34 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getTag1() == null) ? 0 : getTag1().hashCode());
        result = prime * result + ((getTag2() == null) ? 0 : getTag2().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsVip() == null) ? 0 : getIsVip().hashCode());
        result = prime * result + ((getVipEndDate() == null) ? 0 : getVipEndDate().hashCode());
        result = prime * result + ((getIsRecommend() == null) ? 0 : getIsRecommend().hashCode());
        result = prime * result + ((getRecommendTime() == null) ? 0 : getRecommendTime().hashCode());
        result = prime * result + ((getIsAdministrator() == null) ? 0 : getIsAdministrator().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
        return result;
    }
}