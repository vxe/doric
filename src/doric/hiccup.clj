(ns doric.hiccup
  (:refer-clojure :exclude [join])
  (:require [hickory.core])
  (:use [clojure.string :only [join]]
        [doric.core :only [unaligned-th unaligned-td]]))

(def th unaligned-th)

(def td unaligned-td)

(defn render [table]
  (hickory.core/as-hiccup
   (hickory.core/parse
    (concat ["<table>"
             (str "<tr>" (join (for [c (first table)]
                                 (str "<th>" c "</th>"))) "</tr>")]
            (for [tr (rest table)]
              (str "<tr>" (join (for [c tr]
                                  (str "<td>" c "</td>"))) "</tr>"))
            ["</table>"]))))
