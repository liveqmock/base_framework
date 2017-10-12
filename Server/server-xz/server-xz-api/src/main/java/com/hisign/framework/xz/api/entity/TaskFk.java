
package com.hisign.framework.xz.api.entity;

import java.io.Serializable;
import java.util.*;
import com.hisign.bfun.bannotation.*;

/**
 * 《任务反馈》 实体
 * @author xhh
 *
 */
@Table(value="t_task_fk")
public class TaskFk implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@PK(value="ID")
	private String id; //任务反馈ID
	
	@Column(value="TASKID")
	private String taskid; //任务ID
	
	@Column(value="FKZJ_TASKID")
	private String fkzjTaskid; //反馈追加任务ID
	
	@Column(value="FKXS")
	private String fkxs; //反馈线索
	
	@Column(value="FKR")
	private String fkr; //反馈人
	
	@Column(value="FK_TIME")
	private Date fkTime; //反馈时间
	
	@Column(value="BZ")
	private String bz; //备注
	
	@Column(value="CREATOR")
	private String creator; //创建人
	
	@Column(value="CREATETIME")
	private Date createtime; //创建时间
	
	@Column(value="DEPARMENTCODE")
	private String deparmentcode; //创建人单位
	
	@Column(value="LASTUPDATETIME")
	private Date lastupdatetime; //修改时间
	
	@Column(value="DELETEFLAG")
	private String deleteflag; //删除标识
	
    
	/**
	 *默认空构造函数
	 */
	public TaskFk() {
		super();
	}
	 
	/**
	 * @return ID 任务反馈ID
	 */
	public String getId(){
		return this.id;
	}
	/**
	 * @param ID 任务反馈ID
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * @return TASKID 任务ID
	 */
	public String getTaskid(){
		return this.taskid;
	}
	/**
	 * @param TASKID 任务ID
	 */
	public void setTaskid(String taskid){
		this.taskid = taskid;
	}
	/**
	 * @return FKZJ_TASKID 反馈追加任务ID
	 */
	public String getFkzjTaskid(){
		return this.fkzjTaskid;
	}
	/**
	 * @param FKZJ_TASKID 反馈追加任务ID
	 */
	public void setFkzjTaskid(String fkzjTaskid){
		this.fkzjTaskid = fkzjTaskid;
	}
	/**
	 * @return FKXS 反馈线索
	 */
	public String getFkxs(){
		return this.fkxs;
	}
	/**
	 * @param FKXS 反馈线索
	 */
	public void setFkxs(String fkxs){
		this.fkxs = fkxs;
	}
	/**
	 * @return FKR 反馈人
	 */
	public String getFkr(){
		return this.fkr;
	}
	/**
	 * @param FKR 反馈人
	 */
	public void setFkr(String fkr){
		this.fkr = fkr;
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
	 * @return BZ 备注
	 */
	public String getBz(){
		return this.bz;
	}
	/**
	 * @param BZ 备注
	 */
	public void setBz(String bz){
		this.bz = bz;
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
	
	public static String getTbName() {
		return "t_task_fk";
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("TaskFk [")
		.append("id=").append(this.getId())
		.append(",taskid=").append(this.getTaskid())
		.append(",fkzjTaskid=").append(this.getFkzjTaskid())
		.append(",fkxs=").append(this.getFkxs())
		.append(",fkr=").append(this.getFkr())
		.append(",fkTime=").append(this.getFkTime())
		.append(",bz=").append(this.getBz())
		.append(",creator=").append(this.getCreator())
		.append(",createtime=").append(this.getCreatetime())
		.append(",deparmentcode=").append(this.getDeparmentcode())
		.append(",lastupdatetime=").append(this.getLastupdatetime())
		.append(",deleteflag=").append(this.getDeleteflag())
		.append("]");
		return builder.toString();
	}
	
	public static enum TaskFkEnum{
		id("ID","任务反馈ID"),
		taskid("TASKID","任务ID"),
		fkzjTaskid("FKZJ_TASKID","反馈追加任务ID"),
		fkxs("FKXS","反馈线索"),
		fkr("FKR","反馈人"),
		fkTime("FK_TIME","反馈时间"),
		bz("BZ","备注"),
		creator("CREATOR","创建人"),
		createtime("CREATETIME","创建时间"),
		deparmentcode("DEPARMENTCODE","创建人单位"),
		lastupdatetime("LASTUPDATETIME","修改时间"),
		deleteflag("DELETEFLAG","删除标识");
		
		private String fieldName;
		private String remark;
		
		TaskFkEnum(String fieldName,String remark){
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