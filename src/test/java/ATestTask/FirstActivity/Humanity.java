package ATestTask.FirstActivity;

public abstract class Humanity {

        // default constructor
        public Humanity(){
            System.out.println("I am a Humanity");
        }

        //abstract methods have no implementation
        public abstract String getKindOfHumanity();
        public abstract void setKindOfHumanity(String name);

    }

