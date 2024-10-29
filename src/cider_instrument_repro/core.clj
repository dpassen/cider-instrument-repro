(ns cider-instrument-repro.core)

(defn can-instrument
  [{one   :one
    two   :two
    three :three
    four  :four
    five  :five
    six   :six
    seven :seven
    eight :eight}]
  (format "%s-%s-%s-%s-%s-%s-%s-%s" one two three four five six seven eight))

(defn can-not-instrument
  [{one   :one
    two   :two
    three :three
    four  :four
    five  :five
    six   :six
    seven :seven
    eight :eight
    nine  :nine}]
  (format "%s-%s-%s-%s-%s-%s-%s-%s-%s" one two three four five six seven eight nine))
