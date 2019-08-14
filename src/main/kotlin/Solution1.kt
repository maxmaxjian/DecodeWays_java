class Solution1 : Solution {
    private val found : HashMap<String,Int> = HashMap()

    override fun numDecodings(s: String): Int {
        if (!found.containsKey(s)) {
            var result = when (s.length) {
                0 -> 0
                1 -> 1
                2 -> {
                    val value = Integer.valueOf(s)
                    when {
                        value == 10 || value == 20 -> 1
                        value in 1..26 -> 2
                        else -> numDecodings(s.substring(1))
                    }
                }
                else -> {
                    var result = 0
                    if (Integer.valueOf(s.substring(0, 1)) != 0) {
                        result += numDecodings(s.substring(1))
                    }
                    if (Integer.valueOf(s.substring(0, 2)) in 1..26) {
                        result += numDecodings(s.substring(2))
                    }
                    result
                }
            }
            found.put(s, result)
        }
        return found.get(s)!!
    }
}
