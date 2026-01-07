{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/zip/UnshrinkingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnshrinkingInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lzw.LZWInputStream"
      ],
      "begin_line": 32,
      "end_line": 121,
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
        "(line 39,col 9)-(line 39,col 40)",
        "(line 40,col 9)-(line 40,col 40)",
        "(line 41,col 9)-(line 41,col 50)",
        "(line 42,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 45,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.addEntry(int, byte)",
      "begin_line": 48,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 32)",
        "(line 55,col 9)-(line 55,col 68)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.partialClear()",
      "begin_line": 62,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 63)",
        "(line 64,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.decompressNextSymbol()",
      "begin_line": 77,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 40)",
        "(line 92,col 9)-(line 119,col 9)"
      ]
    }
  ]
}