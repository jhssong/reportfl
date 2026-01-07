{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/set/PredicatedSortedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedSortedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.PredicatedSet\u003cE\u003e",
        "java.util.SortedSet\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 128,
      "comment": "\n * Decorates another \u003ccode\u003eSortedSet\u003c/code\u003e to validate that all additions\n * match a specified predicate.\n * \u003cp\u003e\n * This set exists to provide validation for the decorated set.\n * It is normally created to decorate an empty set.\n * If an object cannot be added to the set, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the set.\n * \u003cpre\u003e\n * SortedSet set \u003d\n *   PredicatedSortedSet.predicatedSortedSet(new TreeSet(),\n *                                           NotNullPredicate.notNullPredicate());\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.predicatedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Factory method to create a predicated (validating) sorted set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated sorted set.\n     * @throws NullPointerException if set or predicate is null\n     * @throws IllegalArgumentException if the set contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.PredicatedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are validated.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if set or predicate is null\n     * @throws IllegalArgumentException if the set contains invalid elements\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.decorated()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Gets the sorted set being decorated.\n     *\n     * @return the decorated sorted set\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.comparator()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.first()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.last()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.subSet(E, E)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 76)",
        "(line 113,col 9)-(line 113,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.headSet(E)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 65)",
        "(line 119,col 9)-(line 119,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSortedSet.tailSet(E)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 67)",
        "(line 125,col 9)-(line 125,col 59)"
      ]
    }
  ]
}