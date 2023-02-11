package P07GenericsExercise.P06GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    public Box(){
        this.values=new ArrayList<>();
    }

    public void add(T element){
        values.add(element);
    }

    public int countOfGreaterItems(T elementToCompare){
        return (int)values.stream()
                .filter(elementFromBox->elementFromBox.compareTo(elementToCompare)>0)
                .count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(T value:values){
            sb.append(String.format("%s: %s%n",value.getClass().getName(),value.toString()));
        }
        return sb.toString();
    }
}
