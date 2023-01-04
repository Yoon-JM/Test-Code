package Java_Collection;

class Basket<T> {
    private T item;

    public Basket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
class main{
    public main(String[] args){
        Basket<Integer> basket1 = new Basket<Integer>(1);
        Basket<String> basket2 = new Basket<String>("저는 힘들어요");
        Basket<Double> basket3 = new Basket<Double>(3.14);

        System.out.println(basket1);
    }
}
