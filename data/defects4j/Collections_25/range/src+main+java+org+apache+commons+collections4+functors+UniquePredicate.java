{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/UniquePredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniquePredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 70,
      "comment": "\n * Predicate implementation that returns true the first time an object is\n * passed into the predicate.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iSet"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The set of previously seen objects "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.UniquePredicate.uniquePredicate()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Factory to create the predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @return the predicate\n     * @throws IllegalArgumentException if the predicate is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.UniquePredicate.UniquePredicate()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003euniquePredicate\u003c/code\u003e if you want that.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.UniquePredicate.evaluate(T)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Evaluates the predicate returning true if the input object hasn\u0027t been\n     * received yet.\n     *\n     * @param object  the input object\n     * @return true if this is the first time the object is seen\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 32)"
      ]
    }
  ]
}