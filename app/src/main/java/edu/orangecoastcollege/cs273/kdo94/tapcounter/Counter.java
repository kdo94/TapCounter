package edu.orangecoastcollege.cs273.kdo94.tapcounter;

/**
 * Created by kevin_000 on 9/10/2016.
 */
public class Counter {
    private int mCount;

    public Counter(){
        mCount = 0;
    }

    public Counter(int count) {
        this.mCount = count;
    }

    public void setCount(int count){
        mCount = count;
    }

    public void addCount(){
        mCount+=1;
    }

    public int getCount(){
        return mCount;
    }
}
