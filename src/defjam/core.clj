(ns defjam.core)

(defn __verb [__adjective __noun_place]
  (filter #{__adjective} __noun_place))
