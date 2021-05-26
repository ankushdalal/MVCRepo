package com.hibernate.eagerVSlazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salgrade")
public class SalaryGrade {

	@Id
	@Column(name = "grade")
	private int GRADE;
	@Column(name = "losal")
	private int LOSAL;
	@Column(name = "hisal")
	private int HISAL;

	public SalaryGrade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGRADE() {
		return GRADE;
	}

	public void setGRADE(int gRADE) {
		GRADE = gRADE;
	}

	public int getLOSAL() {
		return LOSAL;
	}

	public void setLOSAL(int lOSAL) {
		LOSAL = lOSAL;
	}

	public int getHISAL() {
		return HISAL;
	}

	public void setHISAL(int hISAL) {
		HISAL = hISAL;
	}

	@Override
	public String toString() {
		return "SalaryGrade [GRADE=" + GRADE + ", LOSAL=" + LOSAL + ", HISAL=" + HISAL + "]";
	}

}
