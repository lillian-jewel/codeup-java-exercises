public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least
//    10 adjectives, another with at least 10 nouns.

    static String [] adjectives = {"rainy", "crooked", "reasonable", "hysterical", "eatable",
        "victorious", "shiny", "dry", "husky", "simplistic"};

    static String[] nouns = {"leadership", "location", "problem", "lake", "user",
            "movie", "year", "cookie", "guidance", "tea"};

//    Create a method that will return a random element from an array of strings.

    static String randoElement(String[] anArr){
        int rando = (int)(Math.random() * 9);
        System.out.println(rando);
        return anArr[rando];
    };

//    Add a main method, and inside of your main method select and random noun
//    and adjective and hyphenate the combination and display the generated
//    name to the user.

    public static void main(String[] args) {
        System.out.printf("%s, %s", randoElement(adjectives), randoElement(nouns));
    }

}
