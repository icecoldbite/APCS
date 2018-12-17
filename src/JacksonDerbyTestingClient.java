public class JacksonDerbyTestingClient {
    public static void main(String[] args) {
        JacksonDerbyBicycle bicycle = new JacksonDerbyBicycle(249.99, false, "New", 6, "Red");
        System.out.println(bicycle);
        bicycle.setColor("Green");
        System.out.println(bicycle);

        JacksonDerbyStudent Jackson = new JacksonDerbyStudent("Jackson Derby", 12282001, 'M', "123 Fake Address Avenue", 12);
        System.out.println(Jackson);
        System.out.println(Jackson.getGender());

        JacksonDerbyCake cake = new JacksonDerbyCake("Eggs, Flour, Sugar, Milk, Vanilla Extract, Cocoa Powder", "Chocolate", "Vanilla", true);
        System.out.println(cake);

        JacksonDerbyClassroom S208 = new JacksonDerbyClassroom("Mr. Sammartano", 25, 30, true, 20.5, 41.2, "Earth Science", true);
        System.out.println(S208);
        S208.setNumberOfStudents(35);
        System.out.println(S208);

        JacksonDerbyPenguin Poppy = new JacksonDerbyPenguin("Emperor", 3.9, 51.2, 7, true, 'F', false, false, false, "Antarctic");
        Poppy.setCanFly(true); //Flight has been achieved. I repeat, flight has been achieved
        System.out.println(Poppy);


    }


}
