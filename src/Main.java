
public class Main {
    public static void main(String[] args) {
        PhraseGenerator();
        PhraseGenerator();
        PhraseGenerator();

    }

    public static String PhraseGenerator() {
        String[] firstWordList = {"Hello", "Hi", "Whatsup", "Privet",
                "Ola", "Oi, Mate", "Bonjour", "Salem",
                "Zdorovenki buly"};
        String[] secondWordList = {"John", "Friend", "Asshole", "Champ",
                "Bestie", "Samurai", "Bleach", "Ayan", "Kolyan",
                "Bro", "Sis", "Amigo", "Kurva"};
        String[] thirdWordList = {"Fuck u", "Bless u", "curse u",
                "Love u", "hate u", "Kill u", "hug u", "rob u",
                "surprise", "ambush", "rampage", "run"};

        int firstLength = firstWordList.length;
        int secondLength = secondWordList.length;
        int thirdLength = thirdWordList.length;

//        Generate three random words
        int rand1 = (int) (Math.random() * firstLength);
        int rand2 = (int) (Math.random() * secondLength);
        int rand3 = (int) (Math.random() * thirdLength);

        String phrase = firstWordList[rand1] + " " + secondWordList[rand2]
                + " " + thirdWordList[rand3] + ".";

        System.out.println(phrase);

        return phrase;
    }
}
