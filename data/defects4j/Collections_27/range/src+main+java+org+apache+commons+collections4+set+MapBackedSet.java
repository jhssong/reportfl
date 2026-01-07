{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/set/MapBackedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapBackedSet",
      "is_interface": false,
      "parent_types": [
        "java.util.Set\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 166,
      "comment": "\n * Decorates a \u003ccode\u003eMap\u003c/code\u003e to obtain \u003ccode\u003eSet\u003c/code\u003e behaviour.\n * \u003cp\u003e\n * This class is used to create a \u003ccode\u003eSet\u003c/code\u003e with the same properties as\n * the key set of any map. Thus, a ReferenceSet can be created by wrapping a\n * \u003ccode\u003eReferenceMap\u003c/code\u003e in an instance of this class.\n * \u003cp\u003e\n * Most map implementation can be used to create a set by passing in dummy values.\n * Exceptions include \u003ccode\u003eBidiMap\u003c/code\u003e implementations, as they require unique values.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The map being used as the backing store "
    },
    {
      "type": "field",
      "varNames": [
        "dummyValue"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The dummyValue to use "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.mapBackedSet(java.util.Map\u003cE, ? super V\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Factory method to create a set from a map.\n     *\n     * @param \u003cE\u003e the element type\n     * @param \u003cV\u003e the dummy value type in the map\n     * @param map  the map to decorate, must not be null\n     * @return a new map backed set\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.mapBackedSet(java.util.Map\u003cE, ? super V\u003e, V)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Factory method to create a set from a map.\n     *\n     * @param \u003cE\u003e the element type\n     * @param \u003cV\u003e the dummy value type in the map\n     * @param map  the map to decorate, must not be null\n     * @param dummyValue  the dummy value to use\n     * @return a new map backed set\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.MapBackedSet(java.util.Map\u003cE, ? super V\u003e, V)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param dummyValue  the dummy value to use\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 16)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 92,col 9)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.size()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.isEmpty()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.iterator()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.contains(java.lang.Object)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.add(E)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 119,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 122,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.remove(java.lang.Object)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 133,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.clear()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.toArray()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.toArray(T[])",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.equals(java.lang.Object)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.hashCode()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 39)"
      ]
    }
  ]
}