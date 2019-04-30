# A project demonstrating an issue with karma & shadow-cljs

## To reproduce:

1. Start shadow-cljs: `shadow-cljs watch karma`
1. Start karma: `karma start`
1. Expect 1 failing test
1. Add another test to `test/karma_test_refresh_example/core.cljs` such as:
```clojure
(deftest foobar2
  (is (= 2 3)))
```

### Expected behaviour
I expect karma to detect the new test and log that there are 2 failing tests

### Actual behaviour
Karma does not log the new failing test

### Workaround
1. Delete `.shadow-cljs` and re-run `shadow-cljs watch karma`
1. Karma will now log 2 failing tests
