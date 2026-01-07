{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 43,
      "end_line": 250,
      "comment": "\n * An input stream that decompresses from the Pack200 format to be read\n * as any other stream.\n * \n * \u003cp\u003eThe {@link CompressorInputStream#getCount getCount} and {@link\n * CompressorInputStream#getBytesRead getBytesRead} methods always\n * return 0.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "originalInput"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamBridge"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory and using the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory and using the given properties.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results and the given properties.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 136,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 142,col 9)-(line 142,col 67)",
        "(line 143,col 9)-(line 143,col 51)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Anonymous-20ce890c-8610-458d-9517-cef641cbdf6e.close()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[])",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[], int, int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.available()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.markSupported()",
      "begin_line": 182,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.mark(int)",
      "begin_line": 191,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.reset()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.skip(long)",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.close()",
      "begin_line": 210,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CAFE_DOOD"
      ],
      "begin_line": 221,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIG_LENGTH"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byte[], int)",
      "begin_line": 237,
      "end_line": 249,
      "comment": "\n     * Checks if the signature matches what is expected for a pack200\n     * file (0xCAFED00D).\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a pack200 compressed stream,\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    }
  ]
}