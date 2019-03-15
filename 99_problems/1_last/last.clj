(defn last_list [list]
  (cond
  (empty? list) nil
  (= 1 (count list)) (first list)
  :else (last_list (rest list))
  )
)