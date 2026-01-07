{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/multiset/PredicatedMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.PredicatedCollection\u003cE\u003e",
        "org.apache.commons.collections4.MultiSet\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 137,
      "comment": "\n * Decorates another {@link MultiSet} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This multiset exists to provide validation for the decorated multiset.\n * It is normally created to decorate an empty multiset.\n * If an object cannot be added to the multiset, an {@link IllegalArgumentException}\n * is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the multiset.\n * \u003cpre\u003e\n * MultiSet\u0026lt;E\u0026gt; set \u003d\n *      PredicatedMultiSet.predicatedMultiSet(new HashMultiSet\u0026lt;E\u0026gt;(),\n *                                            NotNullPredicate.notNullPredicate());\n * \u003c/pre\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.predicatedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Factory method to create a predicated (validating) multiset.\n     * \u003cp\u003e\n     * If there are any elements already in the multiset being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the type of the elements in the multiset\n     * @param multiset  the multiset to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated MultiSet\n     * @throws NullPointerException if multiset or predicate is null\n     * @throws IllegalArgumentException if the multiset contains invalid elements\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.PredicatedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the multiset being decorated, they\n     * are validated.\n     *\n     * @param multiset  the multiset to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if multiset or predicate is null\n     * @throws IllegalArgumentException if the multiset contains invalid elements\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.decorated()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Gets the decorated multiset.\n     *\n     * @return the decorated multiset\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.equals(java.lang.Object)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.hashCode()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.add(E, int)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 25)",
        "(line 108,col 9)-(line 108,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.remove(java.lang.Object, int)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.getCount(java.lang.Object)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.setCount(E, int)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 25)",
        "(line 124,col 9)-(line 124,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.uniqueSet()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.PredicatedMultiSet.entrySet()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 38)"
      ]
    }
  ]
}