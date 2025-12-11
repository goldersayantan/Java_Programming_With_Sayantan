class Student {
    private String name;

    public void setName(String n)  {
        name = n;
    }

    public String getName()  {
        return name;
    }
}

class Encapsulation {
    public static void main(String[] args)  {
        Student s1 = new Student();
        s1.setName("Alex");
        String name = s1.getName();
        System.out.println(name);
    }
}