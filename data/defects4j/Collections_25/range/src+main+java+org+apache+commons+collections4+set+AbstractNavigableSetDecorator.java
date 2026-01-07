{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/set/AbstractNavigableSetDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractNavigableSetDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSortedSetDecorator\u003cE\u003e",
        "java.util.NavigableSet\u003cE\u003e"
      ],
      "begin_line": 31,
      "end_line": 122,
      "comment": "\n * Decorates another \u003ccode\u003eNavigableSet\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated set.\n *\n * @param \u003cE\u003e the type of the elements in the navigable set\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.AbstractNavigableSetDecorator()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.AbstractNavigableSetDecorator(java.util.NavigableSet\u003cE\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws IllegalArgumentException if set is null\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.decorated()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Gets the set being decorated.\n     *\n     * @return the decorated set\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.lower(E)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.floor(E)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.ceiling(E)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.higher(E)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.pollFirst()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.pollLast()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.descendingSet()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.descendingIterator()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.subSet(E, boolean, E, boolean)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.headSet(E, boolean)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetDecorator.tailSet(E, boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 59)"
      ]
    }
  ]
}