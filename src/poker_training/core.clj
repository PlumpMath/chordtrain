(ns poker-training.core
  (require [org.httpkit.server :refer (with-channel on-close on-receive send! run-server)]))

(defn handler [request]
  (with-channel request channel
    (on-close channel (fn [status] (println "channel closed: " status)))
    (on-receive channel (fn [data] ;; echo it back
                          (send! channel data)))))

(run-server handler {:port 9090})
