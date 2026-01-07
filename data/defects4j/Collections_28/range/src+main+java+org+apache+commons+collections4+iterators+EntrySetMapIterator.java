{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/EntrySetMapIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EntrySetMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 40,
      "end_line": 176,
      "comment": "\n * Implements a \u003ccode\u003eMapIterator\u003c/code\u003e using a Map entrySet.\n * Reverse iteration is not supported.\n * \u003cpre\u003e\n * MapIterator it \u003d map.mapIterator();\n * while (it.hasNext()) {\n *   Object key \u003d it.next();\n *   Object value \u003d it.getValue();\n *   it.setValue(newValue);\n * }\n * \u003c/pre\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.EntrySetMapIterator(java.util.Map\u003cK, V\u003e)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Constructor.\n     *\n     * @param map  the map to iterate over\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 23)",
        "(line 55,col 9)-(line 55,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.hasNext()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Checks to see if there are more entries still to be iterated.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has more elements\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.next()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Gets the next \u003cem\u003ekey\u003c/em\u003e from the \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @return the next key in the iteration\n     * @throws java.util.NoSuchElementException if the iteration is finished\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)",
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.remove()",
      "begin_line": 93,
      "end_line": 101,
      "comment": "\n     * Removes the last returned key from the underlying \u003ccode\u003eMap\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method can be called once per call to \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @throws UnsupportedOperationException if remove is not supported by the map\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     * @throws IllegalStateException if \u003ccode\u003eremove()\u003c/code\u003e has already been called\n     *  since the last call to \u003ccode\u003enext()\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 26)",
        "(line 99,col 9)-(line 99,col 20)",
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.getKey()",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Gets the current key, which is the key returned by the last call\n     * to \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @return the current key\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.getValue()",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * Gets the current value, which is the value associated with the last key\n     * returned by \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @return the current value\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.setValue(V)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * Sets the value associated with the current key.\n     *\n     * @param value  the new value\n     * @return the previous value\n     * @throws UnsupportedOperationException if setValue is not supported by the map\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     * @throws IllegalStateException if \u003ccode\u003eremove()\u003c/code\u003e has been called since the\n     *  last call to \u003ccode\u003enext()\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.reset()",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Resets the state of the iterator.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 20)",
        "(line 160,col 9)-(line 160,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.toString()",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\n     * Gets the iterator as a String.\n     *\n     * @return a string version of the iterator\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 31)"
      ]
    }
  ]
}