package hero;

public class Example {
    private void privatefunction(){
        System.out.println("This is private Function");
    }

    void defaultfucntion(){
        privatefunction();
        System.out.println("This is Default Function");
    }

    protected void protectedfucntion(){
        System.out.println("This is Protected Function");
    }
    public void publicfucntion(){
        System.out.println("This is Public Function");
    }
}

class driver {
    public static void main(String[] args){
        Example ex1 = new Example();
        ex1.publicfucntion();
        ex1.defaultfucntion();
        ex1.protectedfucntion();
    }
}




