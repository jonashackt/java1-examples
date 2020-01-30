package io.jonashackt.lectures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Flow;

/**
 * Former to Java 9 this could be seen as a {@link java.util.Observable}
 * Now we have a {@link java.util.concurrent.Flow.Publisher}
 */
public class JokeTeller implements Flow.Publisher {

    private static final List<String> jokes = Arrays.asList(
            "Sorry, aber du siehst so aus, wie ich mich fühle.",
            "Eine Null kann ein bestehendes Problem verzehnfachen.",
            "Wer zuletzt lacht, hat es nicht eher begriffen.",
            "Wer zuletzt lacht, stirbt wenigstens fröhlich.",
            "Unsere Luft hat einen Vorteil: Man sieht, was man einatmet."
    );

    private String name;

    private List<Flow.Subscriber> subscribers = new ArrayList<>();

    public JokeTeller(String name) {
        this.name = name;
    }

    public void tellJoke() {
        Collections.shuffle(jokes);
        subscribers.stream().forEach(subscriber -> subscriber.onNext(jokes.get(0)));
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
