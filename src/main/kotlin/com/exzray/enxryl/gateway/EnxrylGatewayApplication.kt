package com.exzray.enxryl.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class EnxrylGatewayApplication

fun main(args: Array<String>) {
    runApplication<EnxrylGatewayApplication>(*args)
}
