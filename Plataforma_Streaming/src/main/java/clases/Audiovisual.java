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
    Category[] categories;
    Recommendations[] recommendations;
    int yearOfCreation;
    int views;
    Subtitles[] Subtitulos;

    
    public Audiovisual() {
    	
    }
    public Audiovisual(String title, String originalLanguage, int yearOfCreation, int views) {
    	
    	Subtitulos = new Subtitles[0];
    	categories = new Category[0];
    	directors = new Director[0];
    	supportingActores = new Actor[0];
    	recommendations= new Recommendations[0];
    	
    	
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
        if(pos < this.supportingActores.length)
            System.arraycopy(supportingActores, pos+1, supportingActores, pos, supportingActores.length-pos-1);
        this.supportingActores = Arrays.copyOf(this.supportingActores, this.supportingActores.length-1);
    }

    public int getyearOfCreation() {
        return yearOfCreation;
    }

    public void setyearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
    
    public Category[] getcategories() {
        return categories;
    }

    public void setcategories(Category[] categories) {
        this.categories = categories;
    }
    
    public void addcategories(Category  nuevacategories ){
    	
        this.categories = Arrays.copyOf(this.categories, this.categories.length+1);
        this.categories[this.categories.length-1] = nuevacategories;
    }

    public void deleteCategoria(int pos) {
        if(pos < this.categories.length)
            System.arraycopy(categories, pos+1, categories, pos, categories.length-pos-1);
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
        if(pos < this.directors.length)
            System.arraycopy(directors, pos+1, directors, pos, directors.length-pos-1);
        this.directors = Arrays.copyOf(this.directors, this.directors.length-1);
    }
 
    public String getoriginalLanguage() {
        return originalLanguage;
    }

    public void setoriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Subtitles[] getSubtitulos() {
        return Subtitulos;
    }

    public void setSubtitulos(Subtitles[] Subtitulos) {
        this.Subtitulos = Subtitulos;
    }
    
    public void addSubtitulos(Subtitles newSubtitulos ){
    	
        this.Subtitulos = Arrays.copyOf(this.Subtitulos, this.Subtitulos.length+1);
        this.Subtitulos[this.Subtitulos.length-1] = newSubtitulos;
    }
    

    public void deleteSubtitulos(int pos) {
        if(pos < this.Subtitulos.length)
            System.arraycopy(Subtitulos, pos+1, Subtitulos, pos, Subtitulos.length-pos-1);
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
    public void addviews() {
    	views++;
    }
    
	@Override
	public int compareTo(Audiovisual o) {
		// TODO Auto-generated method stub
		return 0;
	}
	 public Recommendations[] recommendations() {
	        return recommendations;
	    }

	    public void setRecommendations(Recommendations[] recommendations) {
	        this.recommendations = recommendations;
	    }
	    
	    public void addRecommendations(Recommendations  nuevarecommendations ){
	    	
	        this.recommendations = Arrays.copyOf(this.recommendations, this.recommendations.length+1);
	        this.recommendations[this.recommendations.length-1] = nuevarecommendations;
	    }
	    public Recommendations[] getRecommendations()
	    {
			return this.recommendations;
	    	
	    }

	    public void deleteRecommendations(int pos) {
                if(pos < this.recommendations.length)
                    System.arraycopy(recommendations, pos+1, recommendations, pos, recommendations.length-pos-1);
	        this.recommendations = Arrays.copyOf(this.recommendations, this.recommendations.length-1);
	    }

    @Override
    public String toString() {
        return "Audiovisual{" + "title=" + title + ", originalLanguage=" + originalLanguage + ", yearOfCreation=" + yearOfCreation + ", views=" + views + '}';
    }

    
            
            
   
}
