{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/compressors/z/ZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.z.AbstractLZWInputStream"
      ],
      "begin_line": 29,
      "end_line": 133,
      "comment": "\n * Input stream that decompresses .Z files.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_1"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_MODE_MASK"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CODE_SIZE_MASK"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockMode"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeSize"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalCodesRead"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.ZCompressorInputStream(java.io.InputStream)",
      "begin_line": 38,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 27)",
        "(line 40,col 9)-(line 40,col 34)",
        "(line 41,col 9)-(line 41,col 35)",
        "(line 42,col 9)-(line 42,col 34)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 57)",
        "(line 47,col 9)-(line 47,col 53)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.clearEntries()",
      "begin_line": 55,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.readNextCode()",
      "begin_line": 62,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 40)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.reAlignReading()",
      "begin_line": 71,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 61)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.addEntry(int, byte)",
      "begin_line": 87,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 47)",
        "(line 90,col 9)-(line 90,col 64)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.decompressNextSymbol()",
      "begin_line": 98,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 40)",
        "(line 113,col 9)-(line 130,col 9)"
      ]
    }
  ]
}