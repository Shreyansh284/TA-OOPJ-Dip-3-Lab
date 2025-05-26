import java.util.Scanner;

class Candidate {
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;

    void GetCandidateDetails() {
        Scanner sc = new Scanner(System.in);
        Candidate_ID = sc.nextInt();
        sc.nextLine();
        Candidate_Name = sc.nextLine();
        Candidate_Age = sc.nextInt();
        Candidate_Weight = sc.nextDouble();
        Candidate_Height = sc.nextDouble();
    }

    void DisplayCandidateDetails() {
        System.out.println(Candidate_ID);
        System.out.println(Candidate_Name);
        System.out.println(Candidate_Age);
        System.out.println(Candidate_Weight);
        System.out.println(Candidate_Height);
    }
}

public class CandidatDetails {
    public static void main(String[] args) {
        Candidate c = new Candidate();
        c.GetCandidateDetails();
        c.DisplayCandidateDetails();
    }
}
