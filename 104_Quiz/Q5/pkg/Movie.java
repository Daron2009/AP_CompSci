package pkg;

public class Movie{
    
    String moiveName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        moiveName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String m, double r, int n, int rn){
        moiveName = m;
        rating = r;
        numRatings = n;
        revenue = rn;
    }
    public void movieToString(){
        
        System.out.println("Moive: "+moiveName+"\nRating: "+rating+"\nNumber of Ratings: "+numRatings+"\nRevenue: "+revenue+"\n");
        
    }
    public String getMovieName(){
        return moiveName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public void addRating(double r){
       
        rating = (rating*numRatings) +r;
        numRatings ++;
        rating = rating/numRatings;
        
    }
    public boolean compareRatings(Movie r){
        
        double z=r.getRating();
        
        if(rating>z){
            return true;
        }else{
            return false;
        }
    } 
    public String revenueToString(){
        
        String x = "";
        
        
        return x;
    }
    
    
    public Movie pirateMovie(){
        
        
        
      
        return  moiveName = moiveName rating = rating numRatings = numRatings;
        revenue = revenue; ;
    }

}
