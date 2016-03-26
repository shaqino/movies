package it.alfonso.nonceparagone.film.dao;

public interface Queries {

	public static final String SELECT_FILM_BY_TITLE = "SELECT FILM.TITOLO, FILM.REGISTA, FILM.ANNO, FILM.GENERE, FILM.VOTO, FILM.LINK FROM FILM WHERE TITOLO = ?";
	
	
}
