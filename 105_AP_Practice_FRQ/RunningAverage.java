public class RunningAverage{ 
    /** The number of ratings included in the running average. */ 
    int count; 
    /** The average of the ratings that have been entered. */ 
    double average; 
    // There are no other instance variables. 
     
    /** Creates a RunningAverage object. 
    * Postcondition: count is initialized to 0 and average is 
    * initialized to 0.0. 
    */ 
    public RunningAverage(){
        /* implementation not shown */ 
        
    } 
    /** Updates the running average to reflect the entry of a new 
    * rating, as described in part (a). 
    */ 
    public void updateAverage(double newVal){
        /* to be implemented in part (a) */ 
        average = average*count+newVal;
        count ++;
        average=average/count;
        
    } 
    /** Processes num new ratings by considering them for inclusion 
    * in the running average and updating the running average as 
    necessary. Returns an integer that represents the number of 
    * invalid ratings, as described in part (b). 
    * Precondition: num >> 
    */ 
    public int processNewRatings(int num){
        /* to be implemented in part (b) */ 
        int x=0;
        
        if(num<0){
            x++;
            return x;
        }
        
        
        return 0;
    } 
    /** Returns a single numeric rating. */ 
    public double getNewRating(){
    /* implementation not shown */ 
    return proccessNewRatings;
        
        
    }
}