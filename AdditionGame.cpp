//Scenario, given three numbers and x number of turns calculate the maximum number
//of points that could be earned, if each time a number is selected the number is
//reduced by one if the number is greater than 0
//for example if the three numbers are 3, 4, 5 and you have 3 moves the answer would
//be 13 because you would pick 5, then have 3, 4, 4. You would then pick 4, which
//leads to 3, 3, 4, and finally for your last turn you would pick 4, and the final set
//of numbers would be 3, 3, 3, and adding 5+4+4=13.

#include<iostream>

class AdditionGame
{
    public:
    int getMaximumPoints(int A, int B, int C, int N);
};

int AdditionGame::getMaximumPoints(int A, int B,int C,int N)
{
    int a=A;
    int b=B;
    int c=C;
    int sum=0;
    int biggest=a;

    for (int i=0;i<N;++i)
    {

        biggest=a;
        if (biggest<=b)
        {
            biggest=b;
        }
        if (biggest<=c)
        {
            biggest=c;
        }
        sum=sum+biggest;
        if (biggest==a)
        {
            --a;
        }
        else if (biggest==b)
        {
            --b;
        }
        else if (biggest==c)
        {
            --c;
        }
        if (a<1 && b<1 && c<1)
        {
            return sum;
        }
    }
    return sum;
}

int main()
{
    AdditionGame sample;

    //example using the numbers 8, 2, 6 with 13 moves
    int maximumPoints=sample.getMaximumPoints(8,2,6,13);

    //display maximum amount of points possible
    std::cout<<maximumPoints<<std::endl;
}
