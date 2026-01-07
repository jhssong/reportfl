{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/builder/IDKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IDKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 74,
      "comment": "\n * Wrap an identity key (System.identityHashCode()) \n * so that an object can only be equal() to itself.\n * \n * This is necessary to disambiguate the occasional duplicate\n * identityHashCodes that can occur.\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.IDKey.IDKey(java.lang.Object)",
      "begin_line": 39,
      "end_line": 46,
      "comment": "\n         * Constructor for IDKey\n         * @param _value The value\n         ",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 49)",
        "(line 45,col 13)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.IDKey.hashCode()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n         * returns hashcode - i.e. the system identity hashcode.\n         * @return the hashcode\n         ",
      "child_ranges": [
        "(line 54,col 12)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.IDKey.equals(java.lang.Object)",
      "begin_line": 62,
      "end_line": 73,
      "comment": "\n         * checks if instances are equal\n         * @param other The other object to compare to\n         * @return if the instances are for the same object\n         ",
      "child_ranges": [
        "(line 64,col 13)-(line 66,col 13)",
        "(line 67,col 13)-(line 67,col 40)",
        "(line 68,col 13)-(line 70,col 13)",
        "(line 72,col 13)-(line 72,col 40)"
      ]
    }
  ]
}