package com.venky;

import java.util.Comparator;

public class MyComparator implements Comparable {
	public MyComparator(int stdid, String stdName, double stdfee, int stdage) {
		super();
		this.stdid = stdid;
		this.stdName = stdName;
		this.stdfee = stdfee;
		this.stdage = stdage;
	}
	@Override
	public String toString() {
		return "MyComparator [stdid=" + stdid + ", stdName=" + stdName + ", stdfee=" + stdfee + ", stdage=" + stdage
				+ "]";
	}

	private int stdid;
	private String stdName;
	private double stdfee;
	private int stdage;

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public double getStdfee() {
		return stdfee;
	}

	public void setStdfee(double stdfee) {
		this.stdfee = stdfee;
	}

	public int getStdage() {
		return stdage;
	}

	public void setStdage(int stdage) {
		this.stdage = stdage;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
