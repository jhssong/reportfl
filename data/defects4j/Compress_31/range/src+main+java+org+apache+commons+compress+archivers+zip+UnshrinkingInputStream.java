{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/zip/UnshrinkingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnshrinkingInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lzw.LZWInputStream"
      ],
      "begin_line": 32,
      "end_line": 119,
      "comment": "\n * Input stream that decompresses ZIP method 1 (unshrinking). A variation of the LZW algorithm, with some twists.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CODE_SIZE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_TABLE_SIZE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isUsed"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.UnshrinkingInputStream(java.io.InputStream)",
      "begin_line": 37,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 52)",
        "(line 39,col 9)-(line 39,col 31)",
        "(line 40,col 9)-(line 40,col 40)",
        "(line 41,col 9)-(line 41,col 46)",
        "(line 42,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 45,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.addEntry(int, byte)",
      "begin_line": 48,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 68)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.partialClear()",
      "begin_line": 60,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 63)",
        "(line 62,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.decompressNextSymbol()",
      "begin_line": 75,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 40)",
        "(line 90,col 9)-(line 117,col 9)"
      ]
    }
  ]
}