(ns {{cookiecutter.name}}.core-test
    (:require [{{cookiecutter.name}}.core :as sut]
              [cljs.test :as t :include-macros true]))

(t/deftest can-add-numbers
  (t/is (= (+ 1 2) 3)))
