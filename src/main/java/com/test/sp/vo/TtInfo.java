package com.test.sp.vo;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

@Component
public class TtInfo {
	
	private Integer tnum;
	private String tname;
	private Integer tage;
	public int getTnum() {
		return tnum;
	}
	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	@Override
	public String toString() {
		return "TtInfo [tnum=" + tnum + ", tname=" + tname + ", tage=" + tage + "]";
	}
	
	
}
