/**
 *
 *  @author Baka Krzysztof S16696
 *
 */

package zad1;


import java.util.Map;

public interface Mapper<T,S> {// Uwaga: interfejs musi być sparametrtyzowany
    public S map(T val);
}  
