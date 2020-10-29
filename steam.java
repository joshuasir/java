import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.time.LocalDate;
import java.time.Month;
public class steam {
    //private static Vector<Vector> Game = new Vector<>();
    private Vector<Integer> GameID= new Vector<>();
    private Vector<Integer> GamemakerID= new Vector<>();
    private Vector<Integer> Size= new Vector<>();
    private Vector<String> Name= new Vector<>();
    private Vector<String> Desc= new Vector<>();
    
    private Vector<Integer> UserID=new Vector<>();
    private Vector<String> username=new Vector<>();
    private Vector<String> password=new Vector<>();
    private Vector<String> nameuser=new Vector<>();
    private static String format3="%-5s %-30s %-10s %-20s %-10s %-10s\n";
    private static String format2="%-10s %-10s\n";
    private Vector<Vector<String>> StatGame = new Vector<>();
    private Vector<Vector<LocalDate>> DateGame = new Vector<>();
    private Vector<Integer> speed=new Vector<>();
    public void init(){
        
        incrementGame(2,"Fly Guyz","Have fun with fly guyz here, Remember to try not to Fly out from the arena.",154062);
        incrementGame(3,"Popper Tower 6","Beware of the Ultimate number of Balloons. Build your tower and POP the balloon.",278648);
        incrementGame(2,"Lavorant","Number one best FPS Game for PC. Each Character has a unique Technique.",8354715);
        incrementGame(1,"Symmetry Dash","Jump and avoid all the obstacles to reach the finish line.",654813);
        incrementGame(1,"Welcome to World","Try to enter the Dark Web? Beware watch your surrounding!",1354721);
        incrementGame(3,"Monster Hunting Ground","World Wide MMORPG. A world with many monsters.",803648148);
        incrementGame(2,"Pocket Rancher","Raise and Breed our Magical Creature.",486484);
        incrementGame(3,"Dame Dame Shop","Simple and Relax Game. Build your Shop.",972456);
        incrementGame(1,"Pekamon","Have your own Pekamon and reach Four Elite.",384615);
        //incrementId("admin", "admin", "USER0");
        incrementId("Orchard123","Snowman1234", "Olaf");
        incrementId("Island954","Boat1234", "Moana");
        incrementId("LittlePrincess54","Castle1234", "Elsa");
        incrementId("IceQueen1","Freeze1234", "Anna");
        incrementId("Reindeer687","Christ1234", "Rudolf");
        for(int i=0;i<=UserID.size();i++){
            DateGame.add(new Vector<LocalDate>());
            speed.add(20000);
        StatGame.add(new Vector<String>());
            for(int j=0;j<=GameID.size();j++){
                StatGame.get(i).add("Available");
                DateGame.get(i).add(null);
            
    }}
        for(int i=0;i<UserID.size();i++){
            
            if(UserID.get(i)==2){
                StatGame.get(UserID.get(i)-1).set(GameID.indexOf(3), "Downloaded");
            }
            else if(UserID.get(i)==1){
                StatGame.get(UserID.get(i)-1).set(GameID.indexOf(4), "Downloaded");
                StatGame.get(UserID.get(i)-1).set(GameID.indexOf(1), "Downloaded");
            }
            else if(UserID.get(i)==4){
                StatGame.get(UserID.get(i)-1).set(GameID.indexOf(2), "Downloaded");
            }
            else if(UserID.get(i)==3){
                StatGame.get(UserID.get(i)-1).set(GameID.indexOf(5), "Downloaded");
            }
        }
        for(int i=0;i<UserID.size();i++){
            
            if(UserID.get(i)==2){
                DateGame.get(UserID.get(i)-1).set(GameID.indexOf(3), LocalDate.of(2005,Month.APRIL,15));
            }
            if(UserID.get(i)==1){
                DateGame.get(UserID.get(i)-1).set(GameID.indexOf(4), LocalDate.of(2006,Month.JANUARY,9));
                DateGame.get(UserID.get(i)-1).set(GameID.indexOf(1), LocalDate.of(2012,Month.JUNE,12));
            }
            if(UserID.get(i)==4){
                DateGame.get(UserID.get(i)-1).set(GameID.indexOf(1), LocalDate.of(2004,Month.APRIL,4));
            }
            if(UserID.get(i)==3){
                DateGame.get(UserID.get(i)-1).set(GameID.indexOf(5), LocalDate.of(2009,Month.MARCH,23));
            }
        }
        for(int i=0;i<UserID.size();i++){
            
             
                    if(DateGame.get(i).get(GameID.indexOf(1))==null||DateGame.get(i).get(GameID.indexOf(1)).isBefore(LocalDate.of(2003,Month.JULY,6))){
                        DateGame.get(i).set(GameID.indexOf(1), LocalDate.of(2001,Month.JANUARY,9));
                        StatGame.get(i).set(GameID.indexOf(1), "Update");
                    }
                               
                    if(DateGame.get(i).get(GameID.indexOf(2))==null||DateGame.get(i).get(GameID.indexOf(2)).isBefore(LocalDate.of(2003,Month.JULY,6))){
                        DateGame.get(i).set(GameID.indexOf(2), LocalDate.of(2003,Month.JULY,6));
                        StatGame.get(i).set(GameID.indexOf(2), "Update");
                    }
                
            
                    if(DateGame.get(i).get(GameID.indexOf(3))==null||DateGame.get(i).get(GameID.indexOf(3)).isBefore( LocalDate.of(2009,Month.JULY,14))){
                        DateGame.get(i).set(GameID.indexOf(3), LocalDate.of(2009,Month.JULY,14));
                        StatGame.get(i).set(GameID.indexOf(3), "Update");
                    }
                
                
                    if(DateGame.get(i).get(GameID.indexOf(4))==null||DateGame.get(i).get(GameID.indexOf(4)).isBefore( LocalDate.of(2006,Month.SEPTEMBER,18))){
                        DateGame.get(i).set(GameID.indexOf(4), LocalDate.of(2006,Month.SEPTEMBER,18));
                        StatGame.get(i).set(GameID.indexOf(4), "Update");
                    }
               
                    if(DateGame.get(i).get(GameID.indexOf(5))==null||DateGame.get(i).get(GameID.indexOf(5)).isBefore(LocalDate.of(2007,Month.NOVEMBER,16))){
                        DateGame.get(i).set(GameID.indexOf(5), LocalDate.of(2007,Month.NOVEMBER,16));
                        StatGame.get(i).set(GameID.indexOf(5), "Update");
                    }
                
         
                    if(DateGame.get(i).get(GameID.indexOf(6))==null||DateGame.get(i).get(GameID.indexOf(6)).isBefore(LocalDate.of(2008,Month.NOVEMBER,24))){
                        DateGame.get(i).set(GameID.indexOf(6), LocalDate.of(2008,Month.NOVEMBER,24));
                        StatGame.get(i).set(GameID.indexOf(6), "Update");
                    }
      
                    if(DateGame.get(i).get(GameID.indexOf(7))==null||DateGame.get(i).get(GameID.indexOf(7)).isBefore(LocalDate.of(2010,Month.DECEMBER,13))){
                        DateGame.get(i).set(GameID.indexOf(7), LocalDate.of(2010,Month.DECEMBER,13));
                        StatGame.get(i).set(GameID.indexOf(7), "Update");
                    }
                
                
                    if(DateGame.get(i).get(GameID.indexOf(8))==null||DateGame.get(i).get(GameID.indexOf(8)).isBefore(LocalDate.of(2010,Month.DECEMBER,23))){
                        DateGame.get(i).set(GameID.indexOf(8), LocalDate.of(2010,Month.DECEMBER,23));
                        StatGame.get(i).set(GameID.indexOf(8), "Update");
                    }
               
                    if(DateGame.get(i).get(GameID.indexOf(9))==null||DateGame.get(i).get(GameID.indexOf(9)).isBefore(LocalDate.of(2011,Month.JANUARY,26))){
                        DateGame.get(i).set(GameID.indexOf(9), LocalDate.of(2011,Month.JANUARY,26));
                        StatGame.get(i).set(GameID.indexOf(9), "Update");
                    }
                
            
                }
        
    }
        public static void main(String[] args){
        steam initdata=new steam(); //buat object, mau manggil non static
        initdata.init(); //cara manggil non static dalam static
        Scanner scan= new Scanner(System.in);
        Random rand=new Random();
        Integer choose=null,back=0,page=0;
        while(true){
        System.out.println("Start Page\n===============\n1. Login\n2. Register\n0. Exit\n>>");
        try {
            choose=scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid!\n");
            scan.nextLine();
            continue;
        }
        scan.nextLine();
        if(choose==1){
            Integer cookie=null;
            while(true){
            String logname=null,logpass=null;
            System.out.println("Login Page\n===========\nInput your username (type Exit to close): ");
            logname=scan.nextLine();
            if(logname.equals("Exit")){
                back=1;
                break;
            }
            System.out.println("Input your password: ");
            logpass=scan.nextLine();
            if(logpass.equals("Exit")){
                back=1;
                break;
            }
            if(!initdata.username.contains(logname)||!initdata.password.contains(logpass)){
                System.out.println("incorect name/password");
                scan.nextLine();
            }else{
                cookie=initdata.username.indexOf(logname);
                System.out.println("success Login");
                scan.nextLine();
                break;
            }
            }
            if(back==1){
                back=0;
                continue;
            }
            String format1= "| %-10s | %-30s | %-20s |\n";Integer data=0;
            while(true){
            System.out.printf("Welcome %s [%s]\n=================\n1. Add Game\n2. Update Game\n3. Delete Game\n4. Download Game\n5. Update Profile\n6. Change Speed Download\n0.Logout\n>>",initdata.nameuser.get(cookie),initdata.username.get(cookie));
            try {
                choose=scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid!\n");
            }
            scan.nextLine();
            switch(choose){
                case 1:
                while(true){
                String addGame=null,adddesc=null;
                Integer addSize=null;
                System.out.println("Input Game Name [At least 6 character, Must be unique | Exit]:");
                addGame=scan.nextLine();
                if(addGame.equals("Exit")){
                    break;
                }else if(addGame.length()<6||initdata.Name.contains(addGame)){
                    System.out.println("Invalid!");
                    scan.nextLine();
                    continue;
                }
                System.out.println("Input Game Description [ 10 - 100 character ]:");
                adddesc=scan.nextLine();
                if(adddesc.equals("Exit")){
                    break;
                }else if(adddesc.length()<10||adddesc.length()>100){
                    System.out.println("Invalid!");
                    scan.nextLine();
                    continue;
                }
                System.out.println("Input Game Size [ 1 - 314572600 kb (kiloByte), without kB ]:");
        
                try {
                    addSize=scan.nextInt();
                } catch (Exception e) {
                    String exitcheck=null;
                    exitcheck=addSize.toString();
                    if(exitcheck.equals("Exit")){
                        break;
                    }
                }
                scan.nextLine();
                System.out.println("Game has been added!");
                scan.nextLine();
                
                Integer loc=initdata.incrementGame(initdata.UserID.get(cookie), addGame, adddesc, addSize);
                for(int i=0;i<initdata.UserID.size();i++){
                    initdata.StatGame.get(i).add(loc,"Available");
                    initdata.DateGame.get(i).add(loc,LocalDate.now());
                
                }
                
                break;
               }
                break;
                case 2:
                while(true){
                data=0;
                for (int i=0;i<initdata.GameID.size();i++){
                    if(initdata.GamemakerID.get(i)==initdata.UserID.get(cookie)){
                        if(data==0){
                            //System.out.println("=============================================");
                            System.out.format(format1, "Id.","Name","Size");
                            //System.out.println("=============================================");
                        }
                        System.out.format(format1, initdata.GameID.get(i),initdata.Name.get(i),initdata.Size.get(i));
                        data=1;
                        //System.out.println("=============================================");
                    }
                }
                if(data==0){
                    System.out.println("No Data!!");
                    break;
                }
               
                System.out.println("Input Game Id [0 to exit]:");
                try {
                    choose=scan.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid!\n");
                    scan.nextLine();
                    continue;
                }
                scan.nextLine();
                if(choose==0){
                    break;
                }
                if(initdata.GamemakerID.get(initdata.GameID.indexOf(choose))==initdata.UserID.get(cookie)){
                String updGame=null,upddesc=null;
                Integer updSize=null;
                System.out.println("Input Game Name [At least 6 character, Must be unique | Exit]:");
                updGame=scan.nextLine();
                if(updGame.equals("Exit")){
                    break;
                }else if(updGame.length()<6||(initdata.Name.contains(updGame)&&initdata.Name.get(initdata.GameID.indexOf(choose))!=updGame)){
                    System.out.println("Invalid!");
                    scan.nextLine();
                    continue;
                }
                System.out.println("Input Game Description [ 10 - 100 character ]:");
                upddesc=scan.nextLine();
                 if(upddesc.equals("Exit")){
                    break;
                }
                if(upddesc.length()<10||upddesc.length()>100){
                    System.out.println("Invalid!");
                    scan.nextLine();
                    continue;
                }
                System.out.println("Input Game Size [ 1 - 314572600 kb (kiloByte), without kB ]:");
        
                try {
                    updSize=scan.nextInt();
                } catch (Exception e) {
                    String exitcheck=null;
                    if(updSize!=null){
                    exitcheck=updSize.toString();
                    if(exitcheck.equals("Exit")){
                        break;
                    }}
                }
                scan.nextLine();
                System.out.printf("Game with id %d has been updated!",choose);
                initdata.Name.set(initdata.GameID.indexOf(choose), updGame);
                initdata.Desc.set(initdata.GameID.indexOf(choose),upddesc);
                initdata.Size.set(initdata.GameID.indexOf(choose), updSize);
                for(int i=0;i<initdata.UserID.size();i++){
                    initdata.StatGame.get(i).set(initdata.GameID.indexOf(choose), "Update");
                    initdata.DateGame.get(i).set(initdata.GameID.indexOf(choose), LocalDate.now());
                }
                scan.nextLine();
                continue; 
               
                }else{
                    
                    System.out.println("Invalid!\n");
                    scan.nextLine();
                }

                
            }
                break;
                case 3:
                
                //String format2="%-5s %-20s %-10s %-10s %-10s %-10s";
                while(true){
                data=0;
                for (int i=0;i<initdata.GamemakerID.size();i++){
                    if(initdata.GamemakerID.get(i)==initdata.UserID.get(cookie)){
                        if(data==0){
                            //System.out.println("=============================================");
                            System.out.format(format1, "Id.","Name","Size");
                            //System.out.println("=============================================");
                        }
                        System.out.format(format1, initdata.GameID.get(i),initdata.Name.get(i),initdata.Size.get(i));
                        data=1;}
                        //System.out.println("=============================================");
                    
                }
                if(data==0){
                    System.out.println("No Data!!");
                    break;
                }
                
                System.out.println("Input Game Id [0 to exit]:");
                try {
                    choose=scan.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid!\n");
                    scan.nextLine();
                    continue;
                }
                scan.nextLine();
                if(choose==0){
                    break;
                }
                try {
                    
                
                if(initdata.GamemakerID.get(initdata.GameID.indexOf(choose))==initdata.UserID.get(cookie)){
                    System.out.printf("Game with id %d has been deleted\n",choose);
                    scan.nextLine();
                    
                    //System.out.println((int)initdata.GameID.indexOf(choose));
                    for(int i=0;i<initdata.UserID.size();i++){
                        
                     initdata.StatGame.get(i).removeElementAt((int)initdata.GameID.indexOf(choose));
                     initdata.DateGame.get(i).removeElementAt((int)initdata.GameID.indexOf(choose));
    
                }
                initdata.removeGame(initdata.GameID.indexOf(choose));
                    continue;
                }else{
                    
                    System.out.println("Invalid!\n");
                    scan.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Invalid!\n");
                    scan.nextLine();
            }
                
            }
                break;
                case 4:
                page=0;
                while(true){
                System.out.println("1. Sort by Name\n2. Sort by The Newest\n3. Sort by Size\n0. Exit");
                try {
                    choose=scan.nextInt();
                } catch (Exception e) {
                    System.out.print("Invalid");
                }
                scan.nextLine();
                if(choose>=0&&choose<4){
                    break;
                }
            }   
            Integer flag=0;
            while(true){
                if(initdata.GameID.size()==0){
                    System.out.print("No Data!");
                    break;
                }else if(choose==1){
                    initdata.sortbyname(cookie,page);
                }else if(choose==2){
                    initdata.sortbynewest(cookie,page);
                }else if(choose==3){
                    initdata.sortbysize(cookie,page);
                }else{
                    if(choose!=0){
                    System.out.println("Invalid!");}
                    break;
                }
                String action=null;
                Integer id=null;
                if(flag==0){
                System.out.print("Input your action [View (id) | Download (id) | Next | Exit]: ");}else{
                    System.out.print("Input your action [View (id) | Download (id) | Prev | Exit]: ");
                }
                action=scan.next();
                if(action.contains("View")){
                    String viemat="%-20s : %-20s\n";
                    try {
                        id=scan.nextInt();
                    } catch (Exception e) {
                        System.out.println("Not Available");
                    }
                    scan.nextLine();
                    if(initdata.GameID.contains(id)){
                    System.out.printf(viemat,"Name",initdata.Name.get(initdata.GameID.indexOf(id)));
                    System.out.printf(viemat,"Creator",initdata.username.get(initdata.UserID.indexOf(initdata.GamemakerID.get(initdata.GameID.indexOf(id)))));
                    System.out.printf(viemat,"Description",initdata.Desc.get(initdata.GameID.indexOf(id)));
                    System.out.printf(viemat,"Size",initdata.Size.get(initdata.GameID.indexOf(id)));
                    System.out.print("Press enter to continue...\n");
                    scan.nextLine();}else{
                        System.out.println("Couldn't find that id !!");
                    }
                }else if(action.contains("Download")){
                    try {
                        id=scan.nextInt();
                    } catch (Exception e) {
                        System.out.println("Not Available");
                    }
                    if(initdata.GameID.contains(id)){
                        if(initdata.StatGame.get((initdata.UserID.get(cookie))-1).get(initdata.GameID.indexOf(id)).equals("Downloaded")){
                            System.out.println("Already Downloaded");
                        }else{
                            double load=0;Integer prog=0,gress=0;
                            while(prog<initdata.Size.get(initdata.GameID.indexOf(id))){
                                gress=rand.nextInt(initdata.speed.get(cookie));
                                if(prog+gress>initdata.Size.get(initdata.GameID.indexOf(id))){
                                    prog=initdata.Size.get(initdata.GameID.indexOf(id));
                                    load=100;
                                }else{
                                    prog+=gress;
                                    load=(double)((double)prog/(double)initdata.Size.get(initdata.GameID.indexOf(id)));
                                }
                            System.out.printf("Downloading...%.2f %%\nProgress: %d/%d\n",load,prog,initdata.Size.get(initdata.GameID.indexOf(id)));
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                                //TODO: handle exception
                            }    
                            
                        }
                        initdata.StatGame.get((initdata.UserID.get(cookie))-1).set(initdata.GameID.indexOf(id),"Downloaded");
    
                    }
                        }else{
                            System.out.println("Couldn't find that id !!");
                }
                }else if(action.equals("Exit")){
                    break;
                }else if(action.equals("Next")){
                    if(page+6<initdata.GameID.size()){
                        page+=6;
                        //System.out.println(page);
                    }else{System.out.println("Already last page");
                    flag=1;
                    }
                    
                }else if(action.equals("Prev")){
                    if(page>=6){
                        page-=6;
                    }else{System.out.println("Already first page");
                    flag=0;
                    }
                    
                }else{
                    System.out.println("Invalid!");
                    scan.nextLine();
                }
            }
                break;
                case 5:
                while(true){
                System.out.printf(format2,"Login as"," ");
                System.out.printf(format2,"Name",initdata.nameuser.get(cookie));
                System.out.printf(format2,"Username",initdata.username.get(cookie));
                System.out.println("1. Update Data\n2. Change Password\n0. Exit");
                try {
                    choose=scan.nextInt();
                    
                    
                } catch (Exception e) {
                    System.out.println("Invalid!");
                }
                scan.nextLine();
                if(choose==0){
                    break;
                }else if(choose==1){
                    String newname=null;
                    Integer alph=0;
                    System.out.print("Input your Name\n[At least 4 Characters, Alphabet only]:");
                    newname=scan.nextLine();
                    for(int i=0;i<newname.length();i++){
                        if((newname.charAt(i)<'A')||(newname.charAt(i)>'Z'&&newname.charAt(i)<'a')||(newname.charAt(i)>'z')){
                            alph=1;
                            break;
                        }
                    }
                   if(newname.length()<4){
                    System.out.println("atleast 4 characters!");
                    scan.nextLine();
                    }else if(alph==1){
                        System.out.println("must be alphabet!");
                        scan.nextLine();
                    }else{
                        initdata.nameuser.set(cookie, newname);
                        System.out.println("successfully changed!");
                        scan.nextLine();
                        break;
                    }
                }else if(choose==2){
                    while(true){
                    String newpass=null,renewpass=null,oldpass=null;
                    Integer alphnum=0;
                    System.out.print("Input your Password [Exit]:");
                    oldpass=scan.nextLine();
                    if(oldpass.equals("Exit")){
                        break;
                    }else if(initdata.password.get(cookie).equals(oldpass)){
                        System.out.print("Input your New Password \n[At least 8 Characters, Alphanumeric]:");
                        newpass=scan.nextLine();
                        for(int i=0;i<newpass.length();i++){
                            if(newpass.charAt(i)<'0'||(newpass.charAt(i)>'9'&&newpass.charAt(i)<'A')||(newpass.charAt(i)>'Z'&&newpass.charAt(i)<'a')||(newpass.charAt(i)>'z')){
                                alphnum=1;
                                break;
                            }
                        }
                        if(newpass.length()<8){
                            System.out.println("atleast 8 characters!");
                            scan.nextLine();
                        }else if(alphnum==1){
                            System.out.println("must be alphanumeric!");
                            scan.nextLine();
                        }else{
                            System.out.print("Reinput your password:");
                            renewpass=scan.nextLine();
                            if(renewpass.equals(newpass)){
                            initdata.password.set(cookie, newpass);
                            System.out.println("successfully changed!");
                            scan.nextLine();
                            break;}else{
                                System.out.println("Please validate your new password");
                                scan.nextLine();
                            }
                        }
                    }else{
                        System.out.println("Wrong Password!");
                        scan.nextLine();
                    }
                }
                }}
                break;
                case 6:
                while(true){
                String tught=null;
                System.out.printf("Current Speed : %d\nDid you want to change it [Yes | No]?\n>>",initdata.speed.get(cookie));
                tught=scan.nextLine();
                if(tught.equals("No")){
                    break;
                }else if(tught.equals("Yes")){
                    while(true){
                    Integer newspeed=-1;
                    System.out.print("How fast did you want it [Between 20000 and 500000]?\n>>");
                    try {
                        newspeed=scan.nextInt();
                    } catch (Exception e) {
                        newspeed=20000;
                    }
                    scan.nextLine();
                    if(newspeed>=20000&&newspeed<=500000){
                        initdata.speed.set(cookie, newspeed);
                        break;
                    }else{
                        System.out.println("Invalid!");
                        scan.nextLine(); 
                    }}
                    break;
                }else{
                    System.out.println("Invalid!");
                    scan.nextLine(); 
                }}
                break;
                case 0:
                back=1;
                break;
                default:
                System.out.println("Invalid!");
                scan.nextLine();
            }
            if(back==1){
                back=0;
                break;
            }
            }
        }else if(choose==2){
            String regname=null,regpass=null,reregpass=null,regrealname=null;
            while(true){
            Integer alphnum3=0;
            System.out.print("Input your username\n[5 -20 character, Alphanumeric, Must be Unique | Exit]:");
            regname=scan.nextLine();
            for(int i=0;i<regname.length();i++){
                if(regname.charAt(i)<'0'||(regname.charAt(i)>'9'&&regname.charAt(i)<'A')||(regname.charAt(i)>'Z'&&regname.charAt(i)<'a')||(regname.charAt(i)>'z')){
                    alphnum3=1;
                    break;
                }
            }
            if(regname.equals("Exit")){
                back=1;
                break;
            }else if(regname.length()<5||regname.length()>20){
                System.out.println("Must be between 5 - 20 characters!");
            }else if(initdata.username.contains(regname)){
                System.out.println("Must be unique!");
            }else if(alphnum3==1){
                System.out.println("Alphanumeric!");
            }else{
                break;
            }}
            if(back==1){
                back=0;
                continue;
            }
            
            while(true){
                Integer alphnum1=0;
                System.out.print("Input your password\n[At least 8 character, Alphanumeric]:");
                regpass=scan.nextLine();
                for(int i=0;i<regpass.length();i++){
                    if(regpass.charAt(i)<'0'||(regpass.charAt(i)>'9'&&regpass.charAt(i)<'A')||(regpass.charAt(i)>'Z'&&regpass.charAt(i)<'a')||(regpass.charAt(i)>'z')){
                        alphnum1=1;
                        break;
                    }
                }
                if(regpass.length()<8){
                    System.out.println("atleast 8 characters!");
                    scan.nextLine();
                }else if(alphnum1==1){
                    System.out.println("must be alphanumeric!");
                    scan.nextLine();
                }else{
                    System.out.print("Reinput your password: ");
                    reregpass=scan.nextLine();
                    if(reregpass.equals(regpass)){
                        break;
                    }else{
                        System.out.println("Doesn't match!");
                        scan.nextLine(); 
                    }
                }
            }
            while(true){
                Integer alph1=0;
                System.out.print("Input your Name\n[At least 4 character, Alphabet only]:");
                regrealname=scan.nextLine();
                for(int i=0;i<regrealname.length();i++){
                    if((regrealname.charAt(i)<'A')||(regrealname.charAt(i)>'Z'&&regrealname.charAt(i)<'a')||(regrealname.charAt(i)>'z')){
                        alph1=1;
                        break;
                    }
                }
                if(regrealname.length()<4){
                System.out.println("At least 4 character!");
                scan.nextLine();
                }else if(alph1==1){
                    System.out.println("Alphabet only!");
                    scan.nextLine();   
                }else{
                    initdata.incrementId(regname, regpass, regrealname);
                    initdata.DateGame.add(new Vector<LocalDate>());
                    
                  initdata.StatGame.add(new Vector<String>());
        for(int j=0;j<=initdata.GameID.size();j++){
            initdata.StatGame.get(initdata.username.size()-1).add("Available");
            initdata.DateGame.get(initdata.username.size()-1).set(j,initdata.DateGame.get(initdata.username.size()-2).get(j));    
    }
                    System.out.println("Account registered!");
                    scan.nextLine();
                    break;
                }
            }
        }else if(choose==0){
            return;
        }}
        }
    
    
    public void incrementId(String a,String b,String c){
        username.add(a);
        password.add(b);
        nameuser.add(c);
        UserID.add(username.size());
        speed.add(20000);
        
}
        
    
    public int incrementGame(Integer a,String b,String c,Integer d){
        
        GamemakerID.add(a);
        Integer e=GamemakerID.size();
        while(GameID.contains(e)){
            e++;
        }
        Name.add(b);
        Desc.add(c);
        Size.add(d);
        GameID.add(e);
        return GameID.indexOf(e);
    }
  
