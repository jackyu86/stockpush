package push.registry.listener;


import push.registry.EventListener;

/**
 * 连接事件监听器
 */
public interface ConnectionListener extends EventListener<ConnectionEvent> {

    /**
     * 广播事件
     *
     * @param event
     */
    void onEvent(ConnectionEvent event);

}
