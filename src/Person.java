public class Person {

    private String name,adress;
    private int age;
    public Person(String name, String adress, int age) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.setName(name);
    }
    public void setAdress(String adress){
        this.setAdress(adress);
    }
    public void setAge(int age){
        this.setAge(age);
    }
    public static void main(String[] args){
        Person person = new Person("Alex","strada 200",19);
        System.out.println("Numele persoanei:" + person.name);
        System.out.println("Numele persoanei:" + person.age);
        System.out.println("Numele persoanei:" + person.adress);
    }
}

