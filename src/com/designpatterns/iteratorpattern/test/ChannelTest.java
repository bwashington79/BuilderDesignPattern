package com.designpatterns.iteratorpattern.test;

import com.designpatterns.iteratorpattern.Channel;
import com.designpatterns.iteratorpattern.ChannelCollectionImpl;
import com.designpatterns.iteratorpattern.ChannelCollection;
import com.designpatterns.iteratorpattern.ChannelIterator;
import com.designpatterns.iteratorpattern.ChannelTypeEnum;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ChannelTest {

    //boarding pass object created with fields initialized via args being passed in.

    @Test
    public void verifyIterator() {

        ChannelCollection channels = new ChannelCollectionImpl();

        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));



        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }

    }
}
