package grade;

import org.junit.Assert;  
import org.junit.jupiter.api.Test;

class GradeTestWithBoundary {
	@Test
	public void testSmallXMax() {  
		Grade grade = new Grade();
		int score = -1;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'X', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * X ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testFMin() {  
		Grade grade = new Grade();
		int score = 0;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'F', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * F ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testFMax() {  
		Grade grade = new Grade();
		int score = 59;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'F', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * F ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testDMin() {  
		Grade grade = new Grade();
		int score = 60;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'D', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * D ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testDMax() {  
		Grade grade = new Grade();
		int score = 69;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'D', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * D ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testCMin() {  
		Grade grade = new Grade();
		int score = 70;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'C', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * C ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testCMax() {  
		Grade grade = new Grade();
		int score = 79;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'C', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * C ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testBMin() {  
		Grade grade = new Grade();
		int score = 80;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'B', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * B ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testBMax() {  
		Grade grade = new Grade();
		int score = 89;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'B', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * B ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testAMin() {  
		Grade grade = new Grade();
		int score = 90;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'A', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * A ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testAMax() {  
		Grade grade = new Grade();
		int score = 100;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'A', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * A ：期望值 
         * rank ：實際值 
         */  
    } 
	
	@Test
	public void testLargeXMin() {  
		Grade grade = new Grade();
		int score = 101;
        char rank = grade.letterGrade(score);  
        Assert.assertEquals("不為此區段", 'X', rank);  
        /* 
         * "不為此區段"：期望值和實際值不一致時，顯示的資訊 
         * X ：期望值 
         * rank ：實際值 
         */  
    } 
}
