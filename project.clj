(defproject riemann-rabbitmq-plugin "0.1.1-SNAPSHOT"
  :description "A RabbitMQ plugin for Riemann"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.novemberain/langohr "3.1.0" :exclusions [cheshire clj-http]]
                 ]
  :plugins [[codox "0.6.1"]
            [lein-midje "3.0.0"]
            [lein-rpm "0.0.5"
             :exclusions [org.apache.maven/maven-plugin-api
                          org.codehaus.plexus/plexus-container-default
                          org.codehaus.plexus/plexus-utils
                          org.clojure/clojure
                          classworlds]]
            ; for lein-rpm
            [org.apache.maven/maven-plugin-api "2.0"]
            [org.codehaus.plexus/plexus-container-default
             "1.0-alpha-9-stable-1"]
            [org.codehaus.plexus/plexus-utils "1.5.15"]
            [classworlds "1.1"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]
                                  [riemann "0.2.10"]
                                  ]}}
  :codox {:src-linenum-anchor-prefix "L"
  :src-dir-uri "https://github.com/avishai-ish-shalom/riemann-rabbitmq-plugin/blob/master"})