    public void removeGame(Integer a){
        
        GameID.removeElementAt((int)a);
        GamemakerID.removeElementAt((int)a);
        Name.removeElementAt((int)a);
        Desc.removeElementAt((int)a);
        Size.removeElementAt((int)a);
        
    }
    
    public void sortbyname(int mind,int start){
        Integer []nsort= new Integer[GameID.size()+5];   
     for(int i=0;i<GameID.size();i++){
       nsort[i]=i;
     } 
     for(int i=GameID.size()-1;i>=0;i--){
        for(int j=1;j<=i;j++){
            if(Name.get(nsort[j]).compareToIgnoreCase(Name.get(nsort[j-1]))<0){
                Integer temp=nsort[j];
                nsort[j]=nsort[j-1];
                nsort[j-1]=temp;
            }
          } 
      } 
       for(int i=start;i<start+6&&i<GameID.size();i++){
         System.out.printf(format3,GameID.get(nsort[i]),Name.get(nsort[i]),Size.get(nsort[i]),username.get(UserID.indexOf(GamemakerID.get(nsort[i]))),StatGame.get((UserID.get(mind))-1).get(nsort[i]),DateGame.get((UserID.get(mind))-1).get(nsort[i]));
       }
    }
    
    public void sortbynewest(int mind,int start){
        Integer []nsort= new Integer[GameID.size()+5];   
        for(int i=0;i<GameID.size();i++){
            
          nsort[i]=i;
        } 
        for(int i=GameID.size()-1;i>=0;i--){
           for(int j=1;j<=i;j++){
               
               
                if(!DateGame.get((UserID.get(mind))-1).get(nsort[j]).isBefore(DateGame.get((UserID.get(mind))-1).get(nsort[j-1]))){
                    Integer temp=nsort[j];
                    nsort[j]=nsort[j-1];
                    nsort[j-1]=temp;
                }
               
               
             } 
         } 
          for(int i=start;i<start+6&&i<GameID.size();i++){
        
            System.out.printf(format3,GameID.get(nsort[i]),Name.get(nsort[i]),Size.get(nsort[i]),username.get(UserID.indexOf(GamemakerID.get(nsort[i]))),StatGame.get((UserID.get(mind))-1).get(nsort[i]),DateGame.get((UserID.get(mind))-1).get(nsort[i]));
          }
    }
    public void sortbysize(int mind,int start){
        Integer []nsort= new Integer[GameID.size()+5];   
        for(int i=0;i<GameID.size();i++){
          nsort[i]=i;
        } 
        for(int i=GameID.size()-1;i>=0;i--){
           for(int j=1;j<=i;j++){
            
               if(Size.get(nsort[j])<Size.get(nsort[j-1])){
                   Integer temp=nsort[j];
                   nsort[j]=nsort[j-1];
                   nsort[j-1]=temp;
               }
             } 
         } 
          for(int i=start;i<start+6&&i<GameID.size();i++){
            System.out.printf(format3,GameID.get(nsort[i]),Name.get(nsort[i]),Size.get(nsort[i]),username.get(UserID.indexOf(GamemakerID.get(nsort[i]))),StatGame.get((UserID.get(mind))-1).get(nsort[i]),DateGame.get((UserID.get(mind))-1).get(nsort[i]));
            
        }
          
    }
}
