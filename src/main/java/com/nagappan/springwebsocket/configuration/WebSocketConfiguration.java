package com.nagappan.springwebsocket.configuration;

import com.nagappan.springwebsocket.handler.AnalyticsHandler;
import com.nagappan.springwebsocket.handler.MyMessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

    @Bean
    public WebSocketHandler myMessageHandler() {
        return new MyMessageHandler();
    }

    @Bean
    public WebSocketHandler getAnalyticsHandler() { return new AnalyticsHandler(); }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        System.out.println("websocket endpoint handler");
        registry.addHandler(myMessageHandler(), "/my-websocket-endpoint");
        registry.addHandler(getAnalyticsHandler(), "/analytics-endpoint");
    }

}

