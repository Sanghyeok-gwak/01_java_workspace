package com.sh.model.vo;

import java.util.ArrayList;
import java.util.List;

public class CafeShop {
	private List<Cafe> cf = new ArrayList<>();
	private List<Bread> bd= new ArrayList<>();
	private String userid;
	private String userpwd;
	private String cafetitle;
	private String cafeaddres;
	public CafeShop(List<Cafe> cf, List<Bread> bd, String userid, String userpwd, String cafetitle, String cafeaddres) {
		super();
		this.cf = cf;
		this.bd = bd;
		this.userid = userid;
		this.userpwd = userpwd;
		this.cafetitle = cafetitle;
		this.cafeaddres = cafeaddres;
	}
	@Override
	public String toString() {
		return "CafeShop [cf=" + cf + ", bd=" + bd + ", userid=" + userid + ", userpwd=" + userpwd + ", cafetitle="
				+ cafetitle + ", cafeaddres=" + cafeaddres + "]";
	}
	public List<Cafe> getCf() {
		return cf;
	}
	public void setCf(List<Cafe> cf) {
		this.cf = cf;
	}
	public List<Bread> getBd() {
		return bd;
	}
	public void setBd(List<Bread> bd) {
		this.bd = bd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getCafetitle() {
		return cafetitle;
	}
	public void setCafetitle(String cafetitle) {
		this.cafetitle = cafetitle;
	}
	public String getCafeaddres() {
		return cafeaddres;
	}
	public void setCafeaddres(String cafeaddres) {
		this.cafeaddres = cafeaddres;
	}
	
	
	
	
	
}
