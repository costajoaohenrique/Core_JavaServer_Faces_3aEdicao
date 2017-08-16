package com.corejsf;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean // or @Named
@ViewScoped
public class HeaderViewScoped implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static int contInstance= 0;

	@PostConstruct
	public void init() {
		contInstance++;
	}

	public String getTituloHeader() {
		return "Esse é o título do header. - Quantidade de instancias: "+ contInstance;
	}
}
