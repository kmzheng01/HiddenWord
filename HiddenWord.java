public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(i)) {
                output = output + str.substring(i, i+1);
            } else if(word.contains(str.substring(i, i+1))) {
                output = output + "+";
            } else {
                output = output + "*";
            }
        }

        return output;
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("CLAMP");

        System.out.println(puzzle.getHint("KINKY"));
        System.out.println(puzzle.getHint("POWER"));
        System.out.println(puzzle.getHint("HURTY"));
        System.out.println(puzzle.getHint("PASSE"));
        System.out.println(puzzle.getHint("APPLY"));
        System.out.println(puzzle.getHint("CLAMP"));
    }
}
