(defn second_to_last [list]
  (cond
    (empty? list) nil
    (= 2 (count list)) (first list)
    :else (second_to_last (rest list))
  )
)