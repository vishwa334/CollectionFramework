//package Collection.ArrayObject;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BufferReader {
////    public BufferReader(InputStreamReader inputStreamReader) {
////    }
//
//    public static void main(String[] args) throws Exception {
//        List<Employee> list=new ArrayList<Employee>();
//        BufferedReader br=null;
//        try {
//            br=new BufferReader(new InputStreamReader(System.in));
//            while (true) {
//                System.out.println("enter emp details: ");
//                System.out.print("Sr. No.:-");
//                int ids = Integer.parseInt(br.readLine());
//                System.out.print("Name:-");
//                String name = br.readLine();
//                System.out.print("Salary:-");
//                Double salary = Double.parseDouble(br.readLine());
//                Employee e = new Employee(ids, name, salary);
//                list.add(e);
//
//                System.out.println("enter the choice you add detail yes or no:- ");
//                String choice = br.readLine();
//                if (choice.equals("no")) {
//                    break;
//                }
//            }
//            for (Employee e :list){
//                System.out.println(e.ids+" "+e.name+" "+e.salary);
//            }
//
//        }
//        finally {
//            if(br!=null){
//                br.close();
//            }
//        }
//    }
//}
