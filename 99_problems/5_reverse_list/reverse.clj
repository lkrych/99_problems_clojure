(defn recursive-reverse [list]
  (if (empty? list) []
  (conj (recursive-reverse (rest list)) (first list))))