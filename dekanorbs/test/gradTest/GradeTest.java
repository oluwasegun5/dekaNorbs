package gradTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {

    @Test
    public void testForStudentReport(){
        int[][] grades = {{30,70,50},{20,60,20}};

        StudentGradeReport report = new StudentGradeReport(grades);

        assertEquals(150,report.getSumForStudentReport(0));

        assertEquals(100,report.getSumForStudentReport(1));
    }
    @Test
    public void testForClassReport(){
        int[][] grades = {{30,70,50},{20,60,20},{80,5,5}};

        StudentGradeReport report = new StudentGradeReport(grades);

        int result = report.getSumForClassReport(2);
        assertEquals(75,result);
        result = report.getSumForClassReport(1);
        assertEquals(135,result);
    }
    @Test
    public void testForStudentAverage(){
        int[][] grades = {{4,5,6,3},{20,20,20},{80,5,15}};

        StudentGradeReport report = new StudentGradeReport(grades);

        assertEquals(4.5,report.getAverageForStudentReport(0));

        assertEquals(20,report.getAverageForStudentReport(1));
    }
    @Test
    public void testForStudentPosition(){
        int[][] grades = {{30,70,50},{20,60,20},{80,5,5}};

        StudentGradeReport report = new StudentGradeReport(grades);

        assertEquals(1, report.getStudentPosition(0));
    }
    @Test
    public void testForStudentTotal(){
        int[][] grades = {{30,70,50},
                          {20,60,20},
                          {80,5,5}};

        StudentGradeReport report = new StudentGradeReport(grades);

        assertEquals(340, report.getTotalScore());
    }

}
