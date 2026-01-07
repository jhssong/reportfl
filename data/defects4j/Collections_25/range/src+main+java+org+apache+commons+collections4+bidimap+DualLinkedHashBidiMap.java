{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/bidimap/DualLinkedHashBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DualLinkedHashBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 101,
      "comment": "\n * Implementation of \u003ccode\u003eBidiMap\u003c/code\u003e that uses two \u003ccode\u003eLinkedHashMap\u003c/code\u003e instances.\n * \u003cp\u003e\n * Two \u003ccode\u003eLinkedHashMap\u003c/code\u003e instances are used in this class.\n * This provides fast lookups at the expense of storing two sets of map entries and two linked lists.\n *\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Ensure serialization compatibility "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap.DualLinkedHashBidiMap()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Creates an empty \u003ccode\u003eHashBidiMap\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap.DualLinkedHashBidiMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Constructs a \u003ccode\u003eLinkedHashBidiMap\u003c/code\u003e and copies the mappings from\n     * specified \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @param map the map whose mappings are to be placed in this map\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 68)",
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap.DualLinkedHashBidiMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cV, K\u003e, org.apache.commons.collections4.BidiMap\u003cV, K\u003e)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Constructs a \u003ccode\u003eLinkedHashBidiMap\u003c/code\u003e that decorates the specified maps.\n     *\n     * @param normalMap      the normal direction map\n     * @param reverseMap     the reverse direction map\n     * @param inverseBidiMap the inverse BidiMap\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap.createBidiMap(java.util.Map\u003cV, K\u003e, java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.BidiMap\u003cK, V\u003e)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * Creates a new instance of this object.\n     *\n     * @param normalMap      the normal direction map\n     * @param reverseMap     the reverse direction map\n     * @param inverseBidiMap the inverse BidiMap\n     * @return new bidi map\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)",
        "(line 90,col 9)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 31)",
        "(line 95,col 9)-(line 95,col 46)",
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 98,col 58)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    }
  ]
}