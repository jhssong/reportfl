{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/UnmodifiableEntrySet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableEntrySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSetDecorator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 38,
      "end_line": 183,
      "comment": "\n * Decorates a map entry \u003ccode\u003eSet\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.unmodifiableEntrySet(java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "\n     * Factory method to create an unmodifiable set of Map Entry objects.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param set  the set to decorate, must not be null\n     * @return a new unmodifiable entry set\n     * @throws NullPointerException if set is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.UnmodifiableEntrySet(java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws NullPointerException if set is null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.add(java.util.Map.Entry\u003cK, V\u003e)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.addAll(java.util.Collection\u003c? extends java.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.clear()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.remove(java.lang.Object)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.iterator()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.toArray()",
      "begin_line": 109,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 53)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.toArray(T[])",
      "begin_line": 119,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)",
        "(line 123,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 45)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 61)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 150,
      "end_line": 165,
      "comment": "\n     * Implementation of an entry set iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.UnmodifiableEntrySetIterator.UnmodifiableEntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.UnmodifiableEntrySetIterator.next()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.UnmodifiableEntrySetIterator.remove()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator\u003cK, V\u003e"
      ],
      "begin_line": 171,
      "end_line": 181,
      "comment": "\n     * Implementation of a map entry that is unmodifiable.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.UnmodifiableEntry.UnmodifiableEntry(java.util.Map.Entry\u003cK, V\u003e)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableEntrySet.UnmodifiableEntry.setValue(V)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 54)"
      ]
    }
  ]
}