{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/set/MapBackedSet.java",
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
      "end_line": 179,
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
      "end_line": 99,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.isEmpty()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.iterator()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.contains(java.lang.Object)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.add(E)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 33)",
        "(line 125,col 9)-(line 125,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 128,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.remove(java.lang.Object)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 24)",
        "(line 141,col 9)-(line 141,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.clear()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.toArray()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.toArray(T[])",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.equals(java.lang.Object)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.MapBackedSet.hashCode()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 39)"
      ]
    }
  ]
}