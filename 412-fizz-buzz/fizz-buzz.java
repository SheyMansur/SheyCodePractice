class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                answer.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            }
            else if (fizz == 3) {
                answer.add("Fizz");
                fizz = 0;
            }
            else if (buzz == 5) {
                answer.add("Buzz");
                buzz = 0;
            }
            else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}