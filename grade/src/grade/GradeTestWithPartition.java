package grade;

import org.junit.Assert;  
import org.junit.jupiter.api.Test;

class GradeTestWithPartition {
	@Test
	public void testSmallX() {  
		Grade grade = new Grade();
		int score = -5;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'X', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * X ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testF() {  
		Grade grade = new Grade();
		int score = 30;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'F', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * F ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testD() {  
		Grade grade = new Grade();
		int score = 66;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'D', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * D ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testC() {  
		Grade grade = new Grade();
		int score = 72;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'C', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * C ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testB() {  
		Grade grade = new Grade();
		int score = 84;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'B', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * B ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testA() {  
		Grade grade = new Grade();
		int score = 99;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'A', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * A ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testLargeX() {  
		Grade grade = new Grade();
		int score = 200;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'X', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * X ：期望值 
         * rank ：實際值 
         */  
    } 
}
