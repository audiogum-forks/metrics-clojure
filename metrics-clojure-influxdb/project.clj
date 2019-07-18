(defproject audiogum/metrics-clojure-influxdb "3.0.0"
  :description "InfluxDB reporter integration for metrics-clojure"
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[audiogum/metrics-clojure "3.0.0"]
                 [com.izettle/dropwizard-metrics-influxdb "1.2.3"]])
