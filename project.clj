(defproject poker-training "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [http-kit "2.1.13"]

                 [org.clojure/clojurescript "0.0-2080"]
;;                 [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]
                 [org.clojure/core.async "0.1.256.0-1bf8cf-alpha"]


                 ;; Uncommenting this causes lein-cljsbuild to break!
                 ;;[ring/ring-core "1.2.0"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.4"]

                 [jarohen/chord "0.2.1"]
                 [prismatic/dommy "0.1.2"]

                 ]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild {:builds {:main {}}})
