{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/AnyPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnyPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.AbstractQuantifierPredicate\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 112,
      "comment": "\n * Predicate implementation that returns true if any of the\n * predicates return true.\n * If the array of predicates is empty, then this predicate returns false.\n * \u003cp\u003e\n * NOTE: In versions prior to 3.2 an array size of zero or one\n * threw an exception.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serial version UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AnyPredicate.anyPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "\n     * Factory to create the predicate.\n     * \u003cp\u003e\n     * If the array is size zero, the predicate always returns false.\n     * If the array is size one, then that predicate is returned.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicates  the predicates to check, cloned, not null\n     * @return the \u003ccode\u003eany\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 42)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AnyPredicate.anyPredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 75,
      "end_line": 85,
      "comment": "\n     * Factory to create the predicate.\n     * \u003cp\u003e\n     * If the collection is size zero, the predicate always returns false.\n     * If the collection is size one, then that predicate is returned.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicates  the predicates to check, cloned, not null\n     * @return the \u003ccode\u003eall\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 79)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AnyPredicate.AnyPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eanyPredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicates  the predicates to check, not cloned, not null\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AnyPredicate.evaluate(T)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Evaluates the predicate returning true if any predicate returns true.\n     *\n     * @param object  the input object\n     * @return true if any decorated predicate return true\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 21)"
      ]
    }
  ]
}