package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The ModelTest class.
 * @author Christian
 * @author Eliphaz
 * @version 1.0
 *
 */
public class ModelTest {
	
	/** The model for the tests */
    private Model model;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Instantiates a new model.
     * @throws Exception in case of an exception
     */
    @Before
    public void setUp() throws Exception {
        this.model = new Model();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testContentOfMap() {
      Assert.assertEquals("", this.model.getMap().getContentOfMap());
    }


    /**
     * The testGetNumberOfDiamondsNeeded method.
     * Check that the connection to the database if well-established and the correct number of diamonds is picked.
     */
    @Test
    public void testGetNumberOfDiamondsNeeded() {
        this.model.loadMap(1);
        Assert.assertEquals(3, this.model.getMap().getNumberOfDiamondsNeeded());
        this.model.loadMap(2);
        Assert.assertEquals(5, this.model.getMap().getNumberOfDiamondsNeeded());
        this.model.loadMap(3);
        Assert.assertEquals(7, this.model.getMap().getNumberOfDiamondsNeeded());
        this.model.loadMap(4);
        Assert.assertEquals(9, this.model.getMap().getNumberOfDiamondsNeeded());
        this.model.loadMap(5);
        Assert.assertEquals(10, this.model.getMap().getNumberOfDiamondsNeeded());
    }
    
    /**
     * Test the limit of level loading. If there is an exception, assertEquals will return true
     */
    @Test
    public void testLimitLoadingMap() {

        try {
        	this.model.loadMap(8);
            fail("Failed");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(e.getMessage(), "Incorrect id !"); 
        }
    }
    
    
    

}
