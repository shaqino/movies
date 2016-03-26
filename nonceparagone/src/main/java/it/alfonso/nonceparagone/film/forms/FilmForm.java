package it.alfonso.nonceparagone.film.forms;

import org.apache.struts.action.ActionForm;

public class FilmForm extends ActionForm{

	private static final long serialVersionUID = -5889460706584180199L;
	private String titolo;
	private String regista;
	private int annoProduzione;
	private String voto;
	private String genere;
	private String linkRecensione;

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getLinkRecensione() {
		return linkRecensione;
	}

	public void setLinkRecensione(String linkRecensione) {
		this.linkRecensione = linkRecensione;
	}

	@Override
	public String toString() {
		return "FilmForm [" +
				"titolo=" + titolo + 
				", regista=" + regista + 
				", annoProduzione=" + annoProduzione + 
				", voto=" + voto + 
				", genere=" + genere + 
				", linkRecensione=" + linkRecensione + 
				"]";
	}

}
