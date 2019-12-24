package grade;

import org.junit.Assert;  
import org.junit.jupiter.api.Test;

class GradeTestWithBoundary {
	@Test
	public void testSmallXMax() {  
		Grade grade = new Grade();
		int score = -1;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'X', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * X �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testFMin() {  
		Grade grade = new Grade();
		int score = 0;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'F', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * F �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testFMax() {  
		Grade grade = new Grade();
		int score = 59;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'F', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * F �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testDMin() {  
		Grade grade = new Grade();
		int score = 60;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'D', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * D �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testDMax() {  
		Grade grade = new Grade();
		int score = 69;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'D', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * D �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testCMin() {  
		Grade grade = new Grade();
		int score = 70;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'C', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * C �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testCMax() {  
		Grade grade = new Grade();
		int score = 79;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'C', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * C �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testBMin() {  
		Grade grade = new Grade();
		int score = 80;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'B', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * B �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testBMax() {  
		Grade grade = new Grade();
		int score = 89;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'B', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * B �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testAMin() {  
		Grade grade = new Grade();
		int score = 90;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'A', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * A �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testAMax() {  
		Grade grade = new Grade();
		int score = 100;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'A', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * A �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testLargeXMin() {  
		Grade grade = new Grade();
		int score = 101;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'X', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * X �G����� 
         * rank �G��ڭ� 
         */  
    } 
}
