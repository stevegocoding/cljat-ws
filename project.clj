(defproject cljat-ws "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/core.async "0.2.374"]

                 ;; logging
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.1.3"]

                 ;; environ
                 [environ "1.0.2"]

                 ;; http-kit server
                 [http-kit "2.1.18"]

                 ;; redis client
                 [com.taoensso/carmine "2.12.2"]

                 [ring/ring "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-headers "0.1.3"]
                 [ring/ring-mock "0.3.0"]
                 [ring/ring-defaults "0.1.5"]
                 [compojure "1.4.0"]
                 [clj-http "2.1.0"]

                 ;; component framework
                 [com.stuartsierra/component "0.3.1"]

                 ;; schema
                 [prismatic/schema "1.0.5"]]

  :plugins [[lein-pprint "1.1.1"]
            [lein-environ "1.0.2"]]

  ;;; Entry Point
  :main cljat-ws.main
  :nrepl-options {:init-ns user}
 
  :profiles {
             :dev [:project-dev :local-dev]
             :test {:env {:cljat-env "test"}}
             :prod {:env {:cljat-env "production"}}
             :project-dev {:source-paths ["dev"]
                           :dependencies [[org.clojure/java.classpath "0.2.3"]]
                           :host "0.0.0.0"
                           :env {:cljat-env "development"}}
             
             ;; be overriden by the values from  profiles.clj
             :local-dev {}

             ;; uberjar task profile
             ;; The :default profile will be removed when generating uberjar
             :uberjar {:aot :all}}
  )
