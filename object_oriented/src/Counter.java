public class Counter {
  int counter;
  int initial;

  public Counter() {
    this.counter=0;
    this.initial=0;
  }
  public Counter(int c) {
    this.counter=c;
    this.initial=c;
  }

  public void add(int number) {
    this.counter+=number;
  }
  public void add(){
    this.counter++;
  }

  public int get() {
    return counter;
  }

  public void reset(){
    this.counter=initial;
  }
}
