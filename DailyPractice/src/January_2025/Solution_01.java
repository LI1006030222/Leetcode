package January_2025;

import java.util.ArrayList;

// Leetcode 3280
public class Solution_01 {
    /*
        date: yyyy-mm-dd
     */

    public String convertDateToBinary(String date) {
        ArrayList<String> list = new ArrayList<>();
        String[] split = date.split("-");
        for (String s : split) {
            list.add(Integer.toUnsignedString(Integer.parseInt(s), 2));
        }
        return String.join("-", list);

    }

    public static void main(String[] args) {
        System.out.println(new Solution_01().convertDateToBinary("2020-10-30"));
    }
}
