public class Cat {
    String name;
    String p;
    Integer age;
    String color;
    String type;


    void PrintInfo(){
        System.out.println(name +" " +age +" "+ p +" " +type +" "+ color );
    }

    Cat() {
        name = "Vasya";
        p = "m";
        age = 6;
        color = "black";
        type = "Britain";
    }

    Cat(Integer k){
        name = "Vasya";
        p = "m";
        age = k;
        color = "black";
        type = "Britain";
    }

    Cat(String n, String pp, Integer a, String c, String t){
        name = n;
        p = pp;
        age = a;
        color = c;
        type = t;
    }

    @Override
    public boolean equals(Object obj) {

        if(this.getClass()!=obj.getClass()) return false;
        Cat g = (Cat) obj;  
        if(!this.name.equals(g.name) || this.age!=g.age || this.p.equals(g.p)) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result+=(this.age + this.name.hashCode()+ this.color.hashCode()+ this.p.hashCode()+this.type.hashCode());
        System.out.println(result);
        return result;
    }
}
