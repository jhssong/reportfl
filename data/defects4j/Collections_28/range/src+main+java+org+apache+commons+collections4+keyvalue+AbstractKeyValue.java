{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/keyvalue/AbstractKeyValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractKeyValue",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 28,
      "end_line": 93,
      "comment": "\n * Abstract pair class to assist with creating \u003ccode\u003eKeyValue\u003c/code\u003e\n * and {@link java.util.Map.Entry Map.Entry} implementations.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The key "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The value "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.AbstractKeyValue(K, V)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * Constructs a new pair with the specified key and given value.\n     *\n     * @param key  the key for the entry, may be null\n     * @param value  the value for the entry, may be null\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)",
        "(line 43,col 9)-(line 43,col 23)",
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.getKey()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Gets the key from the pair.\n     *\n     * @return the key\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.setKey(K)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 31)",
        "(line 59,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.getValue()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Gets the value from the pair.\n     *\n     * @return the value\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.setValue(V)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.toString()",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Gets a debugging String view of the pair.\n     *\n     * @return a String view of the entry\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 90,col 24)"
      ]
    }
  ]
}