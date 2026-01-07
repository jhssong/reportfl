{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/binary/Codec105ErrorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Codec105ErrorInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 31,
      "end_line": 52,
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
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 41,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Codec105ErrorInputStream.read(byte[], int, int)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 19)"
      ]
    }
  ]
}