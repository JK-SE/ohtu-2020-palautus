package ohtuesimerkki;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticsTest {


    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before

    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
        System.out.println(stats);
    }


    @Test
    public void teamNotEmpty() {
        List <Player>l = stats.team("EDM");
        assertTrue(l.size() >  0 );
    }
    @Test
    public void teamEmpty() {
        List <Player>l = stats.team("XYZ");
        assertTrue(l.size() == 0 );
    }

    @Test
    public void searchPlayerNameFound() {
        assertTrue(stats.search("Semenko") != null );
    }

    @Test
    public void searchPlayerNameNotFound() {
        assertTrue(stats.search("Kissa") == null );

    }

    @Test
    public void searchTopScorerCount() {
        // it returns 1 more than parameter given, is this an error or intended behaviour?
        List <Player>list = stats.topScorers(1);
        assertTrue(list.size()  == 2 );

    }
    @Test
    public void searchTopScorerCountZero() {
        // it returns 1 more than parameter given, is this an error or intended behaviour?
        List <Player>list = stats.topScorers(0);
        assertFalse(list.size()  == 0 );

    }

}
