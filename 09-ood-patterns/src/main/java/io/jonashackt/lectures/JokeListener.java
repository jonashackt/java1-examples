package io.jonashackt.lectures;

import java.util.concurrent.Flow;

/**
 * Former to Java 9 this could be seen as a {@link java.util.Observer}
 * Now we have a {@link java.util.concurrent.Flow.Subscriber}
 */
public class JokeListener implements Flow.Subscriber {
    private final String name;

    public JokeListener(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(Object item) {
        System.out.println(name + " is laughing out loud, because he got told the joke " + item.toString());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
