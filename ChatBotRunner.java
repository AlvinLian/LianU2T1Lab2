public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 17);

        //greeting user
        debbie.greeting("Alvin");

        //weather
        debbie.weather();

        //conversion
        double feetToMeter = debbie.convertFeetToMeters(35);
        System.out.println("In 35 feet, there are " + feetToMeter + " meters");

        //info about fav number
        debbie.favoriteNumber(99);

        //sum of three numbers
        int sum = debbie.addNumbers(87, 2381, 329);
        System.out.println("The sum is " + sum);

        //inspirational quote
        debbie.inspirationalQuote();

        //age
        int myAge = debbie.age(2022,2006);
        System.out.println("Your age is " + myAge);

        //farewell
        String goodbye = debbie.goodbye();
        System.out.println(goodbye);
    }
}
