package OtherPractise.LeetCodeContest;

public class CalculateAmountPainInTax {
    public static void main(String[] args) {
        SolutionCalc s = new SolutionCalc();
//        int[][] brackets = {{3,50},{7,10},{12,25}};
        int[][] brackets = {{4,8},{5,49}};
        int income = 2;
        System.out.println(s.calculateTax(brackets,income));
    }
}


class SolutionCalc {
    public double calculateTax(int[][] brackets, int income) {
        if(income == 0) return 0.0;
        double total = 0;
        double first = 0;
        if(brackets[0][0] <= income){
            first = brackets[0][0] * brackets[0][1] / 100.00;
        }else{
            first = income * brackets[0][1] / 100.00;
            total +=  first;
            return  total;
        }
        total +=  first;
        for (int i = 1; i < brackets.length; i++) {
            if(brackets[i][0] <= income){
                double tax = (brackets[i][0] - brackets[i-1][0]) * brackets[i][1]/100.0;
                total += tax;
            }else{
                double last = (income - brackets[i-1][0]) * brackets[i][1]/100.0;
                total += last;
                break;
            }
        }

        return total;
    }
}