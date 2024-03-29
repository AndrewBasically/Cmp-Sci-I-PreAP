//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

    //add constructors
    public Perfect(){
        number = 0;
        this.isPerfect();
    }
    
    public Perfect(int num){
        this.setNums(num);
    }
    //add a set method
    
    public void setNums(int num){
        number = num;
    }

    public boolean isPerfect()
    {

        int div = 0;
        int sum = 0;
        while(div<number/2){
            div++;
            if(number%div==0){
                sum+=div;
            }
        }
        if(sum==number){
            //System.out.println(number + " " + " is perfect.");
            return true;
        }
        else{
            //System.out.println(number + " " + " is not perfect.");
            return false;
        }
    }

    //add a toString
    public String toString(){
        if(this.isPerfect()){
            return number + " " + " is perfect.";
        }
        else{
            return number + " " + " is not perfect.";
        }
    }
    
}