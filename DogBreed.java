public class DogBreed {
	// instance variables;
	private String breed = "";
	private double newOwn = 0;
	private double friendly = 0;
	private double groom = 0;
	private double health = 0;
	private double size = 0;
	private double train = 0;
	private double bark = 0;
	private double exercise = 0;
	
	
	// constructor with all variables in order to pair dog with potenital candidates
	
	public DogBreed(String br, double n, double f, double g, double h, double s, double t, double b, double e){
	this.breed = br;
	this.train = t;
	this.newOwn = n;
	this.freindly = f;
	this.groom = g;
	this.health = h;
	this.size = s;
	this.bark = b;
	this.exercise = e;
	}
	
	// getter/setter method
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breedType) {
		breed = breedType;
	}
	
	public int getTrain(){
	   return train;   
	}
	public void setTrain(int train1){
	   train = train1;
	}
	public int getFriendly(){
	   return apt;   
	}
	public void setFriendly(int friendly1){
	   friendly = friendly1;
	}
	public int getNewOwn(){
	   return newOwn;   
	}
	public void setNewOwn(int newOwn1){
	   newOwn = newOwn1;
	}
	public int getGroom(){
	   return groom;   
	}
	public void setGroom(int groom1){
	   groom = groom1;
	}
	public int getHealth(){
	   return health;   
	}
	public void setHealth(int health1){
	   health = health1;
	}
	public int getSize(){
	   return size;   
	}
	public void setSize(int size1){
	   size = size1;
	}
	public int getBark(){
	   return bark;   
	}
	public void setBark(int bark1){
	  bark = bark1;
	}
	
	public double getExercise() {
		return exercise;
	}
	
	public void setExercise(double exercise1) {
		exercise = exercise1;
	}
	
	public String toString() {
		return "Dog breed: " + breed + ", New Owner: " + newOwn + ", Friendly: " + friendly + ", Groom: " + groom
			+ ", Health: " + health + ", Size: " + size + ", Train: " + train + ", Bark: " + bark + ", Exercise: "
			+ exercise;
	}
		
}
