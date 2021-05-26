package com.hibernate.eagerVSlazy;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@Column(name = "empno")
	private int EMPNO;
	@Column(name = "ename")
	private String ENAME;
	@Column(name = "job")
	private String JOB;
	@Column(name = "mgr")
	private String MGR;
	@Column(name = "hiredate")
	private Date HIREDATE;
	@Column(name = "sal")
	private String SAL;
	@Column(name = "comm")
	private String COMM;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptno")
	private Department DEPTNO;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEMPNO() {
		return EMPNO;
	}

	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public String getJOB() {
		return JOB;
	}

	public void setJOB(String jOB) {
		JOB = jOB;
	}

	public String getMGR() {
		return MGR;
	}

	public void setMGR(String mGR) {
		MGR = mGR;
	}

	public Date getHIREDATE() {
		return HIREDATE;
	}

	public void setHIREDATE(Date hIREDATE) {
		HIREDATE = hIREDATE;
	}

	public String getSAL() {
		return SAL;
	}

	public void setSAL(String sAL) {
		SAL = sAL;
	}

	public String getCOMM() {
		return COMM;
	}

	public void setCOMM(String cOMM) {
		COMM = cOMM;
	}

	public Department getDEPTNO() {
		return DEPTNO;
	}

	public void setDEPTNO(Department dEPTNO) {
		DEPTNO = dEPTNO;
	}

	@Override
	public String toString() {
		return "Employee [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", HIREDATE="
				+ HIREDATE + ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + "]";
	}

}
