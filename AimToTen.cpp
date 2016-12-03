//Scenario, given a set of assignment grades and assuming every
//future assignment grade will be a 10(max points) find the
//minimum number of assignments needed to receive a final grade
//of 10, which would be given if the average is a 9.5 or above

#include<iostream>
#include<vector>
using namespace std;

class AimToTen
{
public:


int need(vector<int>marks)
{
        double sum=0;
		static int needed=0;


        for (int i=0;i<marks.size();++i)
        {
            sum=sum+marks[i];
        }

        double size=marks.size();
        double average=sum/size;

        if (average>=9.5)
        {
            return needed;
        }

        else
        {
            marks.push_back(10);
            ++needed;
            return need(marks);

        }
}


};

int main()
{

 vector<int>test={8,9}; //example set of current grades 8 and 9

AimToTen sample;

int required=sample.need(test); //minimum number of assignments needed to
                                //receive and average of 9.5 or above

cout<<required<<endl; //display result of example scenario

}


