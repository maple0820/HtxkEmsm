package com.htxk.edusystem.domain;

import com.htxk.ruoyi.common.annotation.Excel;
import com.htxk.ruoyi.common.core.domain.BaseEntity;
import com.htxk.ruoyi.system.domain.SysUser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 教师信息对象 edu_teacher
 *
 * @author maple
 * @date 2020-01-03
 */
public class EduTeacher extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 教师信息ID
     */
    private Long teacherId;

    /**
     * 用户名（老师真实姓名）
     */
    @Excel(name = "用户名", readConverterExp = "老=师真实姓名")
    private String teacherName;

    /**
     * 用户id
     */
    @Excel(name = "用户id")
    private Long sysUserId;

    /**
     * 学历（0.高中1.大专.2.本科3.研究生）
     */
    @Excel(name = "学历", readConverterExp = "0=.高中1.大专.2.本科3.研究生")
    private String education;

    /**
     * 职称（0.一级教师，1.二级教师，2.三级教师）
     */
    @Excel(name = "职称", readConverterExp = "0=.一级教师，1.二级教师，2.三级教师")
    private String academicTitle;

    /**
     * 状态（0.在职 1.离职）
     */
    @Excel(name = "状态", readConverterExp = "0=.在职,1=.离职")
    private String status;

    /**
     * 用户账号信息
     */
    private SysUser sysUser;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("teacherId", getTeacherId())
                .append("teacherName", getTeacherName())
                .append("sysUserId", getSysUserId())
                .append("education", getEducation())
                .append("academicTitle", getAcademicTitle())
                .append("status", getStatus())
                .toString();
    }
}
