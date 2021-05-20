package U4ProgrammingA2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author MC03353
 */
public class Player implements Actions {

    protected static String firstName;
    protected static String lastName;
    protected String teamName;
    List<String> listPlayer = new ArrayList<>();
    int count = 0;

    public void player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = firstName + lastName;
    }

    @Override
    public void setFirstName() {
        System.out.println("Enter first name");
        Player.firstName = InputFactory.SC.next();
    }

    @Override
    public void setLastName() {
        System.out.println("Enter last name");
        Player.lastName = InputFactory.SC.next();
    }

    @Override
    public void setTeam() {
        this.teamName = firstName + lastName;
    }

    @Override
    public void add() {
        listPlayer.add(firstName + " " + lastName + " \t Member of: " + teamName);
    }

    @Override
    public void view() {
        if (listPlayer.isEmpty()) {
            System.out.println("Add players first");
        }

        for (Iterator<String> iterator = listPlayer.iterator(); iterator.hasNext();) {
            String player = iterator.next();
            System.out.println(player);
        }
    }

    @Override
    public void remove() {

    }
}
