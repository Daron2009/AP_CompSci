public class StepTracker{
    
    int steps=0;
    int aD=0;
    int atleast = 0;
    int days=0;
    
    
    public stepTracker(int s){
        atleast=s;
    }
    
    public void addDailySteps(int d){
        steps=steps+d;
        days ++;
        if(d>+atleast){
            aD++;
        }
    }
    public int activeDays(){
        return aD;
    }
    public double averageSteps(){
        return (double)steps/days;
    }
    
    
    
    
    
    
    
}