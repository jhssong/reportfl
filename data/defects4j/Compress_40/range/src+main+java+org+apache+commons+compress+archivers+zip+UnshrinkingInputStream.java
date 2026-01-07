{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/UnshrinkingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnshrinkingInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lzw.LZWInputStream"
      ],
      "begin_line": 32,
      "end_line": 127,
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
      "begin_line": 43,
      "end_line": 52,
      "comment": "\n     * IOException is not actually thrown!\n     * \n     * @param inputStream\n     * @throws IOException IOException is not actually thrown!\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 52)",
        "(line 45,col 9)-(line 45,col 40)",
        "(line 46,col 9)-(line 46,col 40)",
        "(line 47,col 9)-(line 47,col 50)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.addEntry(int, byte)",
      "begin_line": 54,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 32)",
        "(line 61,col 9)-(line 61,col 74)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.partialClear()",
      "begin_line": 68,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 63)",
        "(line 70,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnshrinkingInputStream.decompressNextSymbol()",
      "begin_line": 83,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 125,col 9)"
      ]
    }
  ]
}