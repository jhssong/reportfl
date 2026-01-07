{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/compressors/z/ZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.z._internal_.InternalLZWInputStream"
      ],
      "begin_line": 30,
      "end_line": 152,
      "comment": "\n * Input stream that decompresses .Z files.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_1"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_MODE_MASK"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CODE_SIZE_MASK"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockMode"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeSize"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalCodesRead"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.ZCompressorInputStream(java.io.InputStream)",
      "begin_line": 39,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 27)",
        "(line 41,col 9)-(line 41,col 34)",
        "(line 42,col 9)-(line 42,col 35)",
        "(line 43,col 9)-(line 43,col 34)",
        "(line 44,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 47,col 55)",
        "(line 48,col 9)-(line 48,col 53)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 38)",
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.clearEntries()",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 27)",
        "(line 58,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.readNextCode()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 40)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.reAlignReading()",
      "begin_line": 78,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 61)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.addEntry(int, byte)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 47)",
        "(line 103,col 9)-(line 103,col 64)",
        "(line 104,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.decompressNextSymbol()",
      "begin_line": 117,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 40)",
        "(line 132,col 9)-(line 149,col 9)"
      ]
    }
  ]
}