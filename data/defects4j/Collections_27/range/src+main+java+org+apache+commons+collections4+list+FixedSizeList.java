{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/list/FixedSizeList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedSizeList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractSerializableListDecorator\u003cE\u003e",
        "org.apache.commons.collections4.BoundedCollection\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 182,
      "comment": "\n * Decorates another \u003ccode\u003eList\u003c/code\u003e to fix the size preventing add/remove.\n * \u003cp\u003e\n * The add, remove, clear and retain operations are unsupported.\n * The set method is allowed (as it doesn\u0027t change the list size).\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(java.util.List\u003cE\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Factory method to create a fixed size list.\n     *\n     * @param \u003cE\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @return a new fixed size list\n     * @throws NullPointerException if list is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.FixedSizeList(java.util.List\u003cE\u003e)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param list  the list to decorate, must not be null\n     * @throws NullPointerException if list is null\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.add(E)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.add(int, E)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.clear()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.get(int)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.indexOf(java.lang.Object)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.iterator()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.lastIndexOf(java.lang.Object)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.listIterator()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.listIterator(int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.remove(int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.remove(java.lang.Object)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.set(int, E)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.subList(int, int)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 68)",
        "(line 154,col 9)-(line 154,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FixedSizeListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 160,
      "end_line": 172,
      "comment": "\n     * List iterator that only permits changes via set()\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.FixedSizeListIterator.FixedSizeListIterator(java.util.ListIterator\u003cE\u003e)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.FixedSizeListIterator.remove()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.FixedSizeListIterator.add(java.lang.Object)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.isFull()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.FixedSizeList.maxSize()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 22)"
      ]
    }
  ]
}