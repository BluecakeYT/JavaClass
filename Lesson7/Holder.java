public class Holder<T>{
  private T value;
  public Holder(){ //NOTICE NO <> here!!!
  }
  public Holder(T start){ //NOTICE NO <> here!!!
      value = start;
  }
  public T getValue(){
    return value;
  }

  public void setValue(T newVal){
    value = newVal;
  }

  public static void main(String[]args){
    Holder<String> name = new Holder<String>("Whoa!");

    Holder<Integer> data = new Holder<Integer>();
    data.setValue(5);

    System.out.println(name.getValue()+" "+data.getValue());
    name.setValue("name string");


    System.out.println(name.getValue()+" "+data.getValue());
  }
}
