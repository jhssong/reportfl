{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/keyvalue/AbstractMapEntryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapEntryTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 154,
      "comment": "\n * Abstract tests that can be extended to test any Map.Entry implementation.\n * Subclasses must implement {@link #makeMapEntry(Object, Object)} to return\n * a new Map.Entry of the type being tested. Subclasses must also implement\n * {@link #testConstructors()} to test the constructors of the Map.Entry\n * type being tested.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.makeMapEntry()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Make an instance of Map.Entry with the default (null) key and value.\n     * This implementation simply calls {@link #makeMapEntry(Object, Object)}\n     * with null for key and value. Subclasses can override this method if desired.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.makeMapEntry(K, V)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Make an instance of Map.Entry with the specified key and value.\n     * Subclasses should override this method to return a Map.Entry\n     * of the type being tested.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.makeKnownMapEntry()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Makes a Map.Entry of a type that\u0027s known to work correctly.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.makeKnownMapEntry(K, V)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "\n     * Makes a Map.Entry of a type that\u0027s known to work correctly.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 51)",
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 71)",
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.testAccessorsAndMutators()",
      "begin_line": 74,
      "end_line": 89,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 65)",
        "(line 78,col 9)-(line 78,col 42)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 46)",
        "(line 84,col 9)-(line 84,col 41)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 87,col 9)-(line 87,col 29)",
        "(line 88,col 9)-(line 88,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.testSelfReferenceHandling()",
      "begin_line": 98,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 53)",
        "(line 106,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.testConstructors()",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Subclasses should provide tests for their constructors.\n     *\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.testEqualsAndHashCode()",
      "begin_line": 123,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 62)",
        "(line 127,col 9)-(line 127,col 67)",
        "(line 129,col 9)-(line 129,col 34)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 51)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 136,col 33)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryTest.testToString()",
      "begin_line": 144,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 65)",
        "(line 147,col 9)-(line 147,col 85)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 151,col 9)-(line 151,col 85)"
      ]
    }
  ]
}