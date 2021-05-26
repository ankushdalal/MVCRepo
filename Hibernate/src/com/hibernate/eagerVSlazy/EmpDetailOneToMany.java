package com.hibernate.eagerVSlazy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpDetailOneToMany {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class).addAnnotatedClass(SalaryGrade.class).buildSessionFactory();

		Session session = sf.getCurrentSession();

		try {

			session.beginTransaction();
			int deptno = 20;

			List<Employee> query = session.createQuery("from Employee " + "where deptno=" + deptno, Employee.class)
					.getResultList();

			// ((Query<Employee>) query).setParameter("deptno", deptno);

			// Employee emp = query.getSingleResult();
			System.out.println(query);
			// commit
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {

			session.close();
			sf.close();
		}

	}

}
