#include<iostream>
#include<string>

//A string of zeros and ones is called an alternating string if no two adjacent characters are the same. Examples of alternating strings: "1", "10101", "0101010101".
//You are given a s. Each character of s is a '0' or a '1'. Please find the longest contiguous substring of s that is an alternating string. Return the length of that substring.
//Example: "111101111"
//Returns: 3
//Among all substrings, there are 5 different alternating strings: "1", "0", "10", "01", "101". The one with maximal length is "101" and the length is 3.


class AlternatingString
{

    int longestString=0;
    int tempLongestString=0;

public:
    int maxLength(std::string s)
    {


        if (s.length()==1)
        {
            return 1;
        }

        for (int i=0;i<s.length()-1;++i)
        {
            for (int j=i;j<s.length();++j)
            {
                if (s[j]==s[j+1])
                {
                    ++tempLongestString;
                    break;
                }
                else
                {
                    ++tempLongestString;
                }
            }

            if (tempLongestString>longestString)
            {
                longestString=tempLongestString;
            }

            tempLongestString=0;
        }

        return longestString;
    }

};

int main()
{
    AlternatingString stringS;
    std::cout<<stringS.maxLength("1011011110101010010101");

    return 0;
}
