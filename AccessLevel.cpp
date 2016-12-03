//Scenario, each user has a certain access level, given a minimum permission value
//display if each person has access or denied access as "A" or "D".
//Example if minimum permission is 2 and users 1 through 6 have access level
//0, 1, 2, 3, 4, 5, 6 respectively then the output would be "DDAAAA"

#include<vector>
#include<string>
#include<iostream>

class AccessLevel
{
    public:
    std::string canAccess(std::vector<int> rights, int minPermission)
    {
            int minP=minPermission;
            std::vector<char> result(rights.size());

            for (int i=0;i<rights.size();++i)
            {
                if (rights[i]>=minP)
                    {
                        result[i]='A';
                    }
                if (rights[i]<minP)
                {
                   result[i]='D';
                }
            }

            std::string returnString(result.begin(),result.end());
            return returnString;
    }
};

int main()
{
    AccessLevel sample;

    int minPermission = 49; //example minimum access value

    std::vector<int>userLevels={34,78,9,52,11,1}; //example set of  6 users
                                                 // with corresponding access levels

    //display whether each user was given access or denied access
    std::cout<<sample.canAccess(userLevels,minPermission)<<std::endl;


}
