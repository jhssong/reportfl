{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 37,
      "end_line": 130,
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
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Compresses the given stream, caching the compressed data in\n     * memory and using the given properties.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.Pack200CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 76,
      "end_line": 83,
      "comment": "\n     * Compresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)",
        "(line 81,col 9)-(line 81,col 46)",
        "(line 82,col 9)-(line 82,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(int)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[])",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.close()",
      "begin_line": 100,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 17)",
        "(line 103,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream.finish()",
      "begin_line": 110,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 128,col 9)"
      ]
    }
  ]
}