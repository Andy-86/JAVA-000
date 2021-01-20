package io.kimmking.kmq.core;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author mac
 */
public class ProducerHolder {
    private static final ConcurrentMap<String,KmqProducer> HOLDER = new ConcurrentHashMap<>();

    public static KmqProducer get(String clientSessionId, KmqBroker broker) {
        KmqProducer producer = HOLDER.get(clientSessionId);
        if (producer == null) {
            synchronized (HOLDER) {
                KmqProducer producer1 = HOLDER.get(clientSessionId);
                if (producer1 != null) {
                    return producer1;
                } else {
                    KmqProducer producer2 = broker.createProducer();
                    HOLDER.put(clientSessionId, producer2);
                    return producer2;
                }
            }
        }
        return producer;
    }
}
