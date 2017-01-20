/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
