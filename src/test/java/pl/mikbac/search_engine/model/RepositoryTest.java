package pl.mikbac.search_engine.model;

import org.junit.Test;
import pl.mikbac.search_engine.model.exte.RepositoryModel;

import static org.junit.Assert.assertEquals;

/**
 * Created by MikBac on 2019
 */

public class RepositoryTest {

    @Test
    public void set_name_and_get_name_one() {
        RepositoryModel repository = new RepositoryModel();
        String name = "allegro-api";
        repository.setRepositoryName(name);
        assertEquals(name, repository.getRepositoryName());
    }

    @Test
    public void set_name_and_get_name_two() {
        RepositoryModel repository = new RepositoryModel();
        String name = "allegro-tech-labs-iot";
        repository.setRepositoryName(name);
        assertEquals(name, repository.getRepositoryName());
    }

    @Test
    public void set_last_update_and_get_last_update_one() {
        RepositoryModel repository = new RepositoryModel();
        String lastUpdate = "2019-04-10T07:39:33Z";
        repository.setLastUpdate(lastUpdate);
        assertEquals(lastUpdate, repository.getLastUpdate());
    }

    @Test
    public void set_last_update_and_get_last_update_two() {
        RepositoryModel repository = new RepositoryModel();
        String lastUpdate = "2019-01-07T13:23:15Z";
        repository.setLastUpdate(lastUpdate);
        assertEquals(lastUpdate, repository.getLastUpdate());
    }

}
