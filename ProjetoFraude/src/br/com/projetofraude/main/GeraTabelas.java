package br.com.projetofraude.main;

import br.com.projetofraude.util.HibernateUtil;

public class GeraTabelas {
	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
}
