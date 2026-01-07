{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 36,
      "end_line": 133,
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
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[])",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.close()",
      "begin_line": 99,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 17)",
        "(line 102,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.finish()",
      "begin_line": 109,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 131,col 9)"
      ]
    }
  ]
}