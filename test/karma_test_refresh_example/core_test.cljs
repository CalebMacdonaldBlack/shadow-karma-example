(ns karma-test-refresh-example.core-test
  (:require
    [cljs.test :refer-macros [deftest testing is]]))

(deftest foobar
  (is (= 1 2)))

(deftest foobar2
  (is (= 2 3)))
