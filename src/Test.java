public class Test {

    public static void main(String[] args) {
        Kid k1 = new Kid();
        Kid k2 = new Kid();
        Kid k3 = new Kid();
        Kid k4 = new Kid();
        Kid k5 = new Kid();

        // Kid constructor with name
        Kid k6 = new Kid("Henrick");
        Kid k7 = new Kid("Jasmin");
        Kid k8 = new Kid("Fiona");
        Kid k9 = new Kid("Julianna");
        Kid k10 = new Kid("Ann-Sophie");

        k1.setName("Johnny");
        k1.yearOfBirth = 2010;
        // ---------------------
        k2.setName("Patrick");
        k2.yearOfBirth = 2012;
        // ---------------------
        k3.setName("Alex");
        k3.yearOfBirth = 2008;
        // ---------------------
        k4.setName("Tom");
        k4.yearOfBirth = 2000;
        // ---------------------
        k4.setName("Frederick");
        k5.yearOfBirth = 2016;

        System.out.println("Kid1s name is: " + k1.getName());
        System.out.println("Kid2s name is: " + k2.getName());
        System.out.println("Kid3s name is: " + k3.getName());
        System.out.println("Kid4s name is: " + k4.getName());
        System.out.println("Kid5s name is: " + k5.getName());

        System.out.println("----------------------------");

        System.out.println(k1);
        System.out.println("----------------------------");
        System.out.println(k2);
        System.out.println("----------------------------");
        System.out.println(k3);
        System.out.println("----------------------------");
        System.out.println(k4);
        System.out.println("----------------------------");
        System.out.println(k5);

        System.out.println("----------------------------");



    }
}