public class revise_user_grading2 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] correctCount = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount[i]++;
                }
            }
        }

        for (int i = 0; i < answers.length; i++) {
            int highestScoreIndex = 0;
            for (int j = 0; j < answers.length; j++) {
                if (correctCount[j] < correctCount[highestScoreIndex]) {
                    highestScoreIndex = j;
                }
            }
            System.out.println("Student " + highestScoreIndex + "'s correct count is " +
                    correctCount[highestScoreIndex]);
            correctCount[highestScoreIndex] = 9;
        }
    }
}

//        Student 3's correct count is 4
//        Student 2's correct count is 5
//        Student 1's correct count is 6
//        Student 0's correct count is 7
//        Student 5's correct count is 7
//        Student 6's correct count is 7
//        Student 7's correct count is 7
//        Student 4's correct count is 8