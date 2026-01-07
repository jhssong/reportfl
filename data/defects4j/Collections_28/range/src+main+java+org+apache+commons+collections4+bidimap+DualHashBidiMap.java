{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/bidimap/DualHashBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DualHashBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 107,
      "comment": "\n * Implementation of {@link BidiMap} that uses two {@link HashMap} instances.\n * \u003cp\u003e\n * Two {@link HashMap} instances are used in this class.\n * This provides fast lookups at the expense of storing two sets of map entries.\n * Commons Collections would welcome the addition of a direct hash-based\n * implementation of the {@link BidiMap} interface.\n * \u003cp\u003e\n * NOTE: From Commons Collections 3.1, all subclasses will use {@link HashMap}\n * and the flawed \u003ccode\u003ecreateMap\u003c/code\u003e method is ignored.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Ensure serialization compatibility "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualHashBidiMap.DualHashBidiMap()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Creates an empty \u003ccode\u003eHashBidiMap\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualHashBidiMap.DualHashBidiMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructs a \u003ccode\u003eHashBidiMap\u003c/code\u003e and copies the mappings from\n     * specified \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @param map  the map whose mappings are to be placed in this map\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 56)",
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualHashBidiMap.DualHashBidiMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cV, K\u003e, org.apache.commons.collections4.BidiMap\u003cV, K\u003e)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructs a \u003ccode\u003eHashBidiMap\u003c/code\u003e that decorates the specified maps.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @param inverseBidiMap  the inverse BidiMap\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualHashBidiMap.createBidiMap(java.util.Map\u003cV, K\u003e, java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.BidiMap\u003cK, V\u003e)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Creates a new instance of this object.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @param inverseBidiMap  the inverse BidiMap\n     * @return new bidi map\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualHashBidiMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 33)",
        "(line 95,col 9)-(line 95,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualHashBidiMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 98,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 100,col 40)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 103,col 58)",
        "(line 104,col 9)-(line 104,col 20)"
      ]
    }
  ]
}