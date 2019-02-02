package com.designpatterns.iteratorpattern.test;

import com.designpatterns.iteratorpattern.Channel;
import com.designpatterns.iteratorpattern.ChannelCollectionImpl;
import com.designpatterns.iteratorpattern.ChannelIterator;
import com.designpatterns.iteratorpattern.ChannelTypeEnum;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class ChannelTest {

    @Test
    public void verifyIterator() {

        ChannelCollectionImpl channels = new ChannelCollectionImpl();

        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));

        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);

        //Test to check if there is a next value for the List type
        assertTrue("Is there a next value ", baseIterator.hasNext());
        
    }
}
