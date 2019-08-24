package pl.MikBac.searchEngine.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.MikBac.searchEngine.WebApplication;
import pl.MikBac.searchEngine.model.RepositoryModel;
import pl.MikBac.searchEngine.spring.repository.OrganizationRepository;
import pl.MikBac.searchEngine.spring.repository.RepositoryRepository;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by MikBac on 2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
@AutoConfigureMockMvc
public class RepositoryServiceTest {

    @Resource
    private MockMvc mockMvc;

    @Resource
    private RepositoryService repositoryService;

    @MockBean
    private OrganizationRepository organizationRepository;

    @MockBean
    private RepositoryRepository repositoryRepository;

    @Test
    public void getAllRepositoriesWhenOrganizationNameIsAllegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("Allegro"));
    }

    @Test
    public void getAllRepositoriesWhenOrganizationNameIsallegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("allegro"));
    }

    @Test
    public void getAllRepositoriesWhenOrganizationNameIsALLEGRO() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("ALLEGRO"));
    }

    @Test
    public void getISODateWhenDateIsCorrect1() {
        String date = "2012-05-17T14:04:57Z";
        LocalDateTime correctDate = LocalDateTime.parse("2012-05-17T14:04:57");
        LocalDateTime newDate = repositoryService.getISODate(date);
        assertEquals(correctDate, newDate);
    }

    @Test
    public void getISODateWhenDateIsCorrect2() {
        String date = "2000-01-01T10:10:10Z";
        LocalDateTime correctDate = LocalDateTime.parse("2000-01-01T10:10:10");
        LocalDateTime newDate = repositoryService.getISODate(date);
        assertEquals(correctDate, newDate);
    }

    @Test
    public void getISODateWhenDateIsCorrect3() {
        String date = "2000-12-01T00:00:00Z";
        LocalDateTime correctDate = LocalDateTime.parse("2000-12-01T00:00:00");
        LocalDateTime newDate = repositoryService.getISODate(date);
        assertEquals(correctDate, newDate);
    }

    @Test
    public void findLatestDateWhenDatesAreCorrect1() {
        String date1 = "1999-02-03T06:06:06Z";
        String date2 = "2000-02-03T06:06:06Z";
        String date3 = "2005-02-03T06:06:06Z";
        String date4 = "2010-02-03T06:06:06Z";
        String date5 = "2077-02-03T06:06:06Z";
        RepositoryModel repository1 = new RepositoryModel("Name1", date1);
        RepositoryModel repository2 = new RepositoryModel("Name2", date2);
        RepositoryModel repository3 = new RepositoryModel("Name3", date3);
        RepositoryModel repository4 = new RepositoryModel("Name4", date4);
        RepositoryModel repository5 = new RepositoryModel("Name5", date5);
        List<RepositoryModel> repositories = Arrays.asList(repository1, repository2, repository3, repository4, repository5);
        RepositoryModel latestRepository = repositoryService.getLatestDate(repositories);
        assertEquals(repository5, latestRepository);
    }

    @Test
    public void findLatestDateWhenDatesAreCorrect2() {
        String date1 = "1790-12-03T06:06:06Z";
        String date2 = "2000-11-03T06:06:06Z";
        String date3 = "2125-10-03T06:06:06Z";
        String date4 = "2010-03-03T06:06:06Z";
        String date5 = "2177-01-03T06:06:06Z";
        RepositoryModel repository1 = new RepositoryModel("Name1", date1);
        RepositoryModel repository2 = new RepositoryModel("Name2", date2);
        RepositoryModel repository3 = new RepositoryModel("Name3", date3);
        RepositoryModel repository4 = new RepositoryModel("Name4", date4);
        RepositoryModel repository5 = new RepositoryModel("Name5", date5);
        List<RepositoryModel> repositories = Arrays.asList(repository1, repository2, repository3, repository4, repository5);
        RepositoryModel latestRepository = repositoryService.getLatestDate(repositories);
        assertEquals(repository5, latestRepository);
    }

    @Test
    public void findLatestDateWhenDatesAreCorrect3() {
        String date1 = "1996-12-09T06:06:06Z";
        String date2 = "1997-11-01T06:06:06Z";
        String date3 = "1998-12-02T06:06:06Z";
        String date4 = "1999-11-03T06:06:06Z";
        String date5 = "2277-12-12T06:06:06Z";
        RepositoryModel repository1 = new RepositoryModel("Name1", date1);
        RepositoryModel repository2 = new RepositoryModel("Name2", date2);
        RepositoryModel repository3 = new RepositoryModel("Name3", date3);
        RepositoryModel repository4 = new RepositoryModel("Name4", date4);
        RepositoryModel repository5 = new RepositoryModel("Name5", date5);
        List<RepositoryModel> repositories = Arrays.asList(repository1, repository2, repository3, repository4, repository5);
        RepositoryModel latestRepository = repositoryService.getLatestDate(repositories);
        assertEquals(repository5, latestRepository);
    }

}
