package opgave5;

import java.util.Observer;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);
}
