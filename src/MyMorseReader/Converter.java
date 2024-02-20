package MyMorseReader;

import java.util.HashMap;

public class Converter {
    private HashMap<String, String> toMorseMap;
    private HashMap<String, String> toEnglishMap;

        public Converter() {
            toMorseMap = new HashMap<>();
            toEnglishMap = new HashMap<>();

            runMap();
        }

        private void runMap() {
            toEnglishMap.put("*-","A");
            toEnglishMap.put("-***","B");
            toEnglishMap.put("-*-*","C");
            toEnglishMap.put("-**","D");
            toEnglishMap.put("*","E");
            toEnglishMap.put("**-*","F");
            toEnglishMap.put("--*","G");
            toEnglishMap.put("****","H");
            toEnglishMap.put("**","I");
            toEnglishMap.put("*---","J");
            toEnglishMap.put("-*-","K");
            toEnglishMap.put("*-**","L");
            toEnglishMap.put("--","M");
            toEnglishMap.put("-*","N");
            toEnglishMap.put("---","O");
            toEnglishMap.put("*--*","P");
            toEnglishMap.put("--*-","Q");
            toEnglishMap.put("*-*","R");
            toEnglishMap.put("***","S");
            toEnglishMap.put("-","T");
            toEnglishMap.put("**-","U");
            toEnglishMap.put("***-","V");
            toEnglishMap.put("*--","W");
            toEnglishMap.put("-**-","X");
            toEnglishMap.put("-*--","Y");
            toEnglishMap.put("--**","Z");
            toEnglishMap.put("*----","1");
            toEnglishMap.put("**---","2");
            toEnglishMap.put("***--","3");
            toEnglishMap.put("****-","4");
            toEnglishMap.put("*****","5");
            toEnglishMap.put("-****","6");
            toEnglishMap.put("--***","7");
            toEnglishMap.put("---**","8");
            toEnglishMap.put("----*","9");
            toEnglishMap.put("-----","0");
            toEnglishMap.put("*-*-*-",".");
            toEnglishMap.put("--**--",",");
            toEnglishMap.put("**--**","?");


            for (String key : toEnglishMap.keySet()) {
                String value = toEnglishMap.get(key);
                toMorseMap.put(value, key);
            }
        }

        public String toMorse(String english) {
            StringBuilder morse = new StringBuilder();
            //Går igenom HashMappen ovan och översätter från engelska till morsekod när den hittat motsvarande morsekod.

            for (int i = 0; i < english.length(); i++) {
                char letter = english.charAt(i);
                String morseLetter = toMorseMap.get(String.copyValueOf(new char[]{letter}).toUpperCase());
                //String morseLetter = toMorseMap.get(String.copyValueOf(letter).toUpperCase());
                if (morseLetter != null) {
                    morse.append(morseLetter).append(" ");
                } else {
                    morse.append(" ");
                }
            }
            return morse.toString().trim();
        }

        public String toEnglish(String morse) {
            StringBuilder english = new StringBuilder();
            String[] morseLetters = morse.split(" ");
            for (String morseLetter : morseLetters) {
                String englishLetter = toEnglishMap.get(morseLetter); {
                    if (englishLetter != null) {
                        english.append(englishLetter);
                    }
                }
            }
            return english.toString();
        }

    }

