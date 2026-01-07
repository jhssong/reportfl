{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/AbstractSortedBagDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedBagDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractBagDecorator\u003cE\u003e",
        "org.apache.commons.collections4.SortedBag\u003cE\u003e"
      ],
      "begin_line": 31,
      "end_line": 82,
      "comment": "\n * Decorates another \u003ccode\u003eSortedBag\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated bag.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagDecorator.AbstractSortedBagDecorator()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagDecorator.AbstractSortedBagDecorator(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagDecorator.decorated()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Gets the bag being decorated.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagDecorator.first()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagDecorator.last()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagDecorator.comparator()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 40)"
      ]
    }
  ]
}