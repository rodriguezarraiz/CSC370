#include <iostream>
#include <string>
#include <vector>

class Settlement {
	public:
	
	template < typename T > static T input() {
		T value;
		std::cin >> value;
		return value;
	}
};
class RunLengthEncode
{
    public:
    static std::string JorgeSubmission(std::string submission)
    {
        StringBuilder variable =  new StringBuilder();
        int tally = 1;
        for (int a = 1; a < submission.length(); a++)
        {
            if (submission[a] == submission[a - 1])
            {
                tally++;
            }
            else 
            {
                if (tally < 4)
                {
                    variable.append("/");
                    if (tally < 10)
                    {
                        variable.append("0");
                    }
                    variable.append(tally);
                    variable.append(submission[a - 1]);
                }
                else 
                {
                    for (int b = 0; b < tally; b++)
                    {
                        variable.append(submission[a - 1]);
                    }
                }
                tally = 1;
            }
        }
        if (tally > 4)
        {
            variable.append("/");
            if (tally < 10)
            {
                variable.append("0");
            }
            variable.append(tally);
            variable.append(submission[submission.length() - 1]);
        }
        else 
        {
            for (int c = 0; c < tally; c++)
            {
                variable.append(submission[submission.length() - 1]);
            }
        }
        return variable.toString();
    }
    // *
    //     * @param args the command line arguments
    static void main(std::vector<std::string> &args)
    {
        // TODO code application logic here
        
        std::cout << "Enter here:" << std::endl;
        std::string man = Settlement::input<std::string>();
        std::cout << RunLengthEncode::JorgeSubmission(man) << std::endl;
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	RunLengthEncode::main(parameter); 
	return 0;
};
