public class JavaDeveloperRanner {
    public static void main(String[] args) {


        String[] skills = {" Java, ", " C++, ", " Kotlin, ", " PHP, ", " SQL, "," Spring "};


        javaDeveloper javaDeveloper = new javaDeveloper(" Nurbol Marlisovich ",skills);


        Iterator iterator = javaDeveloper.getIterator();
        System.out.println(" Developer: "+ javaDeveloper.getName());
        System.out.println(" Skills: ");


        while (iterator.hasNext()){
            System.out.print(iterator.next().toString());

        }
    }

}
