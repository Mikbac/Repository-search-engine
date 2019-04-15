package com.service;

import com.model.Repository;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DateSupportTest {


    @Test
    public void getISODateWhenDateIsCorrect1() {
        String date = "2012-05-17T14:04:57Z";

        LocalDateTime correctDate = LocalDateTime.parse("2012-05-17T14:04:57");
        LocalDateTime newDate = DateSupport.getISODate(date);

        assertEquals(correctDate, newDate);
    }

    @Test
    public void getISODateWhenDateIsCorrect2() {
        String date = "2000-01-01T10:10:10Z";

        LocalDateTime correctDate = LocalDateTime.parse("2000-01-01T10:10:10");
        LocalDateTime newDate = DateSupport.getISODate(date);

        assertEquals(correctDate, newDate);
    }

    @Test
    public void getISODateWhenDateIsCorrect3() {
        String date = "2000-12-01T00:00:00Z";

        LocalDateTime correctDate = LocalDateTime.parse("2000-12-01T00:00:00");
        LocalDateTime newDate = DateSupport.getISODate(date);

        assertEquals(correctDate, newDate);
    }


    @Test
    public void findLatestDateWhenDatesAreCorrect1(){
        String date1 = "1999-02-03T06:06:06Z";
        String date2 = "2000-02-03T06:06:06Z";
        String date3 = "2005-02-03T06:06:06Z";
        String date4 = "2010-02-03T06:06:06Z";
        String date5 = "2077-02-03T06:06:06Z";

        Repository repository1 = new Repository("Name1", date1);
        Repository repository2 = new Repository("Name2", date2);
        Repository repository3 = new Repository("Name3", date3);
        Repository repository4 = new Repository("Name4", date4);
        Repository repository5 = new Repository("Name5", date5);

        List<Repository> repositories = Arrays.asList(repository1, repository2, repository3, repository4, repository5);

        Repository latestRepository = DateSupport.findLatestDate(repositories);

        assertEquals(repository5, latestRepository);
    }

    @Test
    public void findLatestDateWhenDatesAreCorrect2(){
        String date1 = "1790-12-03T06:06:06Z";
        String date2 = "2000-11-03T06:06:06Z";
        String date3 = "2125-10-03T06:06:06Z";
        String date4 = "2010-03-03T06:06:06Z";
        String date5 = "2177-01-03T06:06:06Z";

        Repository repository1 = new Repository("Name1", date1);
        Repository repository2 = new Repository("Name2", date2);
        Repository repository3 = new Repository("Name3", date3);
        Repository repository4 = new Repository("Name4", date4);
        Repository repository5 = new Repository("Name5", date5);

        List<Repository> repositories = Arrays.asList(repository1, repository2, repository3, repository4, repository5);

        Repository latestRepository = DateSupport.findLatestDate(repositories);

        assertEquals(repository5, latestRepository);
    }

    @Test
    public void findLatestDateWhenDatesAreCorrect3(){
        String date1 = "1996-12-09T06:06:06Z";
        String date2 = "1997-11-01T06:06:06Z";
        String date3 = "1998-12-02T06:06:06Z";
        String date4 = "1999-11-03T06:06:06Z";
        String date5 = "2277-12-12T06:06:06Z";

        Repository repository1 = new Repository("Name1", date1);
        Repository repository2 = new Repository("Name2", date2);
        Repository repository3 = new Repository("Name3", date3);
        Repository repository4 = new Repository("Name4", date4);
        Repository repository5 = new Repository("Name5", date5);

        List<Repository> repositories = Arrays.asList(repository1, repository2, repository3, repository4, repository5);

        Repository latestRepository = DateSupport.findLatestDate(repositories);

        assertEquals(repository5, latestRepository);
    }


}
