package 泛型01;

public class FxPair <T>{  // type  类型
    private T first;
    private T second;
     //构造方法
    public Pair() {
    }
    public Pair(T first,T second){
        this.first = first;
        this.second=second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }


    }

