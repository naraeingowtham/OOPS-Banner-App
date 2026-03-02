public class oopsbannerapp {

    
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

     
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

       
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

      
        CharacterPatternMap[] bannerMap = {

            new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            })
        };

        String word = "OOPS";

      
        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap map : bannerMap) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}