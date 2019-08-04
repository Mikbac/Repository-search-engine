/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    @Test
    public void setNameAndGetName1(){
        RepositoryModel repository = new RepositoryModel();
        String name = "allegro-api";

        repository.setRepositoryName(name);

        assertEquals(name, repository.getRepositoryName());
    }

    @Test
    public void setNameAndGetName2(){
        RepositoryModel repository = new RepositoryModel();
        String name = "allegro-tech-labs-iot";

        repository.setRepositoryName(name);

        assertEquals(name, repository.getRepositoryName());
    }

    @Test
    public void setLastUpdateAndGetLastUpdate1(){
        RepositoryModel repository = new RepositoryModel();
        String lastUpdate = "2019-04-10T07:39:33Z";

        repository.setLastUpdate(lastUpdate);

        assertEquals(lastUpdate, repository.getLastUpdate());
    }

    @Test
    public void setLastUpdateAndGetLastUpdate2(){
        RepositoryModel repository = new RepositoryModel();
        String lastUpdate = "2019-01-07T13:23:15Z";

        repository.setLastUpdate(lastUpdate);

        assertEquals(lastUpdate, repository.getLastUpdate());
    }

}
