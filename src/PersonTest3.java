class PersonTest3 {
    public static void main(String[] args) {

        Person john= new Person( "Jan" , "Kowalski", 20, "Wrocław" );

        john.showInfo();

        TimeMachine tim = new TimeMachine(); // żeby działać na klasie TimeMachine musimy stworzyć sobie obiekt tej klasy
        tim.timeTravel (john, 5);
        System.out.println (john.age);
    }
}