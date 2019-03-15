(defn kth_element [k list]
  (if (= k 1) 
    (first list)
    (kth_element (- k 1) (rest list))
    )
  )