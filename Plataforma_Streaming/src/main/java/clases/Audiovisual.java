package clases;

import java.util.Arrays;

/**
 * This is the class Director
 * @author Alvaro Lopez Montero 
 */

public class Audiovisual implements Comparable<Audiovisual> {

    String title;
    String originalLanguage;
    Actor[] supportingActores;
    Director[] directors;
    Categoria[] categories;
    int yearOfCreation;
    int views;
    Subtitulos[] Subtitulos;

    
    
    public Audiovisual(String title, String originalLanguage, int yearOfCreation, int views) {
    	
    	Subtitulos = new Subtitulos[0];
    	categories = new Categoria[0];
    	directors = new Director[0];
    	supportingActores = new Actor[0];
    	
    	
        this.title = title;
        this.originalLanguage = originalLanguage;
        this.yearOfCreation = yearOfCreation;
        this.views = views;
       
    }
    
    public Actor[] getsupportingActores() {
        return supportingActores;
    }

    public void setsupportingActores(Actor[] supportingActores) {
        this.supportingActores = supportingActores;
    }
    
    public void addsupportingActores(Actor newActor){
        this.supportingActores = Arrays.copyOf(this.supportingActores, this.supportingActores.length+1);
        this.supportingActores[this.supportingActores.length-1] = newActor;
    }

    public void deletesupportingActores(int pos) {
        System.arraycopy(supportingActores, pos, supportingActores, pos +1, supportingActores.length-pos+1);
        this.supportingActores = Arrays.copyOf(this.supportingActores, this.supportingActores.length-1);
    }

    public int getyearOfCreation() {
        return yearOfCreation;
    }

    public void setyearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
    
    public Categoria[] getcategories() {
        return categories;
    }

    public void setcategories(Categoria[] categories) {
        this.categories = categories;
    }
    
    public void addcategories(Categoria  nuevacategories ){
    	
        this.categories = Arrays.copyOf(this.categories, this.categories.length+1);
        this.categories[this.categories.length-1] = nuevacategories;
    }

    public void deleteCategoria(int pos) {
        System.arraycopy(categories, pos, categories, pos +1, categories.length-pos+1);
        this.categories = Arrays.copyOf(this.categories, this.categories.length-1);
    }

    public Director[] getdirectors() {
        return directors;
    }

    public void setdirectors(Director[] directors) {
        this.directors = directors;
    }
    
    public void adddirectors(Director  newdirectors ){
    	
        this.directors = Arrays.copyOf(this.directors, this.directors.length+1);
        this.directors[this.directors.length-1] = newdirectors;
    }

    public void deletedirectors(int pos) {
        System.arraycopy(directors, pos, directors, pos +1, directors.length-pos+1);
        this.directors = Arrays.copyOf(this.directors, this.directors.length-1);
    }
 
    public String getoriginalLanguage() {
        return originalLanguage;
    }

    public void setoriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Subtitulos[] getSubtitulos() {
        return Subtitulos;
    }

    public void setSubtitulos(Subtitulos[] Subtitulos) {
        this.Subtitulos = Subtitulos;
    }
    
    public void addSubtitulos(Subtitulos  newSubtitulos ){
    	
        this.Subtitulos = Arrays.copyOf(this.Subtitulos, this.Subtitulos.length+1);
        this.Subtitulos[this.Subtitulos.length-1] = newSubtitulos;
    }

    public void deleteSubtitulos(int pos) {
        System.arraycopy(Subtitulos, pos, Subtitulos, pos +1, Subtitulos.length-pos+1);
        this.Subtitulos = Arrays.copyOf(this.Subtitulos, this.Subtitulos.length-1);
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getviews() {
        return views;
    }

    public void setviews(int views) {
        this.views = views;
    }

	@Override
	public int compareTo(Audiovisual o) {
		// TODO Auto-generated method stub
		return 0;
	}
   
}
