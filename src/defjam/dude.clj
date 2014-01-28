(ns defjam.dude
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.pprint :as pp]
            [defjam.roar :as roar]))

(def evald
  (let [template (slurp (io/file "/Users/devn/dev/defjam/src/defjam/core.clj"))]
    (-> template
        (str/replace #"__verb"       "storage")
        (str/replace #"__noun_place" "dresser-drawer")
        (str/replace #"__adjective"  "matching-sock-color"))))

(defn roar! []
  (with-open [f (io/writer (io/file "/Users/devn/dev/defjam/src/defjam/roar.clj"))]
    (binding [*out* f]
      (println evald))))

(defn choir! []
  (do (roar!)
      (load-file "/Users/devn/dev/defjam/src/defjam/roar.clj")
      (use '[defjam.roar])
      `(defjam.roar/forage :black-sock [:severed-foot
                                        :green-bean
                                        :milk-dud
                                        :red-sock
                                        :black-sock
                                        :candy-cigs])))

;; (choir!)

;; (roar/snarf :gold [:armpits :banks :clouds :gold :air :gold])
;; (def whoa [["mine" "minerals" "quarry"]
;;            ["search" "cats" "google"]
;;            ["read" "book-title" "library"]
;;            ["pull" "lever" "robot"]])


;; (forage :black-sock [:severed-foot
;;                      :green-bean
;;                      :milk-dud
;;                      :red-sock
;;                      :black-sock
;;                      :candy-cigs])
