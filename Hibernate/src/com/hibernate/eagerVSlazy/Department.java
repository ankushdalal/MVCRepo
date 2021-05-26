package com.hibernate.eagerVSlazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {

	@Id
	@Column(name = "deptno")
	private int DEPTNO;
	@Column(name = "dname")
	private String DNAME;
	@Column(name = "loc")
	private String LOC;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public String getDNAME() {
		return DNAME;
	}
	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}
	public String getLOC() {
		return LOC;
	}
	public void setLOC(String lOC) {
		LOC = lOC;
	}
	@Override
	public String toString() {
		return "Department [DEPTNO=" + DEPTNO + ", DNAME=" + DNAME + ", LOC=" + LOC + "]";
	}
	
	

}
