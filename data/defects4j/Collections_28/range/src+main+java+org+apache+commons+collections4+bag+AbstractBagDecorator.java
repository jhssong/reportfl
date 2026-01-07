{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/bag/AbstractBagDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractBagDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 32,
      "end_line": 98,
      "comment": "\n * Decorates another \u003ccode\u003eBag\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated bag.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.AbstractBagDecorator()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.AbstractBagDecorator(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.decorated()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Gets the bag being decorated.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.equals(java.lang.Object)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.hashCode()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.getCount(java.lang.Object)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.add(E, int)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.remove(java.lang.Object, int)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagDecorator.uniqueSet()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 39)"
      ]
    }
  ]
}