public class SubjectFunction {


    public void addToStack(String[] subjects, String subject)
    {
        for(int i=subjects.length-1;i>=0;i--)
        {
            subjects[i+1] = subjects[i];
        }
        subjects[0] = subject;
    }

    public void displayStack(String[] subjects)
    {
        for(int i=0;i<subjects.length;i++)
        {
            System.out.println(subjects[i]);
        }
    }
}
