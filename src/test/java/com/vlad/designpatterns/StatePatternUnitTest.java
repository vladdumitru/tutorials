package com.vlad.designpatterns;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

import com.vlad.designpatterns.behavioral.state.DeliveredState;
import com.vlad.designpatterns.behavioral.state.OrderedState;
import com.vlad.designpatterns.behavioral.state.ReceivedState;
import org.junit.Test;
import com.vlad.designpatterns.behavioral.state.Package;

public class StatePatternUnitTest {

    @Test
    public void givenNewPackage_whenPackageReceived_thenStateReceived() {
        Package pkg = new Package();

        assertThat(pkg.getState(), instanceOf(OrderedState.class));
        pkg.nextState();

        assertThat(pkg.getState(), instanceOf(DeliveredState.class));
        pkg.nextState();

        assertThat(pkg.getState(), instanceOf(ReceivedState.class));
    }

    @Test
    public void givenDeliveredPackage_whenPrevState_thenStateOrdered() {
        Package pkg = new Package();
        pkg.setState(new DeliveredState());
        pkg.previousState();

        assertThat(pkg.getState(), instanceOf(OrderedState.class));
    }
}
