(defn rev [list]
  (cond
    (empty? list) nil
    :else (concat (rev (rest list)) (first list))
))