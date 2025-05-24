class Encapsulation{
    public static void main(String[] args){
        
        Student s1 = new Student();
         s1.setName("Rohith");
        System.out.println("Name : "+s1.getName());
        s1.setAge(30);
        System.out.println("Age : "+s1.getAge());
         s1.setPassedOut(false);
        System.out.println("Passed Or Not : "+s1.getPassedout());
         s1.setMarks(295);
        System.out.println("Marks : "+s1.getMarks());
         s1.setERP(5000);
        System.out.println("ERP : "+s1.getERP());
    }
}

class Student{
    int age;String name;boolean passedout;float marks;long ERP;
    
    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name=name;
    }
    void setPassedOut(boolean passedout){
        this.passedout = passedout;
    }
    void setMarks(float marks){
        this.marks = marks;
    }
    void setERP(long ERP){
        this.ERP = ERP;
    }
    
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    boolean getPassedout(){
        return passedout;
    }
    float getMarks(){
        return marks;
    }
    long getERP(){
        return ERP;
    }
}