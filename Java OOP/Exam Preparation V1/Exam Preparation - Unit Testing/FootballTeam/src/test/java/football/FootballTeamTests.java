package football;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FootballTeamTests {

    private Footballer footballer;
    private FootballTeam footballTeam;
    private static final int VACANT_POSITIONS = 10;
    private static final String TEAM_NAME = "Test Team";
    private static final String PLAYER_NAME = "Pesho";

    @Before
    public void setUp(){
        this.footballer = new Footballer(PLAYER_NAME);
        this.footballTeam = new FootballTeam(TEAM_NAME, VACANT_POSITIONS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreatingTeamWithNegativeVacantPositions(){
        new FootballTeam(TEAM_NAME, -1);
    }

    @Test
    public void testCreatingTeamWithPositiveVacantPositions(){
        new FootballTeam(TEAM_NAME, VACANT_POSITIONS);
        Assert.assertEquals(10, footballTeam.getVacantPositions());
    }

    @Test(expected = NullPointerException.class)
    public void testCreatingTeamWithNullNameShouldThrow(){
        new FootballTeam(null,VACANT_POSITIONS);
    }

    @Test(expected = NullPointerException.class)
    public void testCreatingTeamWithEmptyStringNameShouldThrow(){
        new FootballTeam("",VACANT_POSITIONS);
    }

    @Test()
    public void testCreatingTeamWithRegularName(){
        footballTeam = new FootballTeam("Test Team",VACANT_POSITIONS);
        Assert.assertEquals(TEAM_NAME, footballTeam.getName());
    }

    @Test
    public void testAddPlayerShouldIncreaseTeamSize(){
        footballTeam.addFootballer(footballer);
        Assert.assertEquals(1, footballTeam.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPlayerShouldThrowWhenTeamIsFull(){
        FootballTeam team = new FootballTeam("Test Team", 0);
        team.addFootballer(footballer);
    }

    @Test
    public void testRemoveFootballerShouldReduceTeamCount(){
        footballTeam.addFootballer(footballer);
        Assert.assertEquals(1, footballTeam.getCount());
        footballTeam.removeFootballer(footballer.getName());
        Assert.assertEquals(0, footballTeam.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveFootballerShouldThrowWithNoSuchPlayer(){
        footballTeam.addFootballer(footballer);
        footballTeam.removeFootballer("Hulk");
    }

    @Test
    public void testFootballerForSaleShouldDeactivatePlayer(){
        footballTeam.addFootballer(footballer);
        footballTeam.footballerForSale(footballer.getName());
        Assert.assertFalse(footballer.isActive());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFootballerForSaleShouldThrowIfPlayerDoesNotExists(){
        footballTeam.addFootballer(footballer);
        footballTeam.footballerForSale("Hulk");
    }


}
