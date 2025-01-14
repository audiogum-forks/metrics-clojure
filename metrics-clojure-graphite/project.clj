(defproject audiogum/metrics-clojure-graphite "3.0.0"
  :description "Graphite reporter integration for metrics-clojure"
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[audiogum/metrics-clojure "3.0.0"]
                 [io.dropwizard.metrics/metrics-graphite "4.1.0"]])
