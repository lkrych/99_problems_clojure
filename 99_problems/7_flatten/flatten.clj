(defn flatten' [coll]
  (if (empty? coll)
    '()
    (let [[head & tail] coll]
      (if (seq? head)
        (concat (flatten' head) (flatten' tail))
        (conj (flatten' tail) head))))
)