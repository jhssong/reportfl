{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/OrPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.PredicateDecorator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 92,
      "comment": "\n * Predicate implementation that returns true if either of the predicates return true.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "iPredicate1"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The array of predicates to call "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicate2"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The array of predicates to call "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.OrPredicate.orPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Factory to create the predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicate1  the first predicate to check, not null\n     * @param predicate2  the second predicate to check, not null\n     * @return the \u003ccode\u003eand\u003c/code\u003e predicate\n     * @throws NullPointerException if either predicate is null\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.OrPredicate.OrPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eorPredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicate1  the first predicate to check, not null\n     * @param predicate2  the second predicate to check, not null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 33)",
        "(line 66,col 9)-(line 66,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.OrPredicate.evaluate(T)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Evaluates the predicate returning true if either predicate returns true.\n     *\n     * @param object  the input object\n     * @return true if either decorated predicate returns true\n     ",
      "child_ranges": [
        "(line 77,col 8)-(line 77,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.OrPredicate.getPredicates()",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * Gets the two predicates being decorated as an array.\n     *\n     * @return the predicates\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 58)"
      ]
    }
  ]
}