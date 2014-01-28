(ns defjam.core)

(defn storage [matching-sock-color dresser-drawer]
  (filter #{matching-sock-color} dresser-drawer))

