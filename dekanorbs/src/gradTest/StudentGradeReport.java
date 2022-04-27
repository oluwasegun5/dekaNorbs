package gradTest;

public class StudentGradeReport {
    int[][] grade;
    int[] position;

    public StudentGradeReport(int[][] grades) {
        this.grade = grades;
        position = new int[grades.length];
    }

    public int getSumForStudentReport(int index) {
        int result = 0;
        for (int i = 0; i < grade[index].length; i++) {
            result += grade[index][i];
        }
        return result;
    }

    public int getSumForClassReport(int index) {
        int sum = 0;
        for (int[] ints : grade) {
            sum += ints[index];
        }
        return sum;
    }

    public double getAverageForStudentReport(int index) {
        return (double) getSumForStudentReport(index)/(double)grade[index].length;
    }

    public int getStudentPosition(int index) {
        int[] scores = new int[grade.length];

        for (int i = 0; i < grade.length; i++) {
            scores[i]=getSumForStudentReport(i);
        }
        return 0;
    }

    public int getTotalScore() {
        int total = 0;
        for (int[] ints : grade) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }
}
