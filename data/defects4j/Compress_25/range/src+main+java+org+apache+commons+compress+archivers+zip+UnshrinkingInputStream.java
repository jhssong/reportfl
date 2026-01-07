{
  "filepath": "/tmp/Compress-25b/src/main/java/org/apache/commons/compress/archivers/zip/UnshrinkingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnshrinkingInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream"
      ],
      "begin_line": 31,
      "end_line": 118,
      "comment": "\n * Input stream that decompresses ZIP method 1 (unshrinking). A variation of the LZW algorithm, with some twists.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CODE_SIZE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_TABLE_SIZE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isUsed"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.UnshrinkingInputStream(java.io.InputStream)",
      "begin_line": 36,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 27)",
        "(line 38,col 9)-(line 38,col 31)",
        "(line 39,col 9)-(line 39,col 40)",
        "(line 40,col 9)-(line 40,col 46)",
        "(line 41,col 9)-(line 43,col 9)",
        "(line 44,col 9)-(line 44,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.addEntry(int, byte)",
      "begin_line": 47,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 68)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.partialClear()",
      "begin_line": 59,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 63)",
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.decompressNextSymbol()",
      "begin_line": 74,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 40)",
        "(line 89,col 9)-(line 116,col 9)"
      ]
    }
  ]
}