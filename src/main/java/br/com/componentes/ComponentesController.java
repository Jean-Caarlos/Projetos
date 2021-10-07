package br.com.componentes;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ComponentesController {
	private List<Integer> listaSoma = new ArrayList<Integer>(); 
	private List<Integer> listaSubtrair = new ArrayList<Integer>();
	private List<Integer> listaMultiplicar = new ArrayList<Integer>();
	private List<Integer> listaDividir = new ArrayList<Integer>();
	private Integer resultado;
	private Integer resultado2;
	private Integer resultado3;
	private Integer resultado4;

	private Integer numero1;
	private Integer numero2;
    
	public void somar() {
		if(numero1 != null && numero2 != null) {
			resultado = numero1 + numero2;
			listaSoma.add(resultado);
		} else {
			resultado = 0;
		}
	}

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	public Integer getResultado2() {
		return resultado2;
	}

	public void setResultado2(Integer resultado2) {
		this.resultado2 = resultado2;
	}

	public Integer getResultado3() {
		return resultado3;
	}

	public void setResultado3(Integer resultado3) {
		this.resultado3 = resultado3;
	}

	public Integer getResultado4() {
		return resultado4;
	}

	public void setResultado4(Integer resultado4) {
		this.resultado4 = resultado4;
	}

	public void subtrair() {
		if (numero1 != null && numero2 != null) {
			resultado2 = numero1 - numero2;
			listaSubtrair.add(resultado2);
		} else {
			resultado2 = 0;
		}
	}

	public void multiplicar() {
		if (numero1 != null && numero2 != null) {
			resultado3 = numero1 * numero2;
			listaMultiplicar.add(resultado3);
		} else {
			resultado3 = 0;
		}
	}

	public void dividir() {
		if (numero1 != null && numero2 != null) {
			resultado4 = numero1 / numero2;
			listaDividir.add(resultado4);
		} else {
			resultado4 = 0;
		}
	}

	public List<Integer> getListaSoma() {
		return listaSoma;
	}

	public void setListaSoma(List<Integer> listaSoma) {
		this.listaSoma = listaSoma;
	}

	public List<Integer> getListaSubtrair() {
		return listaSubtrair;
	}

	public void setListaSubtrair(List<Integer> listaSubtrair) {
		this.listaSubtrair = listaSubtrair;
	}

	public List<Integer> getListaMultiplicar() {
		return listaMultiplicar;
	}

	public void setListaMultiplicar(List<Integer> listaMultiplicar) {
		this.listaMultiplicar = listaMultiplicar;
	}

	public List<Integer> getListaDividir() {
		return listaDividir;
	}

	public void setListaDividir(List<Integer> listaDividir) {
		this.listaDividir = listaDividir;
	}

	
}
