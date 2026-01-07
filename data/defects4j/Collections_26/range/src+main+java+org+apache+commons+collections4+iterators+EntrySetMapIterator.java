{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/EntrySetMapIterator.java",
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
      "end_line": 169,
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
      "end_line": 66,
      "comment": "\n     * Checks to see if there are more entries still to be iterated.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has more elements\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.next()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Gets the next \u003cem\u003ekey\u003c/em\u003e from the \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @return the next key in the iteration\n     * @throws java.util.NoSuchElementException if the iteration is finished\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)",
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.remove()",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n     * Removes the last returned key from the underlying \u003ccode\u003eMap\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method can be called once per call to \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @throws UnsupportedOperationException if remove is not supported by the map\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     * @throws IllegalStateException if \u003ccode\u003eremove()\u003c/code\u003e has already been called\n     *  since the last call to \u003ccode\u003enext()\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 96,col 9)-(line 96,col 20)",
        "(line 97,col 9)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.getKey()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Gets the current key, which is the key returned by the last call\n     * to \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @return the current key\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.getValue()",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\n     * Gets the current value, which is the value associated with the last key\n     * returned by \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @return the current value\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.setValue(V)",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Sets the value associated with the current key.\n     *\n     * @param value  the new value\n     * @return the previous value\n     * @throws UnsupportedOperationException if setValue is not supported by the map\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     * @throws IllegalStateException if \u003ccode\u003eremove()\u003c/code\u003e has been called since the\n     *  last call to \u003ccode\u003enext()\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.reset()",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n     * Resets the state of the iterator.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 45)",
        "(line 152,col 9)-(line 152,col 20)",
        "(line 153,col 9)-(line 153,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EntrySetMapIterator.toString()",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * Gets the iterator as a String.\n     *\n     * @return a string version of the iterator\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 31)"
      ]
    }
  ]
}