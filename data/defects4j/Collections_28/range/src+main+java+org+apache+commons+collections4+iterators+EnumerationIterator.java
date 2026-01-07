{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/EnumerationIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumerationIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 141,
      "comment": "\n * Adapter to make {@link Enumeration Enumeration} instances appear\n * to be {@link Iterator Iterator} instances.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The collection to remove elements from "
    },
    {
      "type": "field",
      "varNames": [
        "enumeration"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The enumeration being converted "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The last object retrieved "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.EnumerationIterator()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Constructs a new \u003ccode\u003eEnumerationIterator\u003c/code\u003e that will not\n     * function until {@link #setEnumeration(Enumeration)} is called.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.EnumerationIterator(java.util.Enumeration\u003c? extends E\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructs a new \u003ccode\u003eEnumerationIterator\u003c/code\u003e that provides\n     * an iterator view of the given enumeration.\n     *\n     * @param enumeration  the enumeration to use\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.EnumerationIterator(java.util.Enumeration\u003c? extends E\u003e, java.util.Collection\u003c? super E\u003e)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "\n     * Constructs a new \u003ccode\u003eEnumerationIterator\u003c/code\u003e that will remove\n     * elements from the specified collection.\n     *\n     * @param enumeration  the enumeration to use\n     * @param collection  the collection to remove elements from\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 39)",
        "(line 69,col 9)-(line 69,col 37)",
        "(line 70,col 9)-(line 70,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.hasNext()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Returns true if the underlying enumeration has more elements.\n     *\n     * @return true if the underlying enumeration has more elements\n     * @throws NullPointerException  if the underlying enumeration is null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.next()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Returns the next object from the enumeration.\n     *\n     * @return the next object from the enumeration\n     * @throws NullPointerException if the enumeration is null\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.remove()",
      "begin_line": 108,
      "end_line": 119,
      "comment": "\n     * Removes the last retrieved element if a collection is attached.\n     * \u003cp\u003e\n     * Functions if an associated \u003ccode\u003eCollection\u003c/code\u003e is known.\n     * If so, the first occurrence of the last returned object from this\n     * iterator will be removed from the collection.\n     *\n     * @throws IllegalStateException \u003ccode\u003enext()\u003c/code\u003e not called.\n     * @throws UnsupportedOperationException if no associated collection\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.getEnumeration()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns the underlying enumeration.\n     *\n     * @return the underlying enumeration\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EnumerationIterator.setEnumeration(java.util.Enumeration\u003c? extends E\u003e)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Sets the underlying enumeration.\n     *\n     * @param enumeration  the new underlying enumeration\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 39)"
      ]
    }
  ]
}