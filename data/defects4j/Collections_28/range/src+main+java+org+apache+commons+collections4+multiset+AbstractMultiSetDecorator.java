{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multiset/AbstractMultiSetDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiSetDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "org.apache.commons.collections4.MultiSet\u003cE\u003e"
      ],
      "begin_line": 32,
      "end_line": 107,
      "comment": "\n * Decorates another \u003ccode\u003eMultSet\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated multiset.\n *\n * @since 4.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.AbstractMultiSetDecorator()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.AbstractMultiSetDecorator(org.apache.commons.collections4.MultiSet\u003cE\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param multiset  the multiset to decorate, must not be null\n     * @throws NullPointerException if multiset is null\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.decorated()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Gets the multiset being decorated.\n     *\n     * @return the decorated multiset\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.equals(java.lang.Object)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.hashCode()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.getCount(java.lang.Object)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.setCount(E, int)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.add(E, int)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.remove(java.lang.Object, int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.uniqueSet()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator.entrySet()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 38)"
      ]
    }
  ]
}