package com.service;

import com.model.Repository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DateSupport {

    public static Repository findLatestDate(List<Repository> repositories, String dateString) {
        LocalDateTime latestDate;
        Repository latestRepository;

        latestDate = DateSupport.getISODate(repositories.get(0).getLastUpdate());
        latestRepository = repositories.get(0);

        for (int i = 1; i < repositories.size(); i++) {
            if (latestDate.isBefore(DateSupport.getISODate(repositories.get(i).getLastUpdate()))) {
                latestDate = DateSupport.getISODate(repositories.get(i).getLastUpdate());
                latestRepository = repositories.get(i);
            }

        }

        return latestRepository;
    }


    public static LocalDateTime getISODate(String dateString) {
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_INSTANT;
        Instant dateInstant = Instant.from(isoFormatter.parse(dateString));
        LocalDateTime date = LocalDateTime.ofInstant(dateInstant, ZoneId.of(ZoneOffset.UTC.getId()));

        return date;
    }


}
