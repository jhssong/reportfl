{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/compressors/z/ZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lzw.LZWInputStream"
      ],
      "begin_line": 32,
      "end_line": 169,
      "comment": "\n * Input stream that decompresses .Z files.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_MODE_MASK"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CODE_SIZE_MASK"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockMode"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeSize"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalCodesRead"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.ZCompressorInputStream(java.io.InputStream)",
      "begin_line": 41,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 52)",
        "(line 43,col 9)-(line 43,col 45)",
        "(line 44,col 9)-(line 44,col 46)",
        "(line 45,col 9)-(line 45,col 45)",
        "(line 46,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 55)",
        "(line 50,col 9)-(line 50,col 53)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 38)",
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.clearEntries()",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)",
        "(line 60,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.readNextCode()",
      "begin_line": 71,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 40)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.reAlignReading()",
      "begin_line": 80,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.addEntry(int, byte)",
      "begin_line": 101,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 47)",
        "(line 104,col 9)-(line 104,col 64)",
        "(line 105,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.decompressNextSymbol()",
      "begin_line": 118,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 40)",
        "(line 133,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byte[], int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Checks if the signature matches what is expected for a Unix compress file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a Unix compress compressed\n     * stream, false otherwise\n     * \n     * @since 1.9\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 87)"
      ]
    }
  ]
}