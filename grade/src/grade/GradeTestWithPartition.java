package grade;

import org.junit.Assert;  
import org.junit.jupiter.api.Test;

class GradeTestWithPartition {
	@Test
	public void testSmallX() {  
		Grade grade = new Grade();
		int score = -5;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'X', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * X �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testF() {  
		Grade grade = new Grade();
		int score = 30;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'F', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * F �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testD() {  
		Grade grade = new Grade();
		int score = 66;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'D', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * D �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testC() {  
		Grade grade = new Grade();
		int score = 72;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'C', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * C �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testB() {  
		Grade grade = new Grade();
		int score = 84;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'B', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * B �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testA() {  
		Grade grade = new Grade();
		int score = 99;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'A', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * A �G����� 
         * rank �G��ڭ� 
         */  
    } 
	
	@Test
	public void testLargeX() {  
		Grade grade = new Grade();
		int score = 200;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("�������Ϭq", 'X', rank);  
        /* 
         * "�������Ϭq"�G����ȩM��ڭȤ��@�P�ɡA��ܪ���T 
         * X �G����� 
         * rank �G��ڭ� 
         */  
    } 
}
