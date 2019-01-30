package com.designpatterns.iteratorpattern;

import lombok.Data;

@Data
public class Channel {

    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum type){
        this.frequency=freq;
        this.TYPE=type;
    }


    @Override
    public String toString(){
        return "Frequency is " + this.frequency + ", Type is  " + this.TYPE;
    }

}
