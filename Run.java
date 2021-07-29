import java.util.Scanner;


public class Run
{
    public static void main(String []args)
    {
        int i,j,w = 1;
        int a=0;
        String name;
        String Wide;

        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number Of Over : ");
        a=in.nextInt();
        int  runPerOver[][]=new int[a][6];
        System.out.println("");
        System.out.println("TEAM A :");
        System.out.println("");
        for(i=0;i<a;i++)
        {

            for(j=0;j<6;j++)
            {


                System.out.print("Over: "+(i+1)+" and Ball: "+(j+1)+" : ");
                runPerOver[i][j]=in.nextInt();

            }

        }
        int totalRun=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<6;j++)
            {
                totalRun+=runPerOver[i][j];
            }
        }
        double average=totalRun/(double)runPerOver.length;
        System.out.println("");
        System.out.println("");
        System.out.println("Total Run : "+totalRun+"");
        System.out.println("Average Per Over :"+average+"");

        System.out.println("");
        System.out.println("TEAM B :");
        System.out.println("");
        for(i=0;i<a;i++)
        {

            for(j=0;j<6;j++)
            {


                System.out.print("Over: "+(i+1)+" and Ball: "+(j+1)+" : ");
                runPerOver[i][j]=in.nextInt();

            }

        }
        int totalRunB=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<6;j++)
            {
                totalRunB+=runPerOver[i][j];
            }
        }
        double averageB=totalRunB/(double)runPerOver.length;
        System.out.println("");
        System.out.println("");
        System.out.println("Total Run : "+totalRunB+"");
        System.out.println("Average Per Over :"+averageB+"");
        System.out.println("");
        System.out.println("");

        if(totalRun==totalRunB)
        {
            System.out.println("Team A and Team B Scores are Equals.");
        }
        else if(totalRun<totalRunB)
        {
            System.out.println("Team B Won By "+(totalRunB-totalRun)+" Runs.");
        }
        else
        {
            System.out.println("Team A Won By "+(totalRun-totalRunB)+" Runs.");
        }
    }
}

