{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 39,
      "end_line": 253,
      "comment": "\n * An input stream that decompresses from the Pack200 format to be read\n * as any other stream.\n * \n * @NotThreadSafe\n * @since Apache Commons Compress 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "originalInput"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamBridge"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory and using the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory and using the given properties.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results and the given properties.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 132,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 46)",
        "(line 138,col 9)-(line 138,col 67)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Anonymous-56a16fba-0d49-4750-98d8-f1b83ca82084.close()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read()",
      "begin_line": 159,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[])",
      "begin_line": 165,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[], int, int)",
      "begin_line": 171,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.available()",
      "begin_line": 177,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.markSupported()",
      "begin_line": 183,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.mark(int)",
      "begin_line": 193,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.reset()",
      "begin_line": 203,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.skip(long)",
      "begin_line": 209,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.close()",
      "begin_line": 214,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CAFE_DOOD"
      ],
      "begin_line": 225,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byte[], int)",
      "begin_line": 240,
      "end_line": 252,
      "comment": "\n     * Checks if the signature matches what is expected for a pack200\n     * file (0xCAFED00D).\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a pack200 compressed stream,\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    }
  ]
}