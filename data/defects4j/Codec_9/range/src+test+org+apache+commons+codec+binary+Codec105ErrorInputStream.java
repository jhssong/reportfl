{
  "filepath": "/tmp/Codec-9b/src/test/org/apache/commons/codec/binary/Codec105ErrorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Codec105ErrorInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 32,
      "end_line": 53,
      "comment": "\n * Emits three line-feeds \u0027\\n\u0027 in a row, one at a time, and then EOF.\n * \n * Recreates the bug described in CODEC-105.\n * \n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "countdown"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Codec105ErrorInputStream.read()",
      "begin_line": 37,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 42,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Codec105ErrorInputStream.read(byte[], int, int)",
      "begin_line": 45,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 51,col 9)"
      ]
    }
  ]
}