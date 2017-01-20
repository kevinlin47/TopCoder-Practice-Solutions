/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*A teacher has just corrected a set of exams, and the marks are terrible! 
He wants to make them higher, so he uses the following procedure to adjust the grades. 
Let mmax be the highest mark. Each mark m will be changed to m/mmax*100. 
For example, if the highest mark was 70 points, and you scored 50 points, your mark would become 50/70*100, which is approximately 71.43.
You will be given a marks.The ith element of marks is the mark received by the ith student. 
Compute the new marks for the students and return the average.
*/

/**
 *
 * @author Kevin Lin
 */
public class BadExam {
    
    public double newAverage (int[] marks)
    {   
        double highestMark=marks[0];
        double sum=0;
        double average=0;
        
        for (int i=1;i<marks.length;++i)
        {
            if (marks[i]>highestMark)
            {
                highestMark=marks[i];
            }
        }
        
        double tempMarks[]=new double[marks.length];
        
        for (int i=0;i<marks.length;++i)
        {
            tempMarks[i]=(marks[i]/highestMark)*100;
        }
        
        for (int i=0;i<tempMarks.length;++i)
        {
            sum=sum+tempMarks[i];
        }
        
        average=sum/marks.length;
        
        return average;
    }
}
