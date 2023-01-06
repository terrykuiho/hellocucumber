package hellocucumber;

//Demo Class under Test
public class IsItFriday {

        static String isItFriday(String today) {
            String answer = "Nope";
            if (today.equals("Friday")) {
                answer = "TGIF";
            }
            return answer;
        }

}
