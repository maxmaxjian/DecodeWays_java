import java.util.HashMap;
import java.util.Map;

public class Solution2 implements SolutionJava {

    private Map<String,Integer> map = new HashMap<>();

    @Override
    public int numDecodings(String s) {

        if (!map.containsKey(s)) {
            int len = s.length();
            int result = 0;
            if (len == 1) {
                result = s.charAt(0) == '0' ? 0 : 1;
            } else if (len == 2) {
                if ('0' == s.charAt(0)) {
                    result = 0;
                } else {
                    int val = Integer.valueOf(s);
                    if (val == 10 || val == 20) {
                        result = 1;
                    } else if (val >= 1 && val <= 26) {
                        result = 2;
                    } else {
                        result = '0' == s.charAt(1) ? 0 : 1;
                    }
                }
            } else {
                if (s.charAt(0) != '0') {
                    result += numDecodings(s.substring(1));
                    int firstTwo = Integer.valueOf(s.substring(0, 2));
                    if (firstTwo >= 1 && firstTwo <= 26) {
                        result += numDecodings(s.substring(2));
                    }
                }
            }
            map.put(s, result);
        }
        return map.get(s);
    }
}
