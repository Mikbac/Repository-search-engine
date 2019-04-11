package com;

import com.model.Repository;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RepositoryData {

    public static Repository getRepository(String userName) throws Exception {

        String url;
        String data;
        JSONArray jsonArr;
        int pagesNumber = 10;
        while (true) {
            url = "https://api.github.com/users/" + userName + "/events?per_page=" + pagesNumber;
            data = readUrl(url);
            jsonArr = new JSONArray(data);

            for (int i = 0; i < jsonArr.length(); i++) {
                JSONObject jsonObj = jsonArr.getJSONObject(i);
                if (jsonObj.get("type").equals("PushEvent") || jsonObj.get("type").equals("CreateEvent")) {

                    Repository repository = new Repository();
                    String repositoryName;

                    String repositoryUrl = jsonObj.getJSONObject("repo").get("url").toString();

                    repositoryName = repositoryUrl.substring(30 + userName.length());

                    repository.setRepositoryName(repositoryName);

                    System.out.println(jsonObj.get("type"));
                    System.out.println(repositoryName);
                    System.out.println(pagesNumber);

                    return repository;
                }
            }

            pagesNumber += 10;
        }

    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}