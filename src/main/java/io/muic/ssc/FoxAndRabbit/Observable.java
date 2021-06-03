package io.muic.ssc.FoxAndRabbit;

public interface Observable {

    void attach(Observer o);

    void detach(Observer o);

    void notifyObserver(int step, Field field);
}
