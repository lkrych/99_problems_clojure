(defn last_element [list]
  (cond
    (empty? list) nil
    (= (count list) 1) (first list)
    :else (last_element (rest list))
  )
)