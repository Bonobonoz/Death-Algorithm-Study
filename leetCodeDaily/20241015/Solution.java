import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minimumSteps(s));
    }

    static public long minimumSteps(String s) {
        long answer = 0;
        // 모든 검은색 공을 오른쪽으로, 모든 흰색 공을 왼쪽
        // 1은 검은색 공, 0은 흰색 공
        int blackCount = 0;  // 검은색 공의 값, 즉 '1'의 개수를 누적

        for (char c : s.toCharArray()) {
            // 만약 검은공을 만난다면
            if (c == '1') {
                blackCount++;  // 검은색 공이 카운트증가
            }
            // 만약 흰색공을 만났고 검은공이 카운트 되어있을때, 즉 스왑이 필요할때
            else if (c == '0' && blackCount > 0) {
                answer += blackCount;  // 검은공이 있는만큼 스왑이 필요함
            }
        }

        return answer;
    }
}