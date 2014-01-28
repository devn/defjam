# defjam

A Clojure library designed to help you _______________. It's like
WinAmp skins meets madlibs. Important stuff.

## Usage

Ummm, yeah, gonna have to wait if you want to actually use this. It's
kind of like this, though:

We have a file with some placeholders:
```clojure
(ns defjam.core)

(defn __verb [__adjective __noun_place]
  (filter #{__adjective} __noun_place))
```

Here goes:
```clojure
user> (require '[defjam.dude :as dude])

user> (dude/choir! "__verb"       "forage"
                   "__adjective"  "shiny"
                   "__noun_place" "sock-drawer")
;=> #'defjam.roar/forage

user> (forage :pocket-watch [:selfies :raisins :pocket-watch :undies])
;=> (:pocket-watch)
```

## License

Copyright © 2014 Devin Walters
