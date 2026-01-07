{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/keyvalue/AbstractKeyValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractKeyValue",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 28,
      "end_line": 91,
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
      "end_line": 54,
      "comment": "\n     * Gets the key from the pair.\n     *\n     * @return the key\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.setKey(K)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 31)",
        "(line 58,col 9)-(line 58,col 23)",
        "(line 59,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.getValue()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Gets the value from the pair.\n     *\n     * @return the value\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.setValue(V)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 33)",
        "(line 73,col 9)-(line 73,col 27)",
        "(line 74,col 9)-(line 74,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractKeyValue.toString()",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\n     * Gets a debugging String view of the pair.\n     *\n     * @return a String view of the entry\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 88,col 24)"
      ]
    }
  ]
}