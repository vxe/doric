(defproject doric "0.10.0-SNAPSHOT"
  :description "Clojure table layout"
  :url "https://github.com/joegallo/doric"
  :dependencies [[hickory "0.7.1"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:1.2 {:dependencies [[org.clojure/clojure "1.2.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :dev {:dependencies [[org.clojure/clojure "1.6.0"]
                                  [org.apache.poi/poi "3.10.1"]]}}
  :aliases {"all" ["with-profile" "dev,1.2:dev,1.3:dev,1.4:dev,1.5:dev"]})
