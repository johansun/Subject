import java.util.Scanner;
public class Subject {
    public int i=0;
    public int j=0;
    public int[] scores = new int[10];
    String[] subjects = new String[5];
    String temp="";
    int indexPos =0;

    public static void main(String[] args) {

        Subject s1 = new Subject();
        System.out.println("Score:");

        //Add Scores to the Array
        s1.addScore(10);
        s1.addScore(20);
        s1.addScore(30);
        s1.addScore(40);
        s1.addScore(50);
        s1.addScore(60);
        s1.addScore(70);
        s1.addScore(80);
        s1.addScore(90);
        s1.addScore(100);

        //Add Subjects to the Array
        s1.addSubject("Maths");
        s1.addSubject("English");
        s1.addSubject("Physics");
        s1.addSubject("Chemistry");
        s1.addSubject("Biology");

        //insert number to the stack
        s1.addToStack(100);
        s1.addToStack(200);
        s1.addToStack(300);

        //display the stack
        s1.displayScore();

        s1.addToSortedArray("Nepali");

        s1.displaySubjects();

    }

    public void addScore(int score) {
        scores[i] = score;
        i++;
    }

    public void addSubject(String subject) {
        subjects[j] = subject;
        j++;
    }

    public void addToStack(int number) {
        for(int i=scores.length-1;i>0;i--) {
            scores[i]=scores[i-1];
        }
        scores[0]=number;
    }

    public void displayScore() {

        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
    }

    public void addToSortedArray(String subject ) {


        for (int i = 0; i < subjects.length; i++) {
            for (int j = 1; j < (subjects.length - i); j++) {

                if (  subjects[j - 1].compareTo(subjects[j])  > 0) {
                    temp = subjects[j - 1];
                    subjects[j - 1] = subjects[j];
                    subjects[j] = temp;
                }

            }
        }

        for (int i = 0; i < subjects.length; i++)
        {
            if (subject.equals(subjects[i]))
            {
                System.out.println("Subject already exists.");
                break;
            }
            else if(subject.compareTo(subjects[i])>0)
            {

               indexPos = i;

            }
        }


        for (int i = indexPos; i < subjects.length && indexPos+1<subjects.length; i++)
        {

            subjects[indexPos+1] = subjects[indexPos];
            subjects[indexPos]=subject;
        }


    }

    public void displaySubjects() {

        for(int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i]);
        }
    }
}