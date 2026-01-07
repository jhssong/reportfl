{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/NullIsExceptionPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullIsExceptionPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.PredicateDecorator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 90,
      "comment": "\n * Predicate implementation that throws an exception if the input is null.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The predicate to decorate "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NullIsExceptionPredicate.nullIsExceptionPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 46,
      "end_line": 51,
      "comment": "\n     * Factory to create the null exception predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicate  the predicate to decorate, not null\n     * @return the predicate\n     * @throws NullPointerException if the predicate is null\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.NullIsExceptionPredicate.NullIsExceptionPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003enullIsExceptionPredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicate  the predicate to call after the null check\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NullIsExceptionPredicate.evaluate(T)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Evaluates the predicate returning the result of the decorated predicate\n     * once a null check is performed.\n     *\n     * @param object  the input object\n     * @return true if decorated predicate returns true\n     * @throws FunctorException if input is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NullIsExceptionPredicate.getPredicates()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Gets the predicate being decorated.\n     *\n     * @return the predicate as the only element in an array\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 46)"
      ]
    }
  ]
}