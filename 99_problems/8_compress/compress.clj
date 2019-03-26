(defn compress [list] 
  (if (empty? list) 
    []
      (if (= (first list) (second list))
        (compress (rest list)) ; skip first element
        (cons (first list) (compress (rest list)) )
      )
  )
)