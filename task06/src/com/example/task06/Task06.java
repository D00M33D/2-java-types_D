package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sum = x + y;
        int count = 0;

        if (sum > 0){
            while (sum > 0){
                count += 1;
                sum /= 10;
            }
        } else if (sum == 0){
            return 1;
        } else {
            while (sum < 0) {
                count += 1;
                sum /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
