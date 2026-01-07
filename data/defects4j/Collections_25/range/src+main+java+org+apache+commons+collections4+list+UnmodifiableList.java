{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/list/UnmodifiableList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractSerializableListDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 38,
      "end_line": 148,
      "comment": "\n * Decorates another \u003ccode\u003eList\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.unmodifiableList(java.util.List\u003c? extends E\u003e)",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * Factory method to create an unmodifiable list.\n     *\n     * @param \u003cE\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @return a new unmodifiable list\n     * @throws IllegalArgumentException if list is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.UnmodifiableList(java.util.List\u003c? extends E\u003e)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param list  the list to decorate, must not be null\n     * @throws IllegalArgumentException if list is null\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.iterator()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.add(java.lang.Object)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.clear()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.remove(java.lang.Object)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.listIterator()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.listIterator(int)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.add(int, E)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.remove(int)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.set(int, E)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.UnmodifiableList.subList(int, int)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 68)",
        "(line 145,col 9)-(line 145,col 44)"
      ]
    }
  ]
}