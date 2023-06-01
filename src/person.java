 class person {
     String name;
     int age;

     public person(String name, int age) {
         this.name = name;
         this.age = age;

     }

     void dispaly() {
         System.out.println("Name=" + name);
         System.out.println("age=" + age);
     }

 }
 class student extends person{
    String branch;
    int id;
    student(String name,int age,String branch,int id){
        super(name,age);
        this.branch=branch;
        this.id=id;
    }
    void dispalystudent(){

        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("branch="+branch);
        System.out.println("Id="+id);
    }

    public static void main(String[] args) {
        student a=new student("ram",23,"CSE",100);
        student a1=new student("Surya",22,"bur",222);
        a.dispaly();
        a.dispalystudent();
        a1.dispaly();
        a1.dispalystudent();
    }
}
