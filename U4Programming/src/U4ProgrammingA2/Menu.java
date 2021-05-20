package U4ProgrammingA2;
    
/**
 *
 * @author MC03353
 */
public class Menu {
    private int iInput;
    private String sInput;

    public Menu() {
        Player player = new Player();
        Team team = new Team();
        
        do {
            System.out.println("Select from the following:\n"
                    + "1. Add Player         \t4. Add Team\n"
                    + "2. View Player       \t5. View Team\n"
                    + "3. Delete Player    \t6. Delete Team\n"
                    + "0. Exit\n");
            
            //input validation. Prints message if input is not a whole number
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Whole numbers only");
                InputFactory.SC.next();//Moves the token to the next line to avoid infinite loop
            }

            iInput = InputFactory.SC.nextInt();
            
            if(iInput == 1){
                player.setFirstName();
                player.setLastName();
                player.setTeam();
                player.add();
                break;
            }else if (iInput == 2){
                player.view();
                break;
            }else if(iInput == 4){
                team.setFirstName();
                team.setLastName();
                team.setTeam();
                team.add();
                break;
            } else if (iInput == 5){
                team.view();
            }
            
            //use an if or Switch statement here i.e.
            //if users selects 1 run this method 
            //if users selects 2 run this method 
            //
            //is this a team event or individual 
            //one event or five events
            //sporting or academic 
            //scoring system
        } while (iInput != 0);//end of do while loop
    }//end of menu method   

}//end of Main class
