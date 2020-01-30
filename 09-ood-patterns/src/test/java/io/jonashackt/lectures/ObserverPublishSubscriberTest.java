package io.jonashackt.lectures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverPublishSubscriberTest {

    /**
     *  As you may noticed, {@link java.util.Observer} & {@link java.util.Observable} have been deprecated since Java 9
     *  see https://stackoverflow.com/questions/46380073/observer-is-deprecated-in-java-9-what-should-we-use-instead-of-it
     *  so we should use a more modern way of the classic Observer Pattern
     */
    @Test public void
    tell_some_jokes_or_die() {

        // Somebody, who tells Jokes...
        JokeTeller max = new JokeTeller("Max, the Joker!");

        // ...and some folks, who listen to them :)
        JokeListener hartmut = new JokeListener("Hartmut");
        JokeListener monika = new JokeListener("Monika");

        // subscribe one of the Listeners to Max, the JokeTeller...
        max.subscribe(hartmut);

        max.tellJoke();
        max.tellJoke();

        // now subscribe another Listener to Max
        max.subscribe(monika);

        max.tellJoke();





    }

}
