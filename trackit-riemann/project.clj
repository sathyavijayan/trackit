(defproject samsara/trackit-riemann (-> "../trackit.version" slurp .trim)

  :description
  "TRACKit! A Clojure developer friendly wrapper for Yammer's Metrics library."

  :url "https://github.com/samsara/trackit"

  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[com.aphyr/riemann-java-client "0.4.1"]
                 [com.aphyr/metrics3-riemann-reporter "0.4.1"]])
