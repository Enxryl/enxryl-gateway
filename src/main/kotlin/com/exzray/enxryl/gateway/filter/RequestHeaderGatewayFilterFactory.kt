package com.exzray.enxryl.gateway.filter

import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory
import org.springframework.stereotype.Component

@Component
class RequestHeaderGatewayFilterFactory : GatewayFilterFactory<RequestHeaderGatewayFilterFactory.Config> {
    override fun getConfigClass(): Class<Config> {
        return Config::class.java
    }

    override fun apply(config: Config?): GatewayFilter {
        return GatewayFilter { exchange, chain ->
            val request = exchange
                .request
                .mutate()
                .header("X-Username", "nazirul")
                .build()

            val mutatedExchange = exchange.mutate().request(request).build()

            chain.filter(mutatedExchange)
        }
    }

    class Config
}