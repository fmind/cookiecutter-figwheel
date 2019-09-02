(ns {{cookiecutter.name}}.tests
    (:require [{{cookiecutter.name}}.core-test]
              [figwheel.main.testing :refer [run-tests-async]]))

(defn -main
  [& args]
  (run-tests-async 5000))
