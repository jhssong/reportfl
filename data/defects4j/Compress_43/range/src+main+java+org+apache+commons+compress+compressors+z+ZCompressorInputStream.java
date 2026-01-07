{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/z/ZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lzw.LZWInputStream"
      ],
      "begin_line": 32,
      "end_line": 171,
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
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.ZCompressorInputStream(java.io.InputStream, int)",
      "begin_line": 41,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 52)",
        "(line 44,col 9)-(line 44,col 51)",
        "(line 45,col 9)-(line 45,col 52)",
        "(line 46,col 9)-(line 46,col 51)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 55)",
        "(line 51,col 9)-(line 51,col 53)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 55)",
        "(line 56,col 9)-(line 56,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.ZCompressorInputStream(java.io.InputStream)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.clearEntries()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.readNextCode()",
      "begin_line": 73,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 46)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.reAlignReading()",
      "begin_line": 82,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 61)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.addEntry(int, byte)",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 52)",
        "(line 106,col 9)-(line 106,col 70)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.decompressNextSymbol()",
      "begin_line": 120,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eThis method is only protected for technical reasons\n     * and is not part of Commons Compress\u0027 published API.  It may\n     * change or disappear without warning.\u003c/strong\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 40)",
        "(line 135,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byte[], int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Checks if the signature matches what is expected for a Unix compress file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a Unix compress compressed\n     * stream, false otherwise\n     * \n     * @since 1.9\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 87)"
      ]
    }
  ]
}