(ns atmosphere-test
  (:require [clojure.test :refer [deftest is testing]]
            [atmosphere]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (find-ns 'atmosphere)))))
