package com.company;

import java.util.*;

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channels;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel ch) {
        this.channels.add(ch);
    }

    @Override
    public void removeChannel(Channel ch) {
        this.channels.remove(ch);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {

        return new ChannelIteratorImpl(type,channels);
    }

    private class ChannelIteratorImpl implements ChannelIterator{

        private ChannelTypeEnum TYPE;
        private List<Channel>  channels;
        int position;

        public ChannelIteratorImpl(ChannelTypeEnum TYPE, List<Channel> channels) {
            this.TYPE = TYPE;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            return nextPosition() > -1;
        }

        private int nextPosition() {
            while (position < channels.size()){
                Channel ch = channels.get(position);
                if (ch.getTYPE().equals(TYPE) || TYPE.equals(ChannelTypeEnum.ALL)){
                    return position;
                }else {
                    position++;
                }
            }
            return -1;
        }

        @Override
        public Channel next() {
            position = nextPosition();
            return (position== -1) ? null : channels.get(position++);
        }
    }
}


