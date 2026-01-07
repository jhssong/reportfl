{
  "filepath": "/tmp/Lang-42b/src/java/org/apache/commons/lang/IDKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IDKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 72,
      "comment": "\n* Wrap an identity key (System.identityHashCode()) \n* so that an object can only be equal() to itself.\n* \n* This is necessary to disambiguate the occasional duplicate\n* identityHashCodes that can occur.\n*  \n"
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
      "signature": "org.apache.commons.lang.IDKey.IDKey(java.lang.Object)",
      "begin_line": 39,
      "end_line": 46,
      "comment": "\n         * Constructor for IDKey\n         * @param _value\n         ",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 49)",
        "(line 45,col 13)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IDKey.hashCode()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n         * returns hashcode - i.e. the system identity hashcode.\n         * @return the hashcode\n         ",
      "child_ranges": [
        "(line 53,col 12)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IDKey.equals(java.lang.Object)",
      "begin_line": 61,
      "end_line": 71,
      "comment": "\n         * checks if instances are equal\n         * @param other\n         * @return if the instances are for the same object\n         ",
      "child_ranges": [
        "(line 62,col 13)-(line 64,col 13)",
        "(line 65,col 13)-(line 65,col 40)",
        "(line 66,col 13)-(line 68,col 13)",
        "(line 70,col 13)-(line 70,col 40)"
      ]
    }
  ]
}