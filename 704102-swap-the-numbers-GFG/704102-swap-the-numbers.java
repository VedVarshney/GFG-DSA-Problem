class Solution {
    public void swap(int a, int b) {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a + " " + b);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna