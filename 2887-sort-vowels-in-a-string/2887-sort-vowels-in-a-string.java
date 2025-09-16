class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(int i = 0; i<s.length(); i++ ){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U'){
                vowels.add(s.charAt(i));
            }
        }
        Collections.sort(vowels);

        StringBuilder finalStr = new StringBuilder();
        int VowelIdx = 0;

        for(int i = 0 ;i<s.length(); i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U'){
                finalStr.append(vowels.get(VowelIdx++));
            }else{
                finalStr.append(s.charAt(i));
            }
        }

        return finalStr.toString();
    }
}