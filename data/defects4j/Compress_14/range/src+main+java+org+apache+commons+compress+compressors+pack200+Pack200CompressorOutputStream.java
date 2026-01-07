{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 36,
      "end_line": 140,
      "comment": "\n * An output stream that compresses using the Pack200 format.\n * \n * @NotThreadSafe\n * @since Apache Commons Compress 1.3\n "
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
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory and using the given properties.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 75,
      "end_line": 82,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)",
        "(line 80,col 9)-(line 80,col 46)",
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(int)",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[])",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.close()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 17)",
        "(line 109,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.finish()",
      "begin_line": 116,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 138,col 9)"
      ]
    }
  ]
}