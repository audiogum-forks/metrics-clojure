(defproject audiogum/metrics-clojure-jvm "3.0.0"
  :description "Gluing together metrics-clojure and jvm instrumentation."
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[audiogum/metrics-clojure "3.0.0"]
                 [io.dropwizard.metrics/metrics-jvm "4.1.0"]])
