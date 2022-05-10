(ns clojure.examples.hello
	(:gen-class))

; Function that prints whether parameter is prime  
(defn is-prime [num div]                     ; Function name and parameters 
    (if(= div 1)                             ; If this recursive step is about to use 1 as a divisor then its prime
        (println "Is prime: true") 
        (if(= (rem num div) 0)               ; If the number has no remainder when divided then its not a prime
            (println "Is prime: false") 
            (is-prime num (- div 1)))))      ; Else recursively call function with divisor decremented

; Function that prints whether parameter is fibonacci  
(defn is-fibonacci [num n2 n3]                ; Function name and parameters 
    (if(= num n3)                             ; If the number param is equal to fibonacci param then its a fibonacci
        (println "Is fibonacci: true")     
        (if(< n3 num)                         ; If the fibonacci param is less than the number checked get next fibonacci
            (is-fibonacci num n3 (+ n2 n3))   ; Else recursively call function with next fibonacci numbers
            (println "Is fibonacci: false"))))

; Function that prints whether parameter is square number  
(defn is-square [num index]                  ; Function name and parameters 
    (if(= num (* index index))               ; If number is equal to the index squared then print that it is square
        (println "Is square: true")  
        (if(> (* index index) num)           ; If index squared is greater than the number then print its not sqaure
            (println "Is square: false") 
            (is-square num (+ index 1)))))   ; Else recursively call function with index incremented

; Function that prints whether parameter is triangular number        
(defn is-triangle [num index]                ; Function name and parameters  
    (if(= num (/ (* index (+ index 1)) 2))   ; Check if number is equal to triangular number
        (println "Is triangle: true") 
        (if(> index num)                     ; If triangular number is greater than number its not triangular
            (println "Is triangle: false") 
            (is-triangle num (+ index 1))))) ; Else Recursively call function with second parameter incremented
      
; This is simply for taking the input and running all the previous functions
(defn num-analysis [num]                     ; Function name and parameter
    (if(= num 1)                             ; If input is 1 then dont run function just print false
        (println "Is prime: false") 
        (is-prime num (- num 1)))            ; Else run prime function
    (is-fibonacci num 1 1)
    (is-square num 1)
    (is-triangle num 1))

; Call num-analysis function with input parsed to an integer
(num-analysis (Integer/parseInt (read-line)))


(num-analysis (Integer/parseInt (read-line)))