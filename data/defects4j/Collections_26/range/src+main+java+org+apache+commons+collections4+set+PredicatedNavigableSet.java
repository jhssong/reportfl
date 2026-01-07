{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/set/PredicatedNavigableSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedNavigableSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.PredicatedSortedSet\u003cE\u003e",
        "java.util.NavigableSet\u003cE\u003e"
      ],
      "begin_line": 42,
      "end_line": 152,
      "comment": "\n * Decorates another \u003ccode\u003eNavigableSet\u003c/code\u003e to validate that all additions\n * match a specified predicate.\n * \u003cp\u003e\n * This set exists to provide validation for the decorated set.\n * It is normally created to decorate an empty set.\n * If an object cannot be added to the set, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the set.\n * \u003cpre\u003e\n * NavigableSet set \u003d\n *   PredicatedSortedSet.predicatedNavigableSet(new TreeSet(),\n *                                              NotNullPredicate.notNullPredicate());\n * \u003c/pre\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.predicatedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Factory method to create a predicated (validating) navigable set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated navigable set.\n     * @throws NullPointerException if set or predicate is null\n     * @throws IllegalArgumentException if the set contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.PredicatedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are validated.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if set or predicate is null\n     * @throws IllegalArgumentException if the set contains invalid elements\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.decorated()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Gets the navigable set being decorated.\n     *\n     * @return the decorated navigable set\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.lower(E)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.floor(E)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.ceiling(E)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.higher(E)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.pollFirst()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.pollLast()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.descendingSet()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.descendingIterator()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.subSet(E, boolean, E, boolean)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 107)",
        "(line 137,col 9)-(line 137,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.headSet(E, boolean)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 79)",
        "(line 143,col 9)-(line 143,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedNavigableSet.tailSet(E, boolean)",
      "begin_line": 146,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 81)",
        "(line 149,col 9)-(line 149,col 55)"
      ]
    }
  ]
}