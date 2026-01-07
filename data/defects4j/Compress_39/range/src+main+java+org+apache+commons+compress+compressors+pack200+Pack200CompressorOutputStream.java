{
  "filepath": "/tmp/Compress-39b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 37,
      "end_line": 146,
      "comment": "\n * An output stream that compresses using the Pack200 format.\n * \n * @NotThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalOutput"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamBridge"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory.\n     *\n     * @param out the stream to write to\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results.\n     *\n     * @param out the stream to write to\n     * @param mode the strategy to use\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory and using the given properties.\n     *\n     * @param out the stream to write to\n     * @param props Pack200 properties to use\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     *\n     * @param out the stream to write to\n     * @param mode the strategy to use\n     * @param props Pack200 properties to use\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 29)",
        "(line 97,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 98,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(int)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[])",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.close()",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 17)",
        "(line 119,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.finish()",
      "begin_line": 126,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 144,col 9)"
      ]
    }
  ]
}