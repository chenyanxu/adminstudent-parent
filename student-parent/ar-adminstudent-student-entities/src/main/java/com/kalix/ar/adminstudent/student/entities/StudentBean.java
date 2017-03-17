package com.kalix.ar.adminstudent.student.entities;

import com.kalix.framework.core.api.persistence.UserEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/3/3.
 */
@Entity
@Table(name = "sys_user_student")
@ApiModel("用户<br>StudentBean")
public class StudentBean extends UserEntity {
    @ApiModelProperty(value="身份证号",position=0,example = "220***************")
    private String identificationCard;
    @ApiModelProperty(value="昵称",position=1,example = "0")
    private String nickname;
    @ApiModelProperty(value="个人说明",position=2,example = "0")
    private String introduction;
    @ApiModelProperty(value="所在地",position=3,example = "吉林省长春市")
    private String address;
    @ApiModelProperty(value="教育经历",position=4,example = "0")
    private String education;
    @ApiModelProperty(value="擅长技能",position=5,example = "0")
    private String skills;

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
