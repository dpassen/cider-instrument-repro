# cider-instrument-repro

## To exhibit the issue

With cursor placed just after the definition of `can-instrument`,
type `C-u C-M-x`, `cider-eval-defun-at-point`.
The function definition is evaled and instrumented.

With cursor placed just after the definition of `can-not-instrument`,
type `C-u C-M-x`, `cider-eval-defun-at-point`.
An error is thrown:

```clojure
class clojure.lang.Symbol cannot be cast to class clojure.lang.Keyword (clojure.lang.Symbol and clojure.lang.Keyword are in unnamed module of loader 'app')
```
