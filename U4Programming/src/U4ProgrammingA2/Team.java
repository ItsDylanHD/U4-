package U4ProgrammingA2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MC03353
 */
public class Team extends Player implements Actions{
    List<String> listTeam = new ArrayList<>();
    Player player = new Player();// create a new player object
    
    public void teamPlayer(String firstName, String lastName, String teamName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }
    
    @Override
    public void setFirstName(){
        player.setFirstName();
    }
    
    @Override
    public void setLastName(){
        player.setLastName();
    }
    
    @Override
    public void setTeam(){
        System.out.println("Enter team name");
        this.teamName = teamName;
    }
    
    @Override
    public void add(){
        if (listPlayer.size() <= 20) {
            listPlayer.add(firstName + " " + lastName + " \t Member of: " + teamName );
        } else {
            System.out.println("Teams are full");
        }
    }
    
    @Override
    public void view(){
        if(listTeam.isEmpty()){
            System.out.println("You have no teams");
        }
        
        for(Iterator<String> iterator = listPlayer.iterator(); iterator.hasNext();){
            String team = iterator.next();
            System.out.println(team);
        }
    }

    @Override
    public void remove(){
    
    }
}
