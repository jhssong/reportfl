{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/compressors/pack200/StreamBridge.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StreamBridge",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 34,
      "end_line": 75,
      "comment": "\n * Provides an InputStream to read all data written to this\n * OutputStream.\n *\n * @ThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INPUT_LOCK"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.StreamBridge.StreamBridge(java.io.OutputStream)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.StreamBridge.StreamBridge()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.StreamBridge.getInput()",
      "begin_line": 49,
      "end_line": 56,
      "comment": "\n     * Provides the input view.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.StreamBridge.getInputView()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Creates the input view.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.StreamBridge.stop()",
      "begin_line": 66,
      "end_line": 74,
      "comment": "\n     * Closes input and output and releases all associated resources.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 73,col 9)"
      ]
    }
  ]
}