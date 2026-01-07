{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/NullIsTruePredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullIsTruePredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.PredicateDecorator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 88,
      "comment": "\n * Predicate implementation that returns true if the input is null.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicate"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The predicate to decorate "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NullIsTruePredicate.nullIsTruePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Factory to create the null true predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicate  the predicate to decorate, not null\n     * @return the predicate\n     * @throws IllegalArgumentException if the predicate is null\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.NullIsTruePredicate.NullIsTruePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003enullIsTruePredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicate  the predicate to call after the null check\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)",
        "(line 60,col 9)-(line 60,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NullIsTruePredicate.evaluate(T)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Evaluates the predicate returning the result of the decorated predicate\n     * once a null check is performed.\n     *\n     * @param object  the input object\n     * @return true if decorated predicate returns true or input is null\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NullIsTruePredicate.getPredicates()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Gets the predicate being decorated.\n     *\n     * @return the predicate as the only element in an array\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 46)"
      ]
    }
  ]
}