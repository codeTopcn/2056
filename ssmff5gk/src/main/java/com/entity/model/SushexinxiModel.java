package com.entity.model;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宿舍信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 15:40:28
 */
public class SushexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍类型
	 */
	
	private String susheleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 楼栋
	 */
	
	private String loudong;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 可住人数
	 */
	
	private Integer kezhurenshu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：宿舍类型
	 */
	 
	public void setSusheleixing(String susheleixing) {
		this.susheleixing = susheleixing;
	}
	
	/**
	 * 获取：宿舍类型
	 */
	public String getSusheleixing() {
		return susheleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：楼栋
	 */
	 
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	
	/**
	 * 获取：楼栋
	 */
	public String getLoudong() {
		return loudong;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：可住人数
	 */
	 
	public void setKezhurenshu(Integer kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	
	/**
	 * 获取：可住人数
	 */
	public Integer getKezhurenshu() {
		return kezhurenshu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
