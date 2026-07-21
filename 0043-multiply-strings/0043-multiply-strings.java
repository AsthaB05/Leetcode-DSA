class Solution {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String[] arr = new String[num1.length()];
        int idx = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = num2.length() - 1; j >= 0; j--) {

                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2 + carry;

                sb.append(mul % 10);
                carry = mul / 10;
            }

            if (carry > 0) {
                sb.append(carry);
            }

            sb.reverse();
            for (int z = 0; z < idx; z++) {
                sb.append('0');
            }

            arr[idx] = sb.toString();
            idx++;
        }

        String ans = "0";

        for (String s : arr) {
            ans = addStrings(ans, s);
        }

        return ans;
    }

    public String addStrings(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}