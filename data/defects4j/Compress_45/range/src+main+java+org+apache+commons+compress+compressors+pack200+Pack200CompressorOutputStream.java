{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 36,
      "end_line": 137,
      "comment": "\n * An output stream that compresses using the Pack200 format.\n * \n * @NotThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalOutput"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamBridge"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory.\n     *\n     * @param out the stream to write to\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results.\n     *\n     * @param out the stream to write to\n     * @param mode the strategy to use\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory and using the given properties.\n     *\n     * @param out the stream to write to\n     * @param props Pack200 properties to use\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     *\n     * @param out the stream to write to\n     * @param mode the strategy to use\n     * @param props Pack200 properties to use\n     * @throws IOException if writing fails\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(int)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[])",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.close()",
      "begin_line": 115,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 17)",
        "(line 118,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.finish()",
      "begin_line": 125,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 135,col 9)"
      ]
    }
  ]
}