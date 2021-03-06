package com.hisign.xingzhen.xz.api.entity;

import java.io.Serializable;
import java.util.*;
import com.hisign.bfun.bannotation.*;
import com.hisign.xingzhen.common.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 《任务》 实体
 * @author 刘玉兰
 *
 */
@ApiModel(value = "任务")
@Table(value="t_task")
public class Task extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @PK(value="ID")
    @ApiModelProperty(value = "任务ID")
    private String id; //任务ID

    @Column(value="TASK_NO")
    @ApiModelProperty(value = "任务编号")
    private String taskNo; //任务编号

    @Column(value="GROUP_TASK_NO")
    @ApiModelProperty(value = "专案组任务流水")
    private String groupTaskNo; //专案组任务流水

    @Column(value="TASK_NAME")
    @ApiModelProperty(value = "任务名称")
    private String taskName; //任务名称

    @Column(value="TASK_CONTENT")
    @ApiModelProperty(value = "任务内容")
    private String taskContent; //任务内容

    @Column(value="GROUPID")
    @ApiModelProperty(value = "专案组ID")
    private String groupid; //专案组ID

    @Column(value="PGROUPID")
    @ApiModelProperty(value = "父专案组ID")
    private String pgroupid; //父专案组ID

    @Column(value="BCRWID")
    @ApiModelProperty(value = "补充任务ID")
    private String bcrwid; //补充任务ID

    @Column(value="FKID")
    @ApiModelProperty(value = "追加父反馈ID")
    private String fkid; //追加父反馈ID

    @Column(value="YJRWID")
    @ApiModelProperty(value = "移交父任务ID")
    private String yjrwid; //移交父任务ID

    @Column(value="FQR_LXFS")
    @ApiModelProperty(value = "发起人联系方式")
    private String fqrLxfs; //发起人联系方式

    @Column(value="FQR")
    @ApiModelProperty(value = "发起人")
    private String fqr; //发起人

    @Column(value="FQRNAME")
    @ApiModelProperty(value = "发起人姓名")
    private String fqrname; //发起人姓名

    @Column(value="FQR_DEPT_CODE")
    @ApiModelProperty(value = "发起人单位代码")
    private String fqrDeptCode; //发起人单位代码

    @Column(value="FQR_DEPT_NAME")
    @ApiModelProperty(value = "发起人单位名称")
    private String fqrDeptName; //发起人单位名称

    @Column(value="JSR_LXFS")
    @ApiModelProperty(value = "接收联系方式")
    private String jsrLxfs; //接收联系方式

    @Column(value="JSR")
    @ApiModelProperty(value = "接收人")
    private String jsr; //接收人

    @Column(value="JSRNAME")
    @ApiModelProperty(value = "接收人姓名")
    private String jsrname; //接收人姓名

    @Column(value="FQ_TIME")
    @ApiModelProperty(value = "发起时间")
    private Date fqTime; //发起时间

    @Column(value="FKJZ_TIME")
    @ApiModelProperty(value = "反馈截止时间")
    private Date fkjzTime; //反馈截止时间

    @Column(value="FKZT")
    @ApiModelProperty(value = "反馈状态")
    private String fkzt; //反馈状态

    @Column(value="FK_TIME")
    @ApiModelProperty(value = "反馈时间")
    private Date fkTime; //反馈时间

    @Column(value="CBZT")
    @ApiModelProperty(value = "催办状态")
    private String cbzt; //催办状态

    @Column(value="QSZT")
    @ApiModelProperty(value = "签收状态")
    private String qszt; //签收状态

    @Column(value="QS_TIME")
    @ApiModelProperty(value = "签收时间")
    private Date qsTime; //签收时间

    @Column(value="YJZT")
    @ApiModelProperty(value = "移交状态")
    private String yjzt; //移交状态

    @Column(value="YJ_TIME")
    @ApiModelProperty(value = "移交时间")
    private Date yjTime; //移交时间

    @Column(value="CREATOR")
    @ApiModelProperty(value = "创建人")
    private String creator; //创建人

    @Column(value="CREATENAME")
    @ApiModelProperty(value = "创建人姓名")
    private String createname; //创建人姓名

    @Column(value="CREATETIME")
    @ApiModelProperty(value = "创建时间")
    private Date createtime; //创建时间

    @Column(value="DEPARMENTCODE")
    @ApiModelProperty(value = "创建人单位")
    private String deparmentcode; //创建人单位

    @Column(value="LASTUPDATETIME")
    @ApiModelProperty(value = "修改时间")
    private Date lastupdatetime; //修改时间

    @Column(value="DELETEFLAG")
    @ApiModelProperty(value = "删除标识")
    private String deleteflag; //删除标识

    //-------------------------------------- 接受字段
    @ApiModelProperty(value = "接受字段-超期状态 1表示超期")
    private String  overdue;//1表示超期

    @ApiModelProperty(value = "接受字段-任务类型 1表示本人接收，2表示本人下发")
    private String taskType;//1表示本人接收，2表示本人下发

    @ApiModelProperty(value = "反馈开始时间")
    private Date fkjzstartTime;

    @ApiModelProperty(value = "反馈结束时间")
    private Date fkjzendTime;

    @ApiModelProperty(value = "反馈确认状态")
    private String fkqrzt;

    /**
     *默认空构造函数
     */
    public Task() {
        super();
    }

    /**
     * @return ID 任务ID
     */
    public String getId(){
        return this.id;
    }
    /**
     * @param ID 任务ID
     */
    public void setId(String id){
        this.id = id;
    }
    /**
     * @return TASK_NO 任务编号
     */
    public String getTaskNo(){
        return this.taskNo;
    }
    /**
     * @param TASK_NO 任务编号
     */
    public void setTaskNo(String taskNo){
        this.taskNo = taskNo;
    }
    /**
     * @return GROUP_TASK_NO 专案组任务流水
     */
    public String getGroupTaskNo(){
        return this.groupTaskNo;
    }
    /**
     * @param GROUP_TASK_NO 专案组任务流水
     */
    public void setGroupTaskNo(String groupTaskNo){
        this.groupTaskNo = groupTaskNo;
    }
    /**
     * @return TASK_NAME 任务名称
     */
    public String getTaskName(){
        return this.taskName;
    }
    /**
     * @param TASK_NAME 任务名称
     */
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    /**
     * @return TASK_CONTENT 任务内容
     */
    public String getTaskContent(){
        return this.taskContent;
    }
    /**
     * @param TASK_CONTENT 任务内容
     */
    public void setTaskContent(String taskContent){
        this.taskContent = taskContent;
    }
    /**
     * @return GROUPID 专案组ID
     */
    public String getGroupid(){
        return this.groupid;
    }
    /**
     * @param GROUPID 专案组ID
     */
    public void setGroupid(String groupid){
        this.groupid = groupid;
    }
    /**
     * @return PGROUPID 父专案组ID
     */
    public String getPgroupid(){
        return this.pgroupid;
    }
    /**
     * @param PGROUPID 父专案组ID
     */
    public void setPgroupid(String pgroupid){
        this.pgroupid = pgroupid;
    }
    /**
     * @return BCRWID 补充任务ID
     */
    public String getBcrwid(){
        return this.bcrwid;
    }
    /**
     * @param BCRWID 补充任务ID
     */
    public void setBcrwid(String bcrwid){
        this.bcrwid = bcrwid;
    }
    /**
     * @return FKID 追加父反馈ID
     */
    public String getFkid(){
        return this.fkid;
    }
    /**
     * @param FKID 追加父反馈ID
     */
    public void setFkid(String fkid){
        this.fkid = fkid;
    }
    /**
     * @return YJRWID 移交父任务ID
     */
    public String getYjrwid(){
        return this.yjrwid;
    }
    /**
     * @param YJRWID 移交父任务ID
     */
    public void setYjrwid(String yjrwid){
        this.yjrwid = yjrwid;
    }
    /**
     * @return FQR_LXFS 发起人联系方式
     */
    public String getFqrLxfs(){
        return this.fqrLxfs;
    }
    /**
     * @param FQR_LXFS 发起人联系方式
     */
    public void setFqrLxfs(String fqrLxfs){
        this.fqrLxfs = fqrLxfs;
    }
    /**
     * @return FQR 发起人
     */
    public String getFqr(){
        return this.fqr;
    }
    /**
     * @param FQR 发起人
     */
    public void setFqr(String fqr){
        this.fqr = fqr;
    }
    /**
     * @return FQRNAME 发起人姓名
     */
    public String getFqrname(){
        return this.fqrname;
    }
    /**
     * @param FQRNAME 发起人姓名
     */
    public void setFqrname(String fqrname){
        this.fqrname = fqrname;
    }
    /**
     * @return FQR_DEPT_CODE 发起人单位代码
     */
    public String getFqrDeptCode(){
        return this.fqrDeptCode;
    }
    /**
     * @param FQR_DEPT_CODE 发起人单位代码
     */
    public void setFqrDeptCode(String fqrDeptCode){
        this.fqrDeptCode = fqrDeptCode;
    }
    /**
     * @return FQR_DEPT_NAME 发起人单位名称
     */
    public String getFqrDeptName(){
        return this.fqrDeptName;
    }
    /**
     * @param FQR_DEPT_NAME 发起人单位名称
     */
    public void setFqrDeptName(String fqrDeptName){
        this.fqrDeptName = fqrDeptName;
    }
    /**
     * @return JSR_LXFS 接收联系方式
     */
    public String getJsrLxfs(){
        return this.jsrLxfs;
    }
    /**
     * @param JSR_LXFS 接收联系方式
     */
    public void setJsrLxfs(String jsrLxfs){
        this.jsrLxfs = jsrLxfs;
    }
    /**
     * @return JSR 接收人
     */
    public String getJsr(){
        return this.jsr;
    }
    /**
     * @param JSR 接收人
     */
    public void setJsr(String jsr){
        this.jsr = jsr;
    }
    /**
     * @return JSRNAME 接收人姓名
     */
    public String getJsrname(){
        return this.jsrname;
    }
    /**
     * @param JSRNAME 接收人姓名
     */
    public void setJsrname(String jsrname){
        this.jsrname = jsrname;
    }
    /**
     * @return FQ_TIME 发起时间
     */
    public Date getFqTime(){
        return this.fqTime;
    }
    /**
     * @param FQ_TIME 发起时间
     */
    public void setFqTime(Date fqTime){
        this.fqTime = fqTime;
    }
    /**
     * @return FKJZ_TIME 反馈截止时间
     */
    public Date getFkjzTime(){
        return this.fkjzTime;
    }
    /**
     * @param FKJZ_TIME 反馈截止时间
     */
    public void setFkjzTime(Date fkjzTime){
        this.fkjzTime = fkjzTime;
    }
    /**
     * @return FKZT 反馈状态
     */
    public String getFkzt(){
        return this.fkzt;
    }
    /**
     * @param FKZT 反馈状态
     */
    public void setFkzt(String fkzt){
        this.fkzt = fkzt;
    }
    /**
     * @return FK_TIME 反馈时间
     */
    public Date getFkTime(){
        return this.fkTime;
    }
    /**
     * @param FK_TIME 反馈时间
     */
    public void setFkTime(Date fkTime){
        this.fkTime = fkTime;
    }
    /**
     * @return CBZT 催办状态
     */
    public String getCbzt(){
        return this.cbzt;
    }
    /**
     * @param CBZT 催办状态
     */
    public void setCbzt(String cbzt){
        this.cbzt = cbzt;
    }
    /**
     * @return QSZT 签收状态
     */
    public String getQszt(){
        return this.qszt;
    }
    /**
     * @param QSZT 签收状态
     */
    public void setQszt(String qszt){
        this.qszt = qszt;
    }
    /**
     * @return QS_TIME 签收时间
     */
    public Date getQsTime(){
        return this.qsTime;
    }
    /**
     * @param QS_TIME 签收时间
     */
    public void setQsTime(Date qsTime){
        this.qsTime = qsTime;
    }
    /**
     * @return YJZT 移交状态
     */
    public String getYjzt(){
        return this.yjzt;
    }
    /**
     * @param YJZT 移交状态
     */
    public void setYjzt(String yjzt){
        this.yjzt = yjzt;
    }
    /**
     * @return YJ_TIME 移交时间
     */
    public Date getYjTime(){
        return this.yjTime;
    }
    /**
     * @param YJ_TIME 移交时间
     */
    public void setYjTime(Date yjTime){
        this.yjTime = yjTime;
    }
    /**
     * @return CREATOR 创建人
     */
    public String getCreator(){
        return this.creator;
    }
    /**
     * @param CREATOR 创建人
     */
    public void setCreator(String creator){
        this.creator = creator;
    }
    /**
     * @return CREATENAME 创建人姓名
     */
    public String getCreatename(){
        return this.createname;
    }
    /**
     * @param CREATENAME 创建人姓名
     */
    public void setCreatename(String createname){
        this.createname = createname;
    }
    /**
     * @return CREATETIME 创建时间
     */
    public Date getCreatetime(){
        return this.createtime;
    }
    /**
     * @param CREATETIME 创建时间
     */
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }
    /**
     * @return DEPARMENTCODE 创建人单位
     */
    public String getDeparmentcode(){
        return this.deparmentcode;
    }
    /**
     * @param DEPARMENTCODE 创建人单位
     */
    public void setDeparmentcode(String deparmentcode){
        this.deparmentcode = deparmentcode;
    }
    /**
     * @return LASTUPDATETIME 修改时间
     */
    public Date getLastupdatetime(){
        return this.lastupdatetime;
    }
    /**
     * @param LASTUPDATETIME 修改时间
     */
    public void setLastupdatetime(Date lastupdatetime){
        this.lastupdatetime = lastupdatetime;
    }
    /**
     * @return DELETEFLAG 删除标识
     */
    public String getDeleteflag(){
        return this.deleteflag;
    }
    /**
     * @param DELETEFLAG 删除标识
     */
    public void setDeleteflag(String deleteflag){
        this.deleteflag = deleteflag;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Date getFkjzstartTime() {
        return fkjzstartTime;
    }

    public void setFkjzstartTime(Date fkjzstartTime) {
        this.fkjzstartTime = fkjzstartTime;
    }

    public Date getFkjzendTime() {
        return fkjzendTime;
    }

    public void setFkjzendTime(Date fkjzendTime) {
        this.fkjzendTime = fkjzendTime;
    }

    public String getFkqrzt() {
        return fkqrzt;
    }

    public void setFkqrzt(String fkqrzt) {
        this.fkqrzt = fkqrzt;
    }

    public static String getTbName() {
        return "t_task";
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Task [")
                .append("id=").append(this.getId())
                .append(",taskNo=").append(this.getTaskNo())
                .append(",groupTaskNo=").append(this.getGroupTaskNo())
                .append(",taskName=").append(this.getTaskName())
                .append(",taskContent=").append(this.getTaskContent())
                .append(",groupid=").append(this.getGroupid())
                .append(",pgroupid=").append(this.getPgroupid())
                .append(",bcrwid=").append(this.getBcrwid())
                .append(",fkid=").append(this.getFkid())
                .append(",yjrwid=").append(this.getYjrwid())
                .append(",fqrLxfs=").append(this.getFqrLxfs())
                .append(",fqr=").append(this.getFqr())
                .append(",fqrname=").append(this.getFqrname())
                .append(",fqrDeptCode=").append(this.getFqrDeptCode())
                .append(",fqrDeptName=").append(this.getFqrDeptName())
                .append(",jsrLxfs=").append(this.getJsrLxfs())
                .append(",jsr=").append(this.getJsr())
                .append(",jsrname=").append(this.getJsrname())
                .append(",fqTime=").append(this.getFqTime())
                .append(",fkjzTime=").append(this.getFkjzTime())
                .append(",fkzt=").append(this.getFkzt())
                .append(",fkTime=").append(this.getFkTime())
                .append(",cbzt=").append(this.getCbzt())
                .append(",qszt=").append(this.getQszt())
                .append(",qsTime=").append(this.getQsTime())
                .append(",yjzt=").append(this.getYjzt())
                .append(",yjTime=").append(this.getYjTime())
                .append(",creator=").append(this.getCreator())
                .append(",createname=").append(this.getCreatename())
                .append(",createtime=").append(this.getCreatetime())
                .append(",deparmentcode=").append(this.getDeparmentcode())
                .append(",lastupdatetime=").append(this.getLastupdatetime())
                .append(",deleteflag=").append(this.getDeleteflag())
                .append("]");
        return builder.toString();
    }

    public static enum TaskEnum{
        id("ID","任务ID"),
        taskNo("TASK_NO","任务编号"),
        groupTaskNo("GROUP_TASK_NO","专案组任务流水"),
        taskName("TASK_NAME","任务名称"),
        taskContent("TASK_CONTENT","任务内容"),
        groupid("GROUPID","专案组ID"),
        pgroupid("PGROUPID","父专案组ID"),
        bcrwid("BCRWID","补充任务ID"),
        fkid("FKID","追加父反馈ID"),
        yjrwid("YJRWID","移交父任务ID"),
        fqrLxfs("FQR_LXFS","发起人联系方式"),
        fqr("FQR","发起人"),
        fqrname("FQRNAME","发起人姓名"),
        fqrDeptCode("FQR_DEPT_CODE","发起人单位代码"),
        fqrDeptName("FQR_DEPT_NAME","发起人单位名称"),
        jsrLxfs("JSR_LXFS","接收联系方式"),
        jsr("JSR","接收人"),
        jsrname("JSRNAME","接收人姓名"),
        fqTime("FQ_TIME","发起时间"),
        fkjzTime("FKJZ_TIME","反馈截止时间"),
        fkzt("FKZT","反馈状态"),
        fkTime("FK_TIME","反馈时间"),
        cbzt("CBZT","催办状态"),
        qszt("QSZT","签收状态"),
        qsTime("QS_TIME","签收时间"),
        yjzt("YJZT","移交状态"),
        yjTime("YJ_TIME","移交时间"),
        creator("CREATOR","创建人"),
        createname("CREATENAME","创建人姓名"),
        createtime("CREATETIME","创建时间"),
        deparmentcode("DEPARMENTCODE","创建人单位"),
        lastupdatetime("LASTUPDATETIME","修改时间"),
        deleteflag("DELETEFLAG","删除标识");

        private String fieldName;
        private String remark;

        TaskEnum(String fieldName,String remark){
            this.fieldName = fieldName;
            this.remark = remark;
        }

        public String get(){
            return this.fieldName;
        }

        public String getRemark(){
            return this.remark;
        }
    }
}