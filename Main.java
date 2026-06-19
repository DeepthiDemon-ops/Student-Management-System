    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            ArrayList<Student> students = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("\n1.Add Student");
                System.out.println("2.View Students");
                System.out.println("3.Search Student");
                System.out.println("4.Delete Student");
                System.out.println("5.Exit");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        students.add(new Student(id, name));
                        System.out.println("Added");
                        break;

                    case 2:
                        for (Student s : students) {
                            System.out.println(s);
                        }
                        break;

                    case 3:

                            System.out.print("Enter ID to Search: ");
                            int searchId = sc.nextInt();

                            boolean found = false;

                            for(Student s : students) {

                                if(s.id == searchId) {
                                    System.out.println(s);
                                    found = true;
                                    break;
                                }
                            }

                            if(!found) {
                                System.out.println("Student Not Found");
                            }

                            break;
                            case 4:

                            System.out.print("Enter ID to Delete: ");
                            int deleteId = sc.nextInt();

                            boolean removed = students.removeIf(s -> s.id == deleteId);

                            if(removed) {
                                System.out.println("Student Deleted Successfully");
                            } else {
                                System.out.println("Student Not Found");
                            }

                            break;  
                            case 5:
                            System.out.println("Thank You");
                            return;
                                    }
                                }
                            }
                        }