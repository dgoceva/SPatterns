package com.company;

public interface ChannelCollection {
    void addChannel(Channel ch);
    void removeChannel(Channel ch);
    ChannelIterator iterator(ChannelTypeEnum type);
}
