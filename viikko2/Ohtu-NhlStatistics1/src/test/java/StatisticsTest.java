/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import ohtuesimerkki.Player;
import ohtuesimerkki.Reader;
import ohtuesimerkki.Statistics;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author fuksi
 */
public class StatisticsTest {
    
    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };
    
    
    public StatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void searchReturnsCorrectPlayer() {
        Player p = stats.search("Kurri");
        assertEquals("Kurri", p.getName());
    }
    
    @Test
    public void statsNotNull() {
        assertEquals(false, stats == null);
    }
    
    @Test
    public void teamSearchReturnsCorrectly() {
        List<Player> l = stats.team("EDM");
        assertEquals(3, l.size());
    }
    
    @Test
    public void topListReturnsCorrectAmount() {
        List<Player> l = stats.topScorers(3);
        assertEquals(4, l.size());
    }
    
    @Test
    public void searchReturnsNullIfPlayerNotFound() {
        Player p = stats.search("kaakelijake");
        assertEquals(null, p);
    }
    
    
}
