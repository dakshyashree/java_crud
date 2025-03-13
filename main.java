import java.util.*;
class Employee{
    private int empno;
    private String ename;
    private int salary;
    Employee(int empno,String ename, int salary){
        this.empno = empno;
        this.ename =ename;
        this.salary =salary;
    }
    public int getEmpno(){
        return  empno;
    }
    public int getSalary(){
        return salary;
    }
    public String getEname(){
        return ename;
    }
    public String toString(){
        return empno+" "+ename+" "+ salary;
    }
}
class CRUDemo{
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Collection<Employee> c = new ArrayList<Employee>();
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter empno:");
                    int emo = sc.nextInt();
                    System.out.print("Enter EmpName:");
                    String ename = sc1.nextLine();
                    System.out.print("Enter Salary:");
                    int salary = sc.nextInt();
                    c.add(new Employee(eno,ename,salary));
                    break;
                case 2:
                    System.out.println("---------------------------------------");
                    Iterator i =c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 3:

                    break;
            }
        }while(ch!=0);
    }
}