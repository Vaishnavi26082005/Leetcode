class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> l = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            String chunk = s.substring(i, end);
            
           
            if (chunk.length() < k) {
                StringBuilder sb = new StringBuilder(chunk);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                chunk = sb.toString();
            }
            
            l.add(chunk);
        }

      
        String[] arr = new String[l.size()];
        return l.toArray(arr);
    }
}
