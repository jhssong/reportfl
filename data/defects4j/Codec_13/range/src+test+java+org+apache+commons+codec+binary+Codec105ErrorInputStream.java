{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/binary/Codec105ErrorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Codec105ErrorInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 31,
      "end_line": 54,
      "comment": "\n * Emits three line-feeds \u0027\\n\u0027 in a row, one at a time, and then EOF.\n *\n * Recreates the bug described in CODEC-105.\n *\n * @version $Id $\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "countdown"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Codec105ErrorInputStream.read()",
      "begin_line": 36,
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
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 52,col 9)"
      ]
    }
  ]
}