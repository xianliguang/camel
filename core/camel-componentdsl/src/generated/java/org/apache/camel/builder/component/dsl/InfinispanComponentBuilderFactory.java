/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.infinispan.InfinispanComponent;

/**
 * Read and write from/to Infinispan distributed key/value store and data grid.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface InfinispanComponentBuilderFactory {

    /**
     * Infinispan (camel-infinispan)
     * Read and write from/to Infinispan distributed key/value store and data
     * grid.
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.13
     * Maven coordinates: org.apache.camel:camel-infinispan
     */
    static InfinispanComponentBuilder infinispan() {
        return new InfinispanComponentBuilderImpl();
    }

    /**
     * Builder for the Infinispan component.
     */
    interface InfinispanComponentBuilder
            extends
                ComponentBuilder<InfinispanComponent> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.infinispan.InfinispanConfiguration</code> type.
         * 
         * Group: common
         */
        default InfinispanComponentBuilder configuration(
                org.apache.camel.component.infinispan.InfinispanConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Specifies the host of the cache on Infinispan instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default InfinispanComponentBuilder hosts(java.lang.String hosts) {
            doSetProperty("hosts", hosts);
            return this;
        }
        /**
         * Specifies the query builder.
         * 
         * The option is a:
         * <code>org.apache.camel.component.infinispan.InfinispanQueryBuilder</code> type.
         * 
         * Group: common
         */
        default InfinispanComponentBuilder queryBuilder(
                org.apache.camel.component.infinispan.InfinispanQueryBuilder queryBuilder) {
            doSetProperty("queryBuilder", queryBuilder);
            return this;
        }
        /**
         * Define if we are connecting to a secured Infinispan instance.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default InfinispanComponentBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default InfinispanComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If true, the listener will be installed for the entire cluster.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default InfinispanComponentBuilder clusteredListener(
                boolean clusteredListener) {
            doSetProperty("clusteredListener", clusteredListener);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: PUT
         * Group: consumer
         */
        @Deprecated
        default InfinispanComponentBuilder command(java.lang.String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Returns the custom listener in use, if provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.infinispan.InfinispanCustomListener</code> type.
         * 
         * Group: consumer
         */
        default InfinispanComponentBuilder customListener(
                org.apache.camel.component.infinispan.InfinispanCustomListener customListener) {
            doSetProperty("customListener", customListener);
            return this;
        }
        /**
         * Specifies the set of event types to register by the consumer.
         * Multiple event can be separated by comma. The possible event types
         * are: CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED,
         * CACHE_ENTRY_VISITED, CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED,
         * CACHE_ENTRY_CREATED, CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED,
         * TRANSACTION_COMPLETED, TRANSACTION_REGISTERED,
         * CACHE_ENTRY_INVALIDATED, DATA_REHASHED, TOPOLOGY_CHANGED,
         * PARTITION_STATUS_CHANGED.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default InfinispanComponentBuilder eventTypes(
                java.lang.String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * If true, the consumer will receive notifications synchronously.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default InfinispanComponentBuilder sync(boolean sync) {
            doSetProperty("sync", sync);
            return this;
        }
        /**
         * Set a specific default value for some producer operations.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default InfinispanComponentBuilder defaultValue(
                java.lang.Object defaultValue) {
            doSetProperty("defaultValue", defaultValue);
            return this;
        }
        /**
         * Set a specific key for producer operations.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default InfinispanComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default InfinispanComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set a specific old value for some producer operations.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default InfinispanComponentBuilder oldValue(java.lang.Object oldValue) {
            doSetProperty("oldValue", oldValue);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.infinispan.InfinispanOperation</code> type.
         * 
         * Default: PUT
         * Group: producer
         */
        default InfinispanComponentBuilder operation(
                org.apache.camel.component.infinispan.InfinispanOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set a specific value for producer operations.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default InfinispanComponentBuilder value(java.lang.Object value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * Define the password to access the infinispan instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group:  security
         */
        default InfinispanComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Define the SASL Mechanism to access the infinispan instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group:  security
         */
        default InfinispanComponentBuilder saslMechanism(
                java.lang.String saslMechanism) {
            doSetProperty("saslMechanism", saslMechanism);
            return this;
        }
        /**
         * Define the security realm to access the infinispan instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group:  security
         */
        default InfinispanComponentBuilder securityRealm(
                java.lang.String securityRealm) {
            doSetProperty("securityRealm", securityRealm);
            return this;
        }
        /**
         * Define the security server name to access the infinispan instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group:  security
         */
        default InfinispanComponentBuilder securityServerName(
                java.lang.String securityServerName) {
            doSetProperty("securityServerName", securityServerName);
            return this;
        }
        /**
         * Define the username to access the infinispan instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group:  security
         */
        default InfinispanComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default InfinispanComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Specifies the cache Container to connect.
         * 
         * The option is a:
         * <code>org.infinispan.commons.api.BasicCacheContainer</code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder cacheContainer(
                org.infinispan.commons.api.BasicCacheContainer cacheContainer) {
            doSetProperty("cacheContainer", cacheContainer);
            return this;
        }
        /**
         * The CacheContainer configuration. Uses if the cacheContainer is not
         * defined. Must be the following types:
         * org.infinispan.client.hotrod.configuration.Configuration - for remote
         * cache interaction configuration;
         * org.infinispan.configuration.cache.Configuration - for embedded cache
         * interaction configuration;.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder cacheContainerConfiguration(
                java.lang.Object cacheContainerConfiguration) {
            doSetProperty("cacheContainerConfiguration", cacheContainerConfiguration);
            return this;
        }
        /**
         * Implementation specific properties for the CacheManager.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.String></code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder configurationProperties(
                java.util.Map<java.lang.String, java.lang.String> configurationProperties) {
            doSetProperty("configurationProperties", configurationProperties);
            return this;
        }
        /**
         * An implementation specific URI for the CacheManager.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder configurationUri(
                java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * A comma separated list of Flag to be applied by default on each cache
         * invocation, not applicable to remote caches.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder flags(java.lang.String flags) {
            doSetProperty("flags", flags);
            return this;
        }
        /**
         * Set a specific remappingFunction to use in a compute operation.
         * 
         * The option is a: <code>java.util.function.BiFunction</code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder remappingFunction(
                java.util.function.BiFunction remappingFunction) {
            doSetProperty("remappingFunction", remappingFunction);
            return this;
        }
        /**
         * Store the operation result in a header instead of the message body.
         * By default, resultHeader == null and the query result is stored in
         * the message body, any existing content in the message body is
         * discarded. If resultHeader is set, the value is used as the name of
         * the header to store the query result and the original message body is
         * preserved. This value can be overridden by an in message header
         * named: CamelInfinispanOperationResultHeader.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: advanced
         */
        default InfinispanComponentBuilder resultHeader(
                java.lang.Object resultHeader) {
            doSetProperty("resultHeader", resultHeader);
            return this;
        }
    }

    class InfinispanComponentBuilderImpl
            extends
                AbstractComponentBuilder<InfinispanComponent>
            implements
                InfinispanComponentBuilder {
        @Override
        protected InfinispanComponent buildConcreteComponent() {
            return new InfinispanComponent();
        }
        private org.apache.camel.component.infinispan.InfinispanConfiguration getOrCreateConfiguration(
                org.apache.camel.component.infinispan.InfinispanComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.infinispan.InfinispanConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((InfinispanComponent) component).setConfiguration((org.apache.camel.component.infinispan.InfinispanConfiguration) value); return true;
            case "hosts": getOrCreateConfiguration((InfinispanComponent) component).setHosts((java.lang.String) value); return true;
            case "queryBuilder": getOrCreateConfiguration((InfinispanComponent) component).setQueryBuilder((org.apache.camel.component.infinispan.InfinispanQueryBuilder) value); return true;
            case "secure": getOrCreateConfiguration((InfinispanComponent) component).setSecure((boolean) value); return true;
            case "bridgeErrorHandler": ((InfinispanComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "clusteredListener": getOrCreateConfiguration((InfinispanComponent) component).setClusteredListener((boolean) value); return true;
            case "command": getOrCreateConfiguration((InfinispanComponent) component).setCommand((java.lang.String) value); return true;
            case "customListener": getOrCreateConfiguration((InfinispanComponent) component).setCustomListener((org.apache.camel.component.infinispan.InfinispanCustomListener) value); return true;
            case "eventTypes": getOrCreateConfiguration((InfinispanComponent) component).setEventTypes((java.lang.String) value); return true;
            case "sync": getOrCreateConfiguration((InfinispanComponent) component).setSync((boolean) value); return true;
            case "defaultValue": getOrCreateConfiguration((InfinispanComponent) component).setDefaultValue((java.lang.Object) value); return true;
            case "key": getOrCreateConfiguration((InfinispanComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((InfinispanComponent) component).setLazyStartProducer((boolean) value); return true;
            case "oldValue": getOrCreateConfiguration((InfinispanComponent) component).setOldValue((java.lang.Object) value); return true;
            case "operation": getOrCreateConfiguration((InfinispanComponent) component).setOperation((org.apache.camel.component.infinispan.InfinispanOperation) value); return true;
            case "value": getOrCreateConfiguration((InfinispanComponent) component).setValue((java.lang.Object) value); return true;
            case "password": getOrCreateConfiguration((InfinispanComponent) component).setPassword((java.lang.String) value); return true;
            case "saslMechanism": getOrCreateConfiguration((InfinispanComponent) component).setSaslMechanism((java.lang.String) value); return true;
            case "securityRealm": getOrCreateConfiguration((InfinispanComponent) component).setSecurityRealm((java.lang.String) value); return true;
            case "securityServerName": getOrCreateConfiguration((InfinispanComponent) component).setSecurityServerName((java.lang.String) value); return true;
            case "username": getOrCreateConfiguration((InfinispanComponent) component).setUsername((java.lang.String) value); return true;
            case "autowiredEnabled": ((InfinispanComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "cacheContainer": getOrCreateConfiguration((InfinispanComponent) component).setCacheContainer((org.infinispan.commons.api.BasicCacheContainer) value); return true;
            case "cacheContainerConfiguration": getOrCreateConfiguration((InfinispanComponent) component).setCacheContainerConfiguration((java.lang.Object) value); return true;
            case "configurationProperties": getOrCreateConfiguration((InfinispanComponent) component).setConfigurationProperties((java.util.Map) value); return true;
            case "configurationUri": getOrCreateConfiguration((InfinispanComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "flags": getOrCreateConfiguration((InfinispanComponent) component).setFlags((java.lang.String) value); return true;
            case "remappingFunction": getOrCreateConfiguration((InfinispanComponent) component).setRemappingFunction((java.util.function.BiFunction) value); return true;
            case "resultHeader": getOrCreateConfiguration((InfinispanComponent) component).setResultHeader((java.lang.Object) value); return true;
            default: return false;
            }
        }
    }
}