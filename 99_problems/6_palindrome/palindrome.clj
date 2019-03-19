(defn palindrome? [string]
  (= (apply str(reverse string)) string)
)