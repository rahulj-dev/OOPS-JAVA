import java.util.*;
class arrayList{

    Scanner s1=new Scanner(System.in);
    ArrayList<String> al = new ArrayList<String>();
    void append()
    {

        System.out.println("Enter the string to be append :");
        al.add(s1.next());
        System.out.println(al);

    }

    void insert(){

                System.out.println("Enter the index position :");
        int pos=s1.nextInt();
                System.out.println("Enter the string to be append :");
        al.add(pos,s1.next());

    }

    void search(){

                System.out.println("Enter the string to be search :");
        String search=s1.next();
        String info=al.contains(search)?"Yes, is found":"No, is not found";
                System.out.println(info);

    }

    void list(){

                System.out.println("Enter the letter to be list out :");
        String s=s1.next();
        for(int i=0;i<al.size();i++)
        {

            if(al.get(i).startsWith(s))
                System.out.println(al.get(i));

        }
    }

    void disp(){

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}

class main{

    public static void main(String args[])
    {

        arrayList al=new arrayList();
        Scanner s=new Scanner(System.in);
                System.out.println("Enter your choice\n1.Append\n2.Insert\n3.Search\n4.List the string(Specific letter)\n5.Display\n6.Exit");
                int choice=s.nextInt();
                while(choice<6){

        switch (choice) {

            case 1:

                al.append();

                break;

            case 2:

                al.insert();

                break;

            case 3:

                al.search();

                break;

            case 4:

                al.list();

                break;

            case 5:

                al.disp();

                break;

        }

                System.out.println("Enter your choice\n1.Append\n2.Insert\n3.Search\n4.List the string(Specific letter)\n5.Display\n");
                choice=s.nextInt();

                }

    }

}
