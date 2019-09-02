(defproject {{cookiecutter.name}} "0.1.0-SNAPSHOT"
  :description "TODO: write a description"

  :url "{{cookiecutter.repository}}"
  :scm {:name "GIT" :url "{{cookiecutter.repository}}"}
  :license {:name "{{cookiecutter.license}}" :url "https://opensource.org/licenses/{{cookiecutter.license}}"}

  :test-paths ["test"]
  :source-paths ["src"]
  :resource-paths ["res"]

  :plugins [[lein-npm "0.6.2"]
            [lein-cljfmt "0.6.4"]
            [lein-githooks "0.1.0"]]

  :aliases {"fig"       ["trampoline" "run" "-m" "figwheel.main"]
            "fig:min"   ["run" "-m" "figwheel.main" "-O" "advanced" "-bo" "dev"]
            "fig:build" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "fig:test"  ["run" "-m" "figwheel.main" "-co" "test.cljs.edn" "-m" {{cookiecutter.name}}.tests]}

  :profiles {:dev {:githooks {:pre-commit ["lein cljsbuild test"
                                           "lein cljfmt fix"
                                           "lein check"]}
                   :dependencies [[com.bhauman/figwheel-main "0.1.9"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]]}}

  :dependencies [[reagent "0.8.1"]
                 [org.clojure/clojure "{{cookiecutter.clojure}}"]
                 [org.clojure/clojurescript "{{cookiecutter.clojurescript}}"]])


