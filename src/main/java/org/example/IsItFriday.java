package org.example;

//Demo Class under Test
public class IsItFriday {

        public static String isItFriday(String today) {
            String answer = "Nope";
            if (today.equals("Friday")) {
                answer = "TGIF";
            }
            return answer;
        }

}
