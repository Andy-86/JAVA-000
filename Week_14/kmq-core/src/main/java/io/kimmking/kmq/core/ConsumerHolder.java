package io.kimmking.kmq.core;
import	java.util.concurrent.ConcurrentHashMap;

import java.util.concurrent.ConcurrentMap;
import lombok.Synchronized;

/**
 * @author mac
 */
public class ConsumerHolder {
    private static final ConcurrentMap<String,KmqConsumer> HOLDER = new ConcurrentHashMap<> ();

    public static KmqConsumer get(String clientSessionId, KmqBroker broker) {
        KmqConsumer consumer = HOLDER.get(clientSessionId);
        if (consumer == null) {
            synchronized (HOLDER) {
                KmqConsumer consumer1 = HOLDER.get(clientSessionId);
                if (consumer1 != null) {
                    return consumer1;
                } else {
                    KmqConsumer consumer2 = broker.createConsumer();
                    HOLDER.put(clientSessionId, consumer2);
                    return consumer2;
                }
            }
        }
        return consumer;
    }
}
