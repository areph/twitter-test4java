package org;

import twitter4j.*;

/**
 * Created by areph on 2016/08/03.
 */
public class TwitterSeacher {
    private final String RETWEET_EXCLUDE_KEYWORD = "exclude:retweets";
    public void search(String searchWord) {
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query();

        query.setQuery(String.join(" ", searchWord, RETWEET_EXCLUDE_KEYWORD));
        query.setCount(100);

        try {
            QueryResult result = twitter.search(query);
            result.getTweets().forEach(tweet -> {
                String text = tweet.getText();
                System.out.println(text);
            });
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
}
