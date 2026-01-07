{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/NotPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.PredicateDecorator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 84,
      "comment": "\n * Predicate implementation that returns the opposite of the decorated predicate.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.functors.NotPredicate.notPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Factory to create the not predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicate  the predicate to decorate, not null\n     * @return the predicate\n     * @throws NullPointerException if the predicate is null\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.NotPredicate.NotPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003enotPredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicate  the predicate to call after the null check\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)",
        "(line 60,col 9)-(line 60,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NotPredicate.evaluate(T)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Evaluates the predicate returning the opposite to the stored predicate.\n     *\n     * @param object  the input object\n     * @return true if predicate returns false\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NotPredicate.getPredicates()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Gets the predicate being decorated.\n     *\n     * @return the predicate as the only element in an array\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 44)"
      ]
    }
  ]
}