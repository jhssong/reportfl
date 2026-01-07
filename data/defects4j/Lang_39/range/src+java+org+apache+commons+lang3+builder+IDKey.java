{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/builder/IDKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IDKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 75,
      "comment": "\n * Wrap an identity key (System.identityHashCode()) \n * so that an object can only be equal() to itself.\n * \n * This is necessary to disambiguate the occasional duplicate\n * identityHashCodes that can occur.\n * \n * @author Apache Software Foundation\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.IDKey.IDKey(java.lang.Object)",
      "begin_line": 40,
      "end_line": 47,
      "comment": "\n         * Constructor for IDKey\n         * @param _value\n         ",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 49)",
        "(line 46,col 13)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.IDKey.hashCode()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n         * returns hashcode - i.e. the system identity hashcode.\n         * @return the hashcode\n         ",
      "child_ranges": [
        "(line 55,col 12)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.IDKey.equals(java.lang.Object)",
      "begin_line": 63,
      "end_line": 74,
      "comment": "\n         * checks if instances are equal\n         * @param other\n         * @return if the instances are for the same object\n         ",
      "child_ranges": [
        "(line 65,col 13)-(line 67,col 13)",
        "(line 68,col 13)-(line 68,col 40)",
        "(line 69,col 13)-(line 71,col 13)",
        "(line 73,col 13)-(line 73,col 40)"
      ]
    }
  ]
}