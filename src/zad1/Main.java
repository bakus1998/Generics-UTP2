/**
 *
 *  @author Baka Krzysztof S16696
 *
 */

package zad1;



import java.util.*;

public class Main {
  public Main() {
    List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);/*<-- tu dopisać inicjację elementów listy */
    System.out.println(test1(src1));

    List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv" ); //*<-- tu dopisać inicjację elementów listy *//*
    System.out.println(test2(src2));

    //Moje testy
    List<Double> src3 = Arrays.asList(1.0, 7.2, 2.39, 2.11, 3.12);/*<-- tu dopisać inicjację elementów listy */
    System.out.println(test3(src3));

    List<Long> src4 = Arrays.asList(2147483649l,31474836472l);
    System.out.println(test4(src4));
  }


    public List<Integer> test1(List<Integer> src) {

      Selector<Integer> sel = new Selector<Integer>() {
        @Override
        public boolean select(Integer val) {
          if(val<10){
            return true;
          }else{
            return false;
          }
        }
      };

      Mapper<Integer,Integer> map = new Mapper<Integer, Integer>() {
        @Override
        public Integer map(Integer val) {
          return val+=10;
        }
      };

      return ListCreator.collectFrom(src).when(sel).mapEvery(map);

    }


  public List<Integer> test2(List<String> src) {
    Selector<String> sel = new Selector<String>() {
      @Override
      public boolean select(String val) {
        if(val.length()>3){
          return true;
        }else{
          return false;
        }
      }
    };

    Mapper<String,Integer> map = new Mapper<String, Integer>() {
      @Override
      public Integer map(String val) {
        return val.length()+10;
      }
    };

    return ListCreator.collectFrom(src).when(sel).mapEvery(map);

  }

  //Moje testy
  public List<Double> test3(List<Double> src) {

    Selector<Double> sel = new Selector<Double>() {
      @Override
      public boolean select(Double val) {
        if(val>2.4){
          return true;
        }else{
          return false;
        }
      }
    };

    Mapper<Double,Double> map = new Mapper<Double, Double>() {
      @Override
      public Double map(Double val) {
        return val+=10;
      }
    };

    return ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }

  public List<Long> test4(List<Long> src) {

    Selector<Long> sel = new Selector<Long>() {
      @Override
      public boolean select(Long val) {
        if(val>2.4){
          return true;
        }else{
          return false;
        }
      }
    };

    Mapper<Long,Long> map = new Mapper<Long, Long>() {
      @Override
      public Long map(Long val) {
        return val/=2;
      }
    };

    return ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }


  public static void main(String[] args) {
    new Main();
  }
}
