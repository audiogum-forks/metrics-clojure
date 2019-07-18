(defproject audiogum/metrics-clojure-riemann "3.0.0"
  :description "Riemann reporter integration for metrics-clojure"
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[audiogum/metrics-clojure "3.0.0"]
                 [io.riemann/metrics3-riemann-reporter "0.4.6"]])
