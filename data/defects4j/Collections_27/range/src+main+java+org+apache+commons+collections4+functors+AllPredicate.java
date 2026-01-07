{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/AllPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AllPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.AbstractQuantifierPredicate\u003cT\u003e"
      ],
      "begin_line": 38,
      "end_line": 115,
      "comment": "\n * Predicate implementation that returns true if all the\n * predicates return true.\n * If the array of predicates is empty, then this predicate returns true.\n * \u003cp\u003e\n * NOTE: In versions prior to 3.2 an array size of zero or one\n * threw an exception.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serial version UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicate.allPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 55,
      "end_line": 65,
      "comment": "\n     * Factory to create the predicate.\n     * \u003cp\u003e\n     * If the array is size zero, the predicate always returns true.\n     * If the array is size one, then that predicate is returned.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicates  the predicates to check, cloned, not null\n     * @return the \u003ccode\u003eall\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicate.allPredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 79,
      "end_line": 88,
      "comment": "\n     * Factory to create the predicate.\n     * \u003cp\u003e\n     * If the collection is size zero, the predicate always returns true.\n     * If the collection is size one, then that predicate is returned.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicates  the predicates to check, cloned, not null\n     * @return the \u003ccode\u003eall\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 66)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AllPredicate.AllPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eallPredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicates  the predicates to check, not cloned, not null\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicate.evaluate(T)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\n     * Evaluates the predicate returning true if all predicates return true.\n     *\n     * @param object  the input object\n     * @return true if all decorated predicates return true\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    }
  ]
}