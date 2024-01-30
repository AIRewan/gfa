public class Cloth {
  public TYPE Wear;
  public String Type;
  public String Color;
  public int Condition;
  public int InitialCondition;
  public int DaysWorn;
  public int NeedToWash;

  public Cloth(int condition,int wash, TYPE wear, String type, String color){
    Wear= wear;
    Type= type;
    Color= color;
    Condition=condition;
    InitialCondition=condition;
    DaysWorn=0;
    NeedToWash=wash;
  }
  public boolean needsToBeWashed(){
    return true;
  }

  public void wear(){
    if(this.DaysWorn>=this.NeedToWash){
      System.out.println("This can't be worn, because it needs to be washed.");
    }
    else{
      this.DaysWorn++;
      this.Condition--;
    }
  }
  public void wash(){
    DaysWorn=0;
  }
  public void repair(){
    if(Wear==TYPE.OVERWEAR){
      Condition=InitialCondition;
    }
  }

  public void getInfo(){
    System.out.println(Color+" " + Type+" worn for "+ DaysWorn+" days, has "+Condition+" wash cycles left.");
  }
}
