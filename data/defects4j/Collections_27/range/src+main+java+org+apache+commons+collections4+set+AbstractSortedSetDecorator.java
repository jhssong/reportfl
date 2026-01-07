{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/set/AbstractSortedSetDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedSetDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSetDecorator\u003cE\u003e",
        "java.util.SortedSet\u003cE\u003e"
      ],
      "begin_line": 32,
      "end_line": 92,
      "comment": "\n * Decorates another \u003ccode\u003eSortedSet\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated set.\n *\n * @param \u003cE\u003e the type of the elements in the sorted set\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.AbstractSortedSetDecorator()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.AbstractSortedSetDecorator(java.util.Set\u003cE\u003e)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws NullPointerException if set is null\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.decorated()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Gets the set being decorated.\n     *\n     * @return the decorated set\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.subSet(E, E)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.headSet(E)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.tailSet(E)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.first()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.last()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetDecorator.comparator()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 40)"
      ]
    }
  ]
}