package nl.vu.cs.s2.simbadtest;

public interface Subject {
   public int getState();

   public void setState(int state);

   public void attach(Observer observer);

   public void notifyAllObservers();
}