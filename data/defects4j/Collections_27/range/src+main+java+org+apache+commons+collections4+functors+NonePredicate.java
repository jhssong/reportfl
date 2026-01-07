{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/NonePredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonePredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.AbstractQuantifierPredicate\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 102,
      "comment": "\n * Predicate implementation that returns true if none of the\n * predicates return true.\n * If the array of predicates is empty, then this predicate returns true.\n * \u003cp\u003e\n * NOTE: In versions prior to 3.2 an array size of zero or one\n * threw an exception.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.functors.NonePredicate.nonePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * Factory to create the predicate.\n     * \u003cp\u003e\n     * If the array is size zero, the predicate always returns true.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicates  the predicates to check, cloned, not null\n     * @return the \u003ccode\u003eany\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 42)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NonePredicate.nonePredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Factory to create the predicate.\n     * \u003cp\u003e\n     * If the collection is size zero, the predicate always returns true.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param predicates  the predicates to check, cloned, not null\n     * @return the \u003ccode\u003eone\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 79)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.NonePredicate.NonePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003enonePredicate\u003c/code\u003e if you want that.\n     *\n     * @param predicates  the predicates to check, not cloned, not null\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NonePredicate.evaluate(T)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\n     * Evaluates the predicate returning false if any stored predicate returns false.\n     *\n     * @param object  the input object\n     * @return true if none of decorated predicates return true\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    }
  ]
}