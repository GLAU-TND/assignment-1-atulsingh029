package contactlist.main;
import contactlist.operational.Operational;
import contactlist.storage.LinkedList;
public class Main {
    public static void main(String[] args) {
        Operational operational=new Operational();
        LinkedList storage=new LinkedList();
        int input=operational.run();
        while(input!=5){
            switch (input){
                case 1:
                    storage.insert(operational.addNew());
                    input=operational.run();
                    break;
                case 2:
                    operational.view(storage);
                    input=operational.run();
                    break;
                case 3:
                    operational.search(storage);
                    input=operational.run();
                    break;
                case 4:
                    String[] x =storage.contactList();
                    if(x==null){
                        input=operational.run();
                        break;}
                    operational.deleteListView(storage,x);

                    input=operational.run();
                    break;
                default:
                    System.out.println("INVALID INPUT!\n"+"Try Again...\n\n");
                    input=operational.run();
            }
        }
    }
}
